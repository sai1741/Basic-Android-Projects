package com.example.medistore.newUserScreens.SignUp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.medistore.R

@Preview(showSystemUi = true)
@Composable

//collecting Name , Email , Phone Number

fun CollectBasicInfo(){
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Image(
            painter = painterResource(id = R.drawable.midi_logo),
            contentDescription = "mediStore logo",
            Modifier.size(200.dp)
        )
        Text(
            text = "Create Account,",
            fontSize = MaterialTheme.typography.headlineMedium.fontSize,
            fontWeight = FontWeight.ExtraBold,
            color = MaterialTheme.colorScheme.primary,
        )
        Text(
            text = "to get started now!",
            fontSize = MaterialTheme.typography.headlineMedium.fontSize,
            color = MaterialTheme.colorScheme.primary,
        )
        Spacer(modifier = Modifier.height(40.dp))
        OutlinedTextField(value = "", onValueChange = {},
            label = { Text(text = "Name")},
            shape = RoundedCornerShape(50),
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            modifier = Modifier.fillMaxWidth(0.8f),
            leadingIcon = {
                Icon(imageVector = Icons.Filled.Email, contentDescription = "Email",
                    tint = MaterialTheme.colorScheme.primary)
            }
            )
        OutlinedTextField(value = "", onValueChange = {},
            label = { Text(text = "Email")},
            shape = RoundedCornerShape(50),
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            modifier = Modifier.fillMaxWidth(0.8f),
            leadingIcon = {
                Icon(imageVector = Icons.Filled.Email, contentDescription = "Email",
                    tint = MaterialTheme.colorScheme.primary)
            }
        )
        OutlinedTextField(value = "", onValueChange = {},
            label = { Text(text = "Phone Number")},
            shape = RoundedCornerShape(50),
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
            modifier = Modifier.fillMaxWidth(0.8f),
            leadingIcon = {
                Icon(imageVector = Icons.Filled.Email, contentDescription = "Email",
                    tint = MaterialTheme.colorScheme.primary)
            }
        )
        Spacer(modifier = Modifier.height(30.dp))
        Button(
            onClick = { /*TODO*/ }, modifier = Modifier
                .fillMaxWidth(0.8f)
                .height(50.dp)
        ) {
            Text(text = "Next", fontSize = MaterialTheme.typography.bodyLarge.fontSize)
        }
        Spacer(modifier = Modifier.height(20.dp))
        HorizontalDivider(
            thickness = 1.dp,
            modifier = Modifier.fillMaxWidth(0.5f)
        )
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedButton(
            onClick = { /*TODO*/ }, modifier = Modifier
                .fillMaxWidth(0.8f)
                .height(50.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.google),
                contentDescription = "login with google"
            )
        }
        Spacer(modifier = Modifier.height(70.dp))
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(text = "Already have account?")
            Spacer(modifier = Modifier.width(10.dp))
            OutlinedButton(onClick = {}) {
                Text(text = "Login")
            }
        }
    }
}