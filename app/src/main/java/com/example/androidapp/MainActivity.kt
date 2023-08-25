package com.example.androidapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModelProvider
import com.example.androidapp.ui.theme.AndroidAppTheme
import com.example.composedemo.biblioteka.Biblioteka
import com.example.composedemo.libraryintervali.LibraryIntervali
import com.example.composedemo.librarytrezvucha.LibraryTrezvucha
import com.example.composedemo.lybraryseptakkordi.LybrarySeptakkordi

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        setContent {
            AndroidAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Start(viewModel)
                }
            }
        }
    }
}

@Composable
fun Start( ViewModel : MainViewModel){
    val ScrNum = ViewModel.ScreenNum.observeAsState(0)

    if (ScrNum.value == 0) {
        Biblioteka(
            onBibliotekaTapped = {},
            onTestiTapped = {},
            onSeptakkordiTapped = {ViewModel.setScreenNum(1)},
            onTrezvuchiaTapped = {ViewModel.setScreenNum(2)},
            onIntervaliTapped = {ViewModel.setScreenNum(3)})
    } else if (ScrNum.value == 1) {
        LybrarySeptakkordi()
    } else if (ScrNum.value == 2) {
        LibraryTrezvucha()
    } else if (ScrNum.value == 3) {
        LibraryIntervali()
    }
}