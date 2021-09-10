package com.example.ufrb_problemas.viewModel.request

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ufrb_problemas.model.data.Request
import com.example.ufrb_problemas.utils.GenerateData
import kotlin.random.Random

class RequestViewModel: ViewModel() {
    private val _requests = MutableLiveData<List<Request>>()
    val requests: LiveData<List<Request>>
        get() = _requests

    init {
        val requests = arrayListOf<Request>()
        for(i in 0..Random(20).nextInt(5, 20)) {
            requests.add(GenerateData.generateRequest())
        }
        Log.e("requestViewModel", requests.toString())
        _requests.value = requests

    }
}