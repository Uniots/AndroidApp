package com.example.androidapp.tests

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
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
 * tests
 *
 * This composable was generated from the UI Package 'tests'.
 * Generated code; do not edit directly
 */
@Composable
fun Tests(
    modifier: Modifier = Modifier,
    onLibrarymenuTapped: () -> Unit = {},
    onTestsmenuTapped: () -> Unit = {},
    onSeptakkorditestTapped: () -> Unit = {},
    onTrezvuchiatestTapped: () -> Unit = {},
    onIntervalitestTapped: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        LibraryMenu(
            onLibrarymenuTapped = onLibrarymenuTapped,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 566.0.dp
                )
            )
        ) {
            Rectangle1()
            Pngwing1(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 53.0.dp,
                        y = 0.0.dp
                    )
                )
            )
        }
        TestsMenu(
            onTestsmenuTapped = onTestsmenuTapped,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 180.0.dp,
                    y = 566.0.dp
                )
            )
        ) {
            Rectangle2()
            Pngwing2(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 58.0.dp,
                        y = 0.0.dp
                    )
                )
            )
        }
        TestsHead()
        SeptakkordiTest(
            onSeptakkorditestTapped = onSeptakkorditestTapped,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 205.0.dp,
                    y = 116.0.dp
                )
            )
        ) {
            Rectangle4()
            SeptakkprdiText(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 10.0.dp
                    )
                )
            )
        }
        TrezvuchiaTest(
            onTrezvuchiatestTapped = onTrezvuchiatestTapped,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 25.0.dp,
                    y = 116.0.dp
                )
            )
        ) {
            Rectangle3()
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
        IntervaliTest(
            onIntervalitestTapped = onIntervalitestTapped,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 115.0.dp,
                    y = 309.0.dp
                )
            )
        ) {
            Rectangle5()
            IntervaliText(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 10.0.dp
                    )
                )
            )
        }
    }
}

@Preview(widthDp = 360, heightDp = 640)
@Composable
private fun TestsPreview() {
    MaterialTheme {
        RelayContainer {
            Tests(
                onLibrarymenuTapped = {},
                onTestsmenuTapped = {},
                onSeptakkorditestTapped = {},
                onTrezvuchiatestTapped = {},
                onIntervalitestTapped = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Rectangle1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.tests_rectangle_1),
        modifier = modifier.requiredWidth(180.0.dp).requiredHeight(74.0.dp)
    )
}

@Composable
fun Pngwing1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.tests_pngwing_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(74.0.dp).requiredHeight(74.0.dp)
    )
}

@Composable
fun LibraryMenu(
    onLibrarymenuTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.tappable(onTap = onLibrarymenuTapped).requiredWidth(180.0.dp).requiredHeight(74.0.dp)
    )
}

@Composable
fun Rectangle2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.tests_rectangle_2),
        modifier = modifier.requiredWidth(180.0.dp).requiredHeight(74.0.dp)
    )
}

@Composable
fun Pngwing2(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.tests_pngwing_2),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(63.863037109375.dp).requiredHeight(74.0.dp)
    )
}

@Composable
fun TestsMenu(
    onTestsmenuTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.tappable(onTap = onTestsmenuTapped).requiredWidth(180.0.dp).requiredHeight(74.0.dp)
    )
}

@Composable
fun TestsHead(modifier: Modifier = Modifier) {
    RelayText(
        content = "Тесты",
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
fun Rectangle4(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.tests_rectangle_4),
        modifier = modifier.requiredWidth(130.0.dp).requiredHeight(130.0.dp)
    )
}

@Composable
fun SeptakkprdiText(modifier: Modifier = Modifier) {
    RelayText(
        content = "Септакорды",
        fontSize = 13.0.sp,
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
fun SeptakkordiTest(
    onSeptakkorditestTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.tappable(onTap = onSeptakkorditestTapped).requiredWidth(130.0.dp).requiredHeight(130.0.dp)
    )
}

@Composable
fun Rectangle3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.tests_rectangle_3),
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
fun TrezvuchiaTest(
    onTrezvuchiatestTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.tappable(onTap = onTrezvuchiatestTapped).requiredWidth(130.0.dp).requiredHeight(130.0.dp)
    )
}

@Composable
fun Rectangle5(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.tests_rectangle_5),
        modifier = modifier.requiredWidth(130.0.dp).requiredHeight(130.0.dp)
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
        modifier = modifier.requiredWidth(130.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun IntervaliTest(
    onIntervalitestTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.tappable(onTap = onIntervalitestTapped).requiredWidth(130.0.dp).requiredHeight(130.0.dp)
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
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
