package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.Background
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme
import com.example.businesscardapp.ui.theme.CustomGreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Background
                ) {
                    BusinessCardApp()
                }
            }
        }
    }
}

@Composable
fun BusinessCardApp(){
    Column (
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally, 
//        verticalArrangement = Arrangement.Center
    ) {
        Spacer(modifier = Modifier.weight(1f))
        HeaderSection()
        Spacer(modifier = Modifier.weight(1f))
        ContactInfoSection()
        
    }
   
}

@Composable
fun HeaderSection(){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(16.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = null,
            modifier = Modifier.size(100.dp)
        )
        Text(
            text = "Alena Kellnerova",
            fontSize = 32.sp
        )
        Text(
            text = "Android Developer Extraordinaire",
            color = CustomGreen,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 12.dp)
            
        )
    }
}

@Composable
fun ContactInfoSection(){
    Column (
        modifier = Modifier.padding(40.dp)
    ){
        Row {
            Icon(
                Icons.Default.Phone,
                tint = CustomGreen,
                contentDescription = "icon phone"
            )
            Spacer(modifier = Modifier.width(20.dp))
            Text(text = "+123456789")
        }
        Row{
            Icon(
                Icons.Default.Share,
                tint = CustomGreen,
                contentDescription = "icon share"
            )
            Spacer(modifier = Modifier.width(20.dp))
            Text(text = "@AndroidDev")
        }
        Row {
            Icon(
                Icons.Default.Email,
                tint = CustomGreen,
                contentDescription = "icon email"
            )
            Spacer(modifier = Modifier.width(20.dp))
            Text(text = "jon.doe@android.com")
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardAppTheme {
//        HeaderSection()
//        ContactInfoSection()
        BusinessCardApp()
    }
}