package com.app_knit.base.repository.networkrequest

import retrofit2.Response

/**
 * Created by ShrayChona on 03-10-2018.
 */
interface NetworkRequestCallbacks {

    fun onSuccess(response: Response<*>)

    fun onError(t: Throwable)

}