package com.devil.premises.newsapp.ui

import androidx.lifecycle.ViewModel
import com.devil.premises.newsapp.repository.NewsRepository

class NewsViewModel(
    val newsRepository: NewsRepository
):ViewModel() {
}