package com.mtbc.dispensepro.lessons

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mtbc.dispensepro.firestore.FirestoreRepository
import com.mtbc.dispensepro.model.Lesson
import com.mtbc.dispensepro.model.RegisteredLessons
import com.mtbc.dispensepro.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LessonsViewModel @Inject constructor(
    private val repository: FirestoreRepository
) : ViewModel() {

    private val _lessons = MutableStateFlow<Resource<List<Lesson>>>(Resource.Idle)
    val lessons: StateFlow<Resource<List<Lesson>>> = _lessons.asStateFlow()
    val _registerCourse = MutableStateFlow<Resource<String>>(Resource.Idle)
    val registerCourse: StateFlow<Resource<String>> = _registerCourse.asStateFlow()

    private val _isRegistered = MutableStateFlow<Resource<Boolean>>(Resource.Idle)
    val isRegistered: StateFlow<Resource<Boolean>> = _isRegistered.asStateFlow()


    private val _registeredLessons = MutableStateFlow<Resource<List<RegisteredLessons>>>(Resource.Idle)
    val registeredLessons: StateFlow<Resource<List<RegisteredLessons>>> = _registeredLessons


    fun addLessons(lessons: List<Lesson>) {
        viewModelScope.launch {
            _lessons.value = Resource.Loading
            repository.addLessons(lessons)
        }
    }

    fun getAllLessons() {
        viewModelScope.launch {
            _lessons.value = Resource.Loading
            repository.getAllLessons().collect() { result ->
                _lessons.value = result
            }
        }
    }

    fun registerCourse(uId: String, registeredCourse: RegisteredLessons) {
        viewModelScope.launch {
            _registerCourse.value = Resource.Loading
            _registerCourse.value = repository.registerLesson(uId, registeredCourse)
        }
    }

    fun isCourseRegister(uId: String, lessonId: String) {
        viewModelScope.launch {
            _isRegistered.value = Resource.Loading
            _isRegistered.value = repository.isLessonRegistered(uId, lessonId)


        }
    }

    fun getAllRegisteredLessons(uid: String) {
        viewModelScope.launch {
            _registeredLessons.value = Resource.Loading

            val result = repository.getAllRegisteredLessons(uid)

            _registeredLessons.value = result
        }
    }


}