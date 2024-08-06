package com.example.medistore.newUserScreens

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.medistore.R
import kotlinx.coroutines.delay

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun IntroScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        Box(modifier = Modifier.fillMaxSize()) {
            //data type for list of sliding item
            data class sliderItem(val image: Int, val text: String)

            //list of sliding items
            val itemList = listOf(
                sliderItem(image = R.drawable.slider_image_1, text = "Expert Advice"),
                sliderItem(image = R.drawable.slider_image_2, text = "Quality Medicines"),
                sliderItem(image = R.drawable.slider_image_3, text = "Your health, our priority"),
                sliderItem(image = R.drawable.slider_image_4, text = "Health is Wealth")
            )

            val pagerState = rememberPagerState(pageCount = { itemList.size })
            //auto slide
            LaunchedEffect(Unit) {
                while (true) {
                    delay(2000)
                    val nextPage = (pagerState.currentPage + 1) % pagerState.pageCount
                    pagerState.scrollToPage(nextPage)
                }
            }

            //horizontal sliding
            HorizontalPager(state = pagerState, modifier = Modifier.wrapContentSize()) { page ->
                Card(
                    modifier = Modifier
                        .wrapContentSize()
                        .padding(top = 8.dp)
                        .padding(horizontal = 8.dp),
                    elevation = androidx.compose.material3.CardDefaults.cardElevation(),
                    colors = androidx.compose.material3.CardDefaults.cardColors(Color.Transparent)
                ) {
                    Image(
                        painter = painterResource(itemList[page].image),
                        contentDescription = "",
                        modifier = Modifier.height(600.dp),
                        contentScale = ContentScale.Crop
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    PageIndicator(
                        pagerState.pageCount,
                        pagerState.currentPage
                    )
                    Spacer(modifier = Modifier.height(30.dp))
                    Text(
                        text = itemList[page].text,
                        fontSize = MaterialTheme.typography.headlineSmall.fontSize,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
                    )

                }
            }
            Button(
                onClick = { /*TODO*/ }, modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, end = 30.dp, bottom = 30.dp)
                    .align(Alignment.BottomCenter)
            ) {
                Text(text = "Get Started", fontSize = MaterialTheme.typography.bodyLarge.fontSize)
            }
            Spacer(modifier = Modifier.height(10.dp))
        }
    }
}

@Composable
fun PageIndicator(
    pageCount: Int,
    currentPage: Int
) {
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    ) {
        repeat(pageCount) {
            val isSelected = it == currentPage
            val size = animateDpAsState(targetValue = if (isSelected) 12.dp else 8.dp, label = "")
            Box(
                modifier = Modifier
                    .padding(2.dp)
                    .size(size.value)
                    .clip(shape = CircleShape)
                    .background(if (isSelected) Color(0xff373737) else Color(0xA8373737))
            )
        }
    }
}
