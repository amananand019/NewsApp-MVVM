package com.devil.premises.newsapp.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.devil.premises.newsapp.R
import com.devil.premises.newsapp.ui.NewsActivity
import com.devil.premises.newsapp.ui.NewsViewModel
import com.devil.premises.newsapp.ui.NewsViewModelProviderFactory

class BreakingNewsFragment: Fragment(R.layout.fragment_breaking_news) {

    lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsActivity).viewModel
    }
}