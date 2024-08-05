package com.example.medistore.newUserScreens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.medistore.R

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun IntroScreen(){
    Column(modifier=Modifier.fillMaxSize()){
        Box(modifier = Modifier.fillMaxSize()) {
            data class sliderItem (val image: Int,val text:String)
            val itemList = listOf(
                sliderItem(image = R.drawable.slider_image_1, text ="i am wagh" ),
                sliderItem(image = R.drawable.slider_image_2, text ="i am unbeatable" ),
                sliderItem(image = R.drawable.slider_image_3, text ="i am extraordinary" ),
                sliderItem(image = R.drawable.slider_image_4, text = "i am the king")
            )
            val pagerState = rememberPagerState(pageCount = { itemList.size })
            HorizontalPager(state =pagerState) {page->
                Card(modifier = Modifier.wrapContentSize()) {
                    Image(painter = painterResource(itemList[page].image),
                        contentDescription = "",
                        modifier = Modifier.fillMaxSize())

                }
            }
        }
    }
}