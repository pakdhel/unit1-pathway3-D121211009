package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme
import androidx.core.graphics.ColorUtils

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BusinessCardApp()
                }
            }
        }
    }
}

@Composable
fun BusinessCardApp(){
    val argbColor = 0xFF003A4A.toInt()
    val hslArray = FloatArray(3)
    ColorUtils.colorToHSL(argbColor, hslArray)
Column(
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center
) {
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .weight(3f)

            ){
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = null,
            modifier = Modifier
                .size(height = 120.dp, width = 120.dp)
                .background(color = Color.DarkGray)
        )
        Text(
            text = stringResource(R.string.full_name),
            fontSize = 36.sp,
 //           modifier = Modifier
 //              .padding(start = 16.dp, end = 16.dp)
        )
        Text(
            text = stringResource(R.string.title),
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colors.secondary,
            modifier = Modifier
                .padding(top = 12.dp)
        )

    }
    Column(

        modifier = Modifier
            .fillMaxWidth()
            .weight(1f)
    ) {
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 28.dp)

        ) {
            Icon(
                imageVector = Icons.Rounded.Phone ,
                contentDescription =null,
                tint=MaterialTheme.colors.secondary,
                modifier = Modifier
                    .padding(start = 20.dp)

            )
            Text(
                stringResource(R.string.phone_number),
                fontSize = 16.sp,
                modifier = Modifier
                    .padding(start = 20.dp)
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
//        Divider(color = Color.Gray)
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 28.dp)
        ) {
            Icon(
                imageVector = Icons.Rounded.Share ,
                contentDescription =null,
                tint=MaterialTheme.colors.secondary,
                modifier = Modifier
                    .padding(start = 20.dp)
            )
            Text(
                stringResource(R.string.share_text),
                fontSize = 16.sp,
                modifier = Modifier
                    .padding(start = 20.dp)
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
//        Divider(color = Color.Gray)
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 28.dp)
        ) {
            Icon(
                imageVector = Icons.Rounded.Email ,
                contentDescription =null,
                tint=MaterialTheme.colors.secondary,
                modifier = Modifier
                    .padding(start = 20.dp)
            )
            Text(
                stringResource(R.string.email),
                fontSize = 16.sp,
                modifier = Modifier
                    .padding(start = 20.dp)
            )
        }
    }

}
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardAppTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            BusinessCardApp()
        }

    }
}