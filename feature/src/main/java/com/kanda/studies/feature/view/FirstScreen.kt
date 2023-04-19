package com.kanda.studies.feature.view

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun FirstScreen(viewModel: FirstViewModel = viewModel()) {

    val state by viewModel.countries.collectAsState(emptyList())
    Text("Hello number countries ${state.size}")
}