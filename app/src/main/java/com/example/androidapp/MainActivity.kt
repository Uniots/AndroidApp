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
import com.example.androidapp.biblioteka.Biblioteka
import com.example.androidapp.libraryintervali.LibraryIntervali
import com.example.androidapp.librarytrezvucha.LibraryTrezvucha
import com.example.androidapp.lybraryseptakkordi.LybrarySeptakkordi
import com.example.androidapp.test.Test
import com.example.androidapp.tests.Tests

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
            onTestiTapped = {ViewModel.setScreenNum(4)},
            onSeptakkordiTapped = {ViewModel.setScreenNum(1)},
            onTrezvuchiaTapped = {ViewModel.setScreenNum(2)},
            onIntervaliTapped = {ViewModel.setScreenNum(3)})
    } else if (ScrNum.value == 1) {
        LybrarySeptakkordi(onButtonbackTapped = {ViewModel.setScreenNum(0)})
    } else if (ScrNum.value == 2) {
        LibraryTrezvucha(onButtonendTapped = {ViewModel.setScreenNum(0)})
    } else if (ScrNum.value == 3) {
        LibraryIntervali(onBattonbackTapped = {ViewModel.setScreenNum(0)})
    } else if (ScrNum.value == 4){
        Tests(
            onLibrarymenuTapped = {ViewModel.setScreenNum(0)},
            onTestsmenuTapped = {},
            onSeptakkorditestTapped = {ViewModel.setScreenNum(5)},
            onTrezvuchiatestTapped = {ViewModel.setScreenNum(5)},
            onIntervalitestTapped = {ViewModel.setScreenNum(5)})
    } else if (ScrNum.value == 5){
        Test(onButtonBackTapped = {ViewModel.setScreenNum(4)})
    }
}