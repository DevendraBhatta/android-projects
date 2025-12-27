package com.devdeveloper.bizcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.devdeveloper.bizcard.ui.theme.BizCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BizCardTheme {
                Surface {
                    CreateBizCard()
                }
             }
        }
    }
}

@Composable fun CreateBizCard(){
  Surface (modifier = Modifier.fillMaxWidth()
      .fillMaxHeight()){
      Card(modifier = Modifier.fillMaxWidth()
          .height(390.dp)
          .padding(12.dp),
          colors = CardDefaults.cardColors(
              containerColor = Color.White
          ),
          shape = RoundedCornerShape(corner = CornerSize(16.dp)),
          elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)) {


          Surface(modifier = Modifier.size(150.dp)
              .padding(12.dp),
              shape = CircleShape,
              border = BorderStroke(1.dp,Color.LightGray),
              shadowElevation = 4.dp,
              color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.5f)
          ) {

              Image(painter = painterResource(R.drawable.profile), contentDescription = "Profile Image",
                  modifier = Modifier.size(135.dp),
                  contentScale = ContentScale.Crop

              )

          }
      }
  }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BizCardTheme {
        CreateBizCard()
    }
}