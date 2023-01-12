package com.example.playstore.store.ui.viewModel

import androidx.lifecycle.ViewModel
import com.example.playstore.store.repo.StoreRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class StoreViewModel @Inject constructor(
    private val repository: StoreRepository,
) : ViewModel() {
}