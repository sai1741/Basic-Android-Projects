package com.example.medistore.newUserScreens.SignUp

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.medistore.R

@Preview(showSystemUi = true)
@Composable
fun VerifyEmail() {
    Row(modifier = Modifier
        .padding(top = 20.dp, start = 25.dp)
        .clickable {

        },
        verticalAlignment = Alignment.CenterVertically){
        Icon(
            painter = painterResource(id = R.drawable.back_icon),
            contentDescription = "back",
            tint = Color(0xFF485DE2)
        )
        Text(text = "Back", color = Color(0xFF485DE2))
    }

}