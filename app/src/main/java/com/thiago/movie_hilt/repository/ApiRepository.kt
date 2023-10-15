package com.thiago.movie_hilt.repository

import com.thiago.movie_hilt.api.ApiServices
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class ApiRepository @Inject constructor(
    private val apiServices: ApiServices,
) {
    fun getPopularMoviesList(page: Int) = apiServices.getPopularMoviesList(page)
    fun getMovieDetails(id: Int) = apiServices.getMovieDetails(id)
}