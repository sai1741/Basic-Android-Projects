package com.example.medistore.newUserScreens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Bottom
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.medistore.R

@Composable
fun Login() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {

        Spacer(modifier = Modifier.height(20.dp))

        Image(
            painter = painterResource(id = R.drawable.midi_logo),
            contentDescription = "mediStore logo",
            Modifier.size(200.dp)
        )

        Spacer(modifier = Modifier.height(0.dp))

        Text(
            text = "Welcome,",
            fontSize = MaterialTheme.typography.headlineLarge.fontSize,
            fontWeight = FontWeight.ExtraBold,
            color = MaterialTheme.colorScheme.primary,
        )
        Text(
            text = "Glad to see you again",
            fontSize = MaterialTheme.typography.headlineMedium.fontSize,
            color = MaterialTheme.colorScheme.primary,
        )
        Spacer(modifier = Modifier.height(35.dp))
        OutlinedTextField(value = "",
            onValueChange = {},
            singleLine = true,
            modifier = Modifier.fillMaxWidth(0.8f),
            shape = RoundedCornerShape(50),
            label = { Text(text = "Email") },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Email,
                    contentDescription = "email",
                    tint = MaterialTheme.colorScheme.primary
                )
            }
        )
        OutlinedTextField(value = "",
            onValueChange = {},
            modifier = Modifier.fillMaxWidth(0.8f),
            shape = RoundedCornerShape(50),
            singleLine = true,
            label = { Text(text = "Password") },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Lock,
                    contentDescription = "Password",
                    tint = MaterialTheme.colorScheme.primary
                )
            },
            trailingIcon = {
                Icon(
                    painterResource(id = R.drawable.show_password),
                    contentDescription = "show password",
                    tint = MaterialTheme.colorScheme.primary,
                    modifier = Modifier.padding(end = 15.dp)
                )
            })
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = "Forgot Password ?",
            fontWeight = FontWeight.W600,
            modifier = Modifier
                .align(Alignment.End)
                .padding(end = 45.dp),
            color = Color(0xFF485DE2)
        )
        Spacer(modifier = Modifier.height(40.dp))
        Button(
            onClick = { /*TODO*/ }, modifier = Modifier
                .fillMaxWidth(0.8f)
                .height(50.dp)
        ) {
            Text(text = "Login", fontSize = MaterialTheme.typography.bodyLarge.fontSize)
        }
        Spacer(modifier = Modifier.height(20.dp))
        HorizontalDivider(
            thickness = 1.dp,
            modifier = Modifier.padding(horizontal = 100.dp)
        )
        Spacer(modifier = Modifier.height(15.dp))
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
        Spacer(modifier = Modifier.height(90.dp))
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(text = "Don't have an account?")
            OutlinedButton(onClick = {}) {
                Text(text = "Sign up")
            }
        }
    }
}