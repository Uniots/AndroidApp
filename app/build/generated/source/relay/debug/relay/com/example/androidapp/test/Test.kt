package com.example.androidapp.test

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
 * rthrthtr
 *
 * This composable was generated from the UI Package 'test'.
 * Generated code; do not edit directly
 */
@Composable
fun Test(
    modifier: Modifier = Modifier,
    onButtonBackTapped: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        Image1(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 72.0.dp,
                    y = 50.0.dp
                )
            )
        )
        Image2(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 6.0.dp,
                    y = 435.0.dp
                )
            )
        )
        Image5(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 121.0.dp,
                    y = 497.0.dp
                )
            )
        )
        Image4(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 236.0.dp,
                    y = 435.0.dp
                )
            )
        )
        Image3(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 120.0.dp,
                    y = 435.0.dp
                )
            )
        )
        Listen5(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 7.0.dp,
                    y = 191.0.dp
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
        Listen4(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 94.0.dp,
                    y = 191.0.dp
                )
            )
        ) {
            Ellipse3()
            Pngwing4(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 6.0.dp,
                        y = 6.0.dp
                    )
                )
            )
        }
        Listen3(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 181.0.dp,
                    y = 191.0.dp
                )
            )
        ) {
            Ellipse4()
            Pngwing5(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 6.0.dp,
                        y = 6.0.dp
                    )
                )
            )
        }
        Listen2(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 268.0.dp,
                    y = 191.0.dp
                )
            )
        ) {
            Ellipse5()
            Pngwing6(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 6.0.dp,
                        y = 6.0.dp
                    )
                )
            )
        }
        Listen1(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 136.0.dp,
                    y = 320.0.dp
                )
            )
        ) {
            Ellipse6()
            Pngwing7(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 6.0.dp,
                        y = 6.0.dp
                    )
                )
            )
        }
        OrText(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 133.0.dp,
                    y = 272.0.dp
                )
            )
        )
        ButtonBack(
            onButtonBackTapped = onButtonBackTapped,
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
    }
}

@Preview(widthDp = 360, heightDp = 640)
@Composable
private fun TestPreview() {
    MaterialTheme {
        RelayContainer {
            Test(
                onButtonBackTapped = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Image1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.test_image_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(215.0.dp).requiredHeight(113.0.dp)
    )
}

@Composable
fun Image2(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.test_image_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(118.0.dp).requiredHeight(62.0.dp)
    )
}

@Composable
fun Image5(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.test_image_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(118.0.dp).requiredHeight(62.0.dp)
    )
}

@Composable
fun Image4(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.test_image_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(118.0.dp).requiredHeight(62.0.dp)
    )
}

@Composable
fun Image3(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.test_image_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(118.0.dp).requiredHeight(62.0.dp)
    )
}

@Composable
fun Ellipse2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.test_ellipse_2),
        modifier = modifier.requiredWidth(87.0.dp).requiredHeight(87.0.dp)
    )
}

@Composable
fun Pngwing3(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.test_pngwing_3),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(75.0.dp).requiredHeight(75.0.dp)
    )
}

@Composable
fun Listen5(
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
fun Ellipse3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.test_ellipse_3),
        modifier = modifier.requiredWidth(87.0.dp).requiredHeight(87.0.dp)
    )
}

@Composable
fun Pngwing4(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.test_pngwing_3),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(75.0.dp).requiredHeight(75.0.dp)
    )
}

@Composable
fun Listen4(
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
fun Ellipse4(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.test_ellipse_4),
        modifier = modifier.requiredWidth(87.0.dp).requiredHeight(87.0.dp)
    )
}

@Composable
fun Pngwing5(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.test_pngwing_3),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(75.0.dp).requiredHeight(75.0.dp)
    )
}

@Composable
fun Listen3(
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
fun Ellipse5(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.test_ellipse_5),
        modifier = modifier.requiredWidth(87.0.dp).requiredHeight(87.0.dp)
    )
}

@Composable
fun Pngwing6(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.test_pngwing_3),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(75.0.dp).requiredHeight(75.0.dp)
    )
}

@Composable
fun Listen2(
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
fun Ellipse6(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.test_ellipse_6),
        modifier = modifier.requiredWidth(87.0.dp).requiredHeight(87.0.dp)
    )
}

@Composable
fun Pngwing7(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.test_pngwing_3),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(75.0.dp).requiredHeight(75.0.dp)
    )
}

@Composable
fun Listen1(
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
fun OrText(modifier: Modifier = Modifier) {
    RelayText(
        content = "ИЛИ",
        fontSize = 32.0.sp,
        fontFamily = hachiMaruPop,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.4479999542236328.em,
        modifier = modifier.wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Ellipse1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.test_ellipse_1),
        modifier = modifier.requiredWidth(53.0.dp).requiredHeight(53.0.dp)
    )
}

@Composable
fun Line3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.test_line_3),
        modifier = modifier.requiredWidth(24.83948516845703.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun Line4(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.test_line_4),
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
fun ButtonBack(
    onButtonBackTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.tappable(onTap = onButtonBackTapped).requiredWidth(53.0.dp).requiredHeight(53.0.dp)
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
