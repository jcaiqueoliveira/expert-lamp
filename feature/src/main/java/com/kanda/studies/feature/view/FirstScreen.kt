package com.kanda.studies.feature.view

import android.util.Log
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun FirstScreen(viewModel: FirstViewModel = viewModel()) {

    val state by viewModel.models.collectAsState()
    Log.e("state", state.toString())
    when {
        state.loading -> {
            Text("Loading")
        }

        state.countries.isNotEmpty() -> {
            Text("Hello number countries ${state.countries.size}")
        }
    }
}