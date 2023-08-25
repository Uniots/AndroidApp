package com.example.androidapp.libraryintervali

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
 * ,hykytkyt
 *
 * This composable was generated from the UI Package 'library_intervali'.
 * Generated code; do not edit directly
 */
@Composable
fun LibraryIntervali(
    modifier: Modifier = Modifier,
    onBattonbackTapped: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        IntHed()
        BattonBack(
            onBattonbackTapped = onBattonbackTapped,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 9.0.dp,
                    y = 40.0.dp
                )
            )
        ) {
            Ellipse1()
            Group2(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 14.0.dp,
                        y = 9.0.dp
                    )
                )
            ) {
                Line3(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = -3.6376577057751547.dp,
                            y = 8.78208405160035.dp
                        )
                    )
                )
                Line4(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = -3.6794057526501547.dp,
                            y = 25.614079888829338.dp
                        )
                    )
                )
            }
        }
        TextInt(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 123.0.dp
                )
            )
        )
        ListenInt(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 230.0.dp,
                    y = 452.0.dp
                )
            )
        ) {
            Ellipse2()
            Pngwing3(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 6.0.dp,
                        y = 6.0.dp
                    )
                )
            )
        }
        Image1(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 15.0.dp,
                    y = 439.0.dp
                )
            )
        )
    }
}

@Preview(widthDp = 360, heightDp = 640)
@Composable
private fun LibraryIntervaliPreview() {
    MaterialTheme {
        RelayContainer {
            LibraryIntervali(
                onBattonbackTapped = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun IntHed(modifier: Modifier = Modifier) {
    RelayText(
        content = "Интервалы",
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
fun Ellipse1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.library_intervali_ellipse_1),
        modifier = modifier.requiredWidth(53.0.dp).requiredHeight(53.0.dp)
    )
}

@Composable
fun Line3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.library_intervali_line_3),
        modifier = modifier.requiredWidth(24.83948516845703.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun Line4(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.library_intervali_line_4),
        modifier = modifier.requiredWidth(24.83948516845703.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun Group2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(18.229522705078125.dp).requiredHeight(34.39617919921875.dp)
    )
}

@Composable
fun BattonBack(
    onBattonbackTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.tappable(onTap = onBattonbackTapped).requiredWidth(53.0.dp).requiredHeight(53.0.dp)
    )
}

@Composable
fun TextInt(modifier: Modifier = Modifier) {
    RelayText(
        content = "Текст текст текст текст текст текст текст текст текст текст текст текст текст текст текст текст текст текст текст текст текст текст текст текст текст текст текст",
        fontSize = 20.0.sp,
        fontFamily = hachiMaruPop,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.4479999542236328.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(360.0.dp).requiredHeight(268.0.dp)
    )
}

@Composable
fun Ellipse2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.library_intervali_ellipse_2),
        modifier = modifier.requiredWidth(87.0.dp).requiredHeight(87.0.dp)
    )
}

@Composable
fun Pngwing3(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.library_intervali_pngwing_3),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(75.0.dp).requiredHeight(75.0.dp)
    )
}

@Composable
fun ListenInt(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(87.0.dp).requiredHeight(87.0.dp)
    )
}

@Composable
fun Image1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.library_intervali_image_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(215.0.dp).requiredHeight(113.0.dp)
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
