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
import com.example.androidapp.bolsekint.BolSekInt
import com.example.androidapp.bolseptint.BolSeptInt
import com.example.androidapp.bolsextaint.BolSextaInt
import com.example.androidapp.boltercint.BolTercInt
import com.example.androidapp.kvartaint.KvartaInt
import com.example.androidapp.kvintaint.KvintaInt
import com.example.androidapp.libraryintervali.LibraryIntervali
import com.example.androidapp.librarytrezvucha.LibraryTrezvucha
import com.example.androidapp.lybraryseptakkordi.LybrarySeptakkordi
import com.example.androidapp.makseptint.MakSeptInt
import com.example.androidapp.malsekint.MalSekInt
import com.example.androidapp.malsextaint.MalSextaInt
import com.example.androidapp.maltercint.MalTercInt
import com.example.androidapp.oktava.Oktava
import com.example.androidapp.primaint.PrimaInt
import com.example.androidapp.test.Test
import com.example.androidapp.tests.Tests
import com.example.androidapp.tritonint.TritonInt

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
        LibraryIntervali(onBattonbackTapped = {ViewModel.setScreenNum(0)},
            onPrimaTapped = {ViewModel.setScreenNum(11)},
            onMalayaSecTapped = {ViewModel.setScreenNum(12)},
            onBolSecTapped = {ViewModel.setScreenNum(13)},
            onMalTercTapped = {ViewModel.setScreenNum(14)},
            onBolTercTapped = {ViewModel.setScreenNum(15)},
            onKvartaTapped = {ViewModel.setScreenNum(16)},
            onTritonTapped = {ViewModel.setScreenNum(17)},
            onKvintaTapped = {ViewModel.setScreenNum(18)},
            onMalSextaTapped = {ViewModel.setScreenNum(19)},
            onBolSextaTapped = {ViewModel.setScreenNum(20)},
            onMalSeptTapped = {ViewModel.setScreenNum(21)},
            onBolSeptTapped = {ViewModel.setScreenNum(22)},
            onOktavaTapped = {ViewModel.setScreenNum(23)})
    } else if (ScrNum.value == 4){
        Tests(
            onLibrarymenuTapped = {ViewModel.setScreenNum(0)},
            onTestsmenuTapped = {},
            onSeptakkorditestTapped = {ViewModel.setScreenNum(5)},
            onTrezvuchiatestTapped = {ViewModel.setScreenNum(5)},
            onIntervalitestTapped = {ViewModel.setScreenNum(5)})
    } else if (ScrNum.value == 5){
        Test(onButtonBackTapped = {ViewModel.setScreenNum(4)})
    }else if (ScrNum.value == 11){
        PrimaInt(onButtonBackTapped = {ViewModel.setScreenNum(4)})
    }else if (ScrNum.value == 12){
        MalSekInt(onButtonBackTapped = {ViewModel.setScreenNum(4)})
    }else if (ScrNum.value == 13){
        BolSekInt(onButtonBackTapped = {ViewModel.setScreenNum(4)})
    }else if (ScrNum.value == 14){
        MalTercInt(onButtonBackTapped = {ViewModel.setScreenNum(4)})
    }else if (ScrNum.value == 15){
        BolTercInt(onButtonBackTapped = {ViewModel.setScreenNum(4)})
    }else if (ScrNum.value == 16){
        KvartaInt(onButtonBackTapped = {ViewModel.setScreenNum(4)})
    }else if (ScrNum.value == 17){
        TritonInt(onButtonBackTapped = {ViewModel.setScreenNum(4)})
    }else if (ScrNum.value == 18){
        KvintaInt(onButtonBackTapped = {ViewModel.setScreenNum(4)})
    }else if (ScrNum.value == 19){
        MalSextaInt(onButtonBackTapped = {ViewModel.setScreenNum(4)})
    }else if (ScrNum.value == 20){
        BolSextaInt(onButtonBackTapped = {ViewModel.setScreenNum(4)})
    }else if (ScrNum.value == 21){
        MakSeptInt(onButtonBackTapped = {ViewModel.setScreenNum(4)})
    }else if (ScrNum.value == 22){
        BolSeptInt(onButtonBackTapped = {ViewModel.setScreenNum(4)})
    }else if (ScrNum.value == 23){
        Oktava(onButtonBackTapped = {ViewModel.setScreenNum(4)})
    }
}