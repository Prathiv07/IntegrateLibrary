package com.kobil.integratelibrary

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.lifecycle.lifecycleScope
import com.kobil.integratelibrary.ui.theme.IntegrateLibraryTheme
import com.kobil.matrixgettingstartedkmm.android.MatrixGettingStartedKMMApp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            IntegrateLibraryTheme {
                Scaffold { innerPadding ->
                    Box(
                        modifier =
                        Modifier
                            .padding(innerPadding)
                            .fillMaxSize()
                    ) {
                        MatrixGettingStartedKMMApp(
                            lifecycleScope = lifecycleScope,
                            context = this@MainActivity
                        )
                    }
                }
            }
        }
    }
}

