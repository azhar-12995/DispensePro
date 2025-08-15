package com.mtbc.dispensepro.lessons

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mtbc.dispensepro.authentication.AuthRepository
import com.mtbc.dispensepro.firestore.FirestoreRepository
import com.mtbc.dispensepro.model.Lesson
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

    private val _lessons = MutableStateFlow<Resource<List<Lesson>>>(Resource.Loading())
    val lessons: StateFlow<Resource<List<Lesson>>> = _lessons.asStateFlow()

    fun addLessons(lessons: List<Lesson>) {
        viewModelScope.launch {
            _lessons.value = Resource.Loading()
           repository.addLessons(lessons)
        }
    }

    fun getAllLessons() {
        viewModelScope.launch {
            _lessons.value = Resource.Loading()
           repository.getAllLessons().collect() { result ->
                _lessons.value = result
            }
        }
    }



}