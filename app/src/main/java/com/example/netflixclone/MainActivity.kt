package com.example.netflixclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.netflixclone.ui.theme.NetflixCloneTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NetflixCloneTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
@Preview
fun Greeting() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
    ) {
        Column() {
            Row {
                Image(
                    painter = painterResource(id = R.drawable.netflix),
                    contentDescription = "Nexflix_logo",
                    modifier = Modifier
                        .height(70.dp)
                        .width(80.dp)
                        .padding(6.dp)
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                    //  horizontalArrangement = Arrangement.Start
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.search),
                        contentDescription = "search",
                        modifier = Modifier
                            .width(50.dp)
                            .height(50.dp)
                            .padding(top = 10.dp)
                        // .align(Alignment.Center)

                    )
                    Image(
                        painter = painterResource(id = R.drawable.profile),
                        contentDescription = "user_profile",
                        modifier = Modifier
                            .width(80.dp)
                            .height(50.dp)
                            .padding(top = 10.dp)
                        // .align(Alignment.Center)

                    )

                }


            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Text(
                    modifier = Modifier.padding(2.dp),
                    text = "Tv Shows",
                    color = Color.Gray,
                    fontSize = 16.sp
                )
                Text(
                    modifier = Modifier.padding(2.dp),
                    text = "Movies",
                    color = Color.Gray,
                    fontSize = 16.sp
                )
                Text(
                    modifier = Modifier.padding(2.dp),
                    text = "Categories",
                    color = Color.Gray,
                    fontSize = 16.sp
                )
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth(),  //important
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.gossip_girl),
                    contentDescription = "search",
                    modifier = Modifier
                        .padding(top = 28.dp)
                        .height(300.dp)
                        .width(220.dp)
                )
            }

            Row( modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly) {

                Text(
                    modifier = Modifier
                        .padding(6.dp)
                        .padding(start = 30.dp, top = 20.dp),
                    text = "Scandalous  .",
                    color = Color.White,
                    fontSize = 12.sp
                )
                Text(
                    modifier = Modifier
                        .padding(6.dp)
                        .padding(top = 20.dp),
                    text = "Serial  .",
                    color = Color.White,
                    fontSize = 12.sp
                )
                Text(
                    modifier = Modifier
                        .padding(6.dp)
                        .padding(top = 20.dp),
                    text = "Teen  .",
                    color = Color.White,
                    fontSize = 12.sp
                )
                Text(
                    modifier = Modifier
                        .padding(6.dp)
                        .padding(end = 30.dp, top = 20.dp),
                    text = "Notable SoundTrack",
                    color = Color.White,
                    fontSize = 12.sp
                )

            }

            Row(  modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly) {
                Column() {
                    Image(
                        painter = painterResource(id = R.drawable.add),
                        contentDescription = "list",
                        modifier = Modifier
                            .width(40.dp)
                            .height(60.dp)
                            .padding(top = 22.dp)
                    )
                    Text(
                        modifier = Modifier
                            .padding(start = 6.dp),
                        text = "My List",
                        color = Color.Gray,
                        fontSize = 12.sp
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.playbtn),
                    contentDescription = "play",
                    modifier = Modifier
                        .width(80.dp)
                        .height(60.dp)
                        .padding(top = 22.dp)
                )
                Column() {
                    Image(
                        painter = painterResource(id = R.drawable.info),
                        contentDescription = "info",
                        modifier = Modifier
                            .width(40.dp)
                            .height(50.dp)
                            .padding(top = 22.dp)
                    )
                    Text(
                        modifier = Modifier
                            .padding(start = 12.dp, top =  6.dp),
                        text = "info",
                        color = Color.Gray,
                        fontSize = 13.sp
                    )
                }
            }

            Text(
                modifier = Modifier
                    .padding(top = 26.dp, start = 20.dp),
                text = "Get In On the Action",
                color = Color.White,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,

                )
            Image(
                painter = painterResource(id = R.drawable.movies),
                contentDescription = "movies",
                modifier = Modifier
                    .padding(start = 20.dp, end = 20.dp)
                    .fillMaxWidth()
            )

            Row(  modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround)
            {
                Column() {
                    Image(
                        painter = painterResource(id = R.drawable.home),
                        contentDescription = "home",
                        modifier = Modifier
                            .width(50.dp)
                            .height(50.dp)
                            .padding(top = 22.dp)
                    )
                    Text(
                        modifier = Modifier
                            .padding(start = 8.dp, top =  6.dp),
                        text = "Home",
                        color = Color.White,
                        fontSize = 13.sp
                    )
                }
                Column() {
                    Image(
                        painter = painterResource(id = R.drawable.news),
                        contentDescription = "new",
                        modifier = Modifier
                            .width(50.dp)
                            .height(50.dp)
                            .padding(start = 10.dp, top = 22.dp)
                    )
                    Text(
                        modifier = Modifier
                            .padding(start = 2.dp, top =  6.dp),
                        text = "New & Hot",
                        color = Color.Gray,
                        fontSize = 13.sp
                    )
                }
                Column() {
                    Image(
                        painter = painterResource(id = R.drawable.video_game),
                        contentDescription = "games",
                        modifier = Modifier
                            .width(70.dp)
                            .height(50.dp)
                            .padding(top = 22.dp)
                    )
                    Text(
                        modifier = Modifier
                            .padding(start = 16.dp, top =  6.dp),
                        text = "Games",
                        color = Color.Gray,
                        fontSize = 13.sp
                    )
                }
                Column() {
                    Image(
                        painter = painterResource(id = R.drawable.download),
                        contentDescription = "downloads",
                        modifier = Modifier
                            .width(70.dp)
                            .height(50.dp)
                            .padding(top = 22.dp)
                    )
                    Text(
                        modifier = Modifier
                            .padding(start = 10.dp, top =  6.dp),
                        text = "Downloads",
                        color = Color.Gray,
                        fontSize = 13.sp
                    )
                }
            }

        }

    }
}

//@Preview()
//@Composable
//fun GreetingPreview() {
//    NetflixCloneTheme {
//        Greeting("Android")
//    }
//}