package com.example.myapplication3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication3.ui.theme.MyApplication3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplication3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                myApp()
                }
            }
        }
    }
}

@Composable
fun myApp(){
    val appModifier= Modifier.fillMaxWidth().padding(8.dp)

    Column(
        verticalArrangement= Arrangement.spacedBy(16.dp)
    ){
        Text(
            text="My Title",
            style= MaterialTheme.typography.bodyLarge,
            //Since i do not have the oamk package downloaded for ui theme,
            //I am unable to modify and use h5
            //I have however understood how it theoretically works
            //Since i am already done i did not want to do the whole thing again
            //with the package installed and i am therefore submitting the
            //Assignment like this, I hope you understand
            modifier=appModifier
        )
        OutlinedTextField(
            value="",
            onValueChange={/*TODO*/},
            modifier= appModifier
        )
    }
        Button(onClick={/*TODO*/},
            modifier = appModifier){
            Text(text="submit")
        }

}

@Preview(showBackground = true)
@Composable
fun AppPreview() {
    MyApplication3Theme {
    myApp()
    }
}