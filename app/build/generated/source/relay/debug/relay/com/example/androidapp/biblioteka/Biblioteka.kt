package com.example.androidapp.biblioteka

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.androidapp.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * Bible
 *
 * This composable was generated from the UI Package 'biblioteka'.
 * Generated code; do not edit directly
 */
@Composable
fun Biblioteka(
    modifier: Modifier = Modifier,
    onBibliotekaTapped: () -> Unit = {},
    onTestiTapped: () -> Unit = {},
    onSeptakkordiTapped: () -> Unit = {},
    onTrezvuchiaTapped: () -> Unit = {},
    onIntervaliTapped: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        BibliotekaMenu(
            onBibliotekaTapped = onBibliotekaTapped,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 566.0.dp
                )
            )
        ) {
            LibraryRectMenu()
            LibraryLogo(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 53.0.dp,
                        y = 0.0.dp
                    )
                )
            )
        }
        Testi(
            onTestiTapped = onTestiTapped,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 180.0.dp,
                    y = 566.0.dp
                )
            )
        ) {
            TestRectMenu(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            TestLogo(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Biblioteka1()
        Septakkordi(
            onSeptakkordiTapped = onSeptakkordiTapped,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 205.0.dp,
                    y = 116.0.dp
                )
            )
        ) {
            SeptRect()
            SeptakkordiText(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 11.0.dp
                    )
                )
            )
        }
        Trezvuchia(
            onTrezvuchiaTapped = onTrezvuchiaTapped,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 25.0.dp,
                    y = 116.0.dp
                )
            )
        ) {
            TrezvRect()
            TrezvuchiaText(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 9.0.dp
                    )
                )
            )
        }
        Intervali(
            onIntervaliTapped = onIntervaliTapped,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 115.0.dp,
                    y = 309.0.dp
                )
            )
        ) {
            IntRect(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            IntervaliText(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Preview(widthDp = 360, heightDp = 640)
@Composable
private fun BibliotekaPreview() {
    MaterialTheme {
        RelayContainer {
            Biblioteka(
                onBibliotekaTapped = {},
                onTestiTapped = {},
                onSeptakkordiTapped = {},
                onTrezvuchiaTapped = {},
                onIntervaliTapped = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun LibraryRectMenu(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.biblioteka_library_rect_menu),
        modifier = modifier.requiredWidth(180.0.dp).requiredHeight(74.0.dp)
    )
}

@Composable
fun LibraryLogo(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.biblioteka_library_logo),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(74.0.dp).requiredHeight(74.0.dp)
    )
}

@Composable
fun BibliotekaMenu(
    onBibliotekaTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.tappable(onTap = onBibliotekaTapped).requiredWidth(180.0.dp).requiredHeight(74.0.dp)
    )
}

@Composable
fun TestRectMenu(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.biblioteka_test_rect_menu),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TestLogo(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.biblioteka_test_logo),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 58.0.dp,
                top = 0.0.dp,
                end = 58.136993408203125.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Testi(
    onTestiTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.tappable(onTap = onTestiTapped).requiredWidth(180.0.dp).requiredHeight(74.0.dp)
    )
}

@Composable
fun Biblioteka1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Библиотека",
        fontSize = 32.0.sp,
        fontFamily = hachiMaruPop,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.4479999542236328.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(360.0.dp).requiredHeight(53.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun SeptRect(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.biblioteka_sept_rect),
        modifier = modifier.requiredWidth(130.0.dp).requiredHeight(130.0.dp)
    )
}

@Composable
fun SeptakkordiText(modifier: Modifier = Modifier) {
    RelayText(
        content = "Септаккорды",
        fontSize = 11.0.sp,
        fontFamily = hachiMaruPop,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.4479999542236328.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(130.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Septakkordi(
    onSeptakkordiTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.tappable(onTap = onSeptakkordiTapped).requiredWidth(130.0.dp).requiredHeight(130.0.dp)
    )
}

@Composable
fun TrezvRect(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.biblioteka_trezv_rect),
        modifier = modifier.requiredWidth(130.0.dp).requiredHeight(130.0.dp)
    )
}

@Composable
fun TrezvuchiaText(modifier: Modifier = Modifier) {
    RelayText(
        content = "Трезвучия",
        fontFamily = hachiMaruPop,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.4479999542236328.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(130.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Trezvuchia(
    onTrezvuchiaTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.tappable(onTap = onTrezvuchiaTapped).requiredWidth(130.0.dp).requiredHeight(130.0.dp)
    )
}

@Composable
fun IntRect(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.biblioteka_int_rect),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun IntervaliText(modifier: Modifier = Modifier) {
    RelayText(
        content = "Интервалы",
        fontFamily = hachiMaruPop,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.4479999542236328.em,
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 10.0.dp,
                end = 0.0.dp,
                bottom = 100.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Intervali(
    onIntervaliTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.tappable(onTap = onIntervaliTapped).requiredWidth(130.0.dp).requiredHeight(130.0.dp)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
