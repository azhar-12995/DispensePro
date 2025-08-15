package com.mtbc.dispensepro.firestore

import com.google.firebase.firestore.FirebaseFirestore
import com.mtbc.dispensepro.model.Lesson
import com.mtbc.dispensepro.users.model.User
import com.mtbc.dispensepro.utils.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FirestoreRepository @Inject constructor(
    private val firestore: FirebaseFirestore
) {

    private val dispenseCollection = firestore.collection("DispensePro")

    fun getAllLessons(): Flow<Resource<List<Lesson>>> = callbackFlow {
        val lessonsCollection = dispenseCollection
            .document("Lessons")
            .collection("Lesson")  // matches addLessons()

        val listener = lessonsCollection.addSnapshotListener { snapshot, error ->
            if (error != null) {
                trySend(Resource.Error(error.message ?: "Unknown error"))
                return@addSnapshotListener
            }

            val lessons = snapshot?.toObjects(Lesson::class.java) ?: emptyList()
            trySend(Resource.Success(lessons))
        }

        awaitClose { listener.remove() }
    }


    suspend fun addLessons(lessons: List<Lesson>): Resource<Unit> = withContext(Dispatchers.IO) {
        try {
            val lessonsRef = dispenseCollection
                .document("Lessons")
                .collection("Lesson")

            lessons.forEach { lesson ->
                lessonsRef.document(lesson.id.toString())
                    .set(lesson)
                    .await()
            }

            Resource.Success(Unit)
        } catch (e: Exception) {
            Resource.Error(e.message ?: "Failed to add lessons")
        }
    }

//    suspend fun deleteAppointment(userId: String, appointmentId: String): Resource<Unit> = withContext(
//        Dispatchers.IO) {
//        return@withContext try {
//            appointmentsCollection
//                .document("Appointments")
//                .collection(userId.toString())
//                .document(appointmentId.toString())
//                .delete().await()
//            Resource.Success(Unit)
//        } catch (e: Exception) {
//            Resource.Error(e.message ?: "Delete failed")
//        }
//    }

//    suspend fun updateAppointment(appointment: Appointment): Resource<Unit> = withContext(
//        Dispatchers.IO) {
//        return@withContext try {
//            appointmentsCollection.document(appointment.id.toString()).set(appointment).await()
//            Resource.Success(Unit)
//        } catch (e: Exception) {
//            Resource.Error(e.message ?: "Update failed")
//        }
//    }

    suspend fun addUser(user: User): Resource<Unit> = withContext(Dispatchers.IO) {
        return@withContext try {
            dispenseCollection
                .document("Users")
                .collection(user.id.toString())
                .document("UserDetails")
                .set(user)
                .await()
            Resource.Success(Unit)
        } catch (e: Exception) {
            Resource.Error(e.message ?: "Failed to add user")
        }
    }
    fun getUser(userId: String): Flow<Resource<User>> = callbackFlow {
        val userDocRef = dispenseCollection
            .document("Users")
            .collection(userId)
            .document("UserDetails")

        val listener = userDocRef.addSnapshotListener { snapshot, error ->
            if (error != null) {
                trySend(Resource.Error(error.message ?: "Unknown error"))
                return@addSnapshotListener
            }

            val user = snapshot?.toObject(User::class.java)
            if (user != null) {
                trySend(Resource.Success(user))
            } else {
                trySend(Resource.Error("User not found"))
            }
        }

        awaitClose { listener.remove() }
    }


}
