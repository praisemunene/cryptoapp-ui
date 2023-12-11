package com.example.mvvmnavigation.ui.theme.screens.intents

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.provider.MediaStore
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.app.ActivityCompat
import androidx.core.app.ActivityCompat.startActivityForResult
import androidx.core.content.ContextCompat
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.mvvmnavigation.R
import com.example.mvvmnavigation.navigation.ROUTE_BMIcalc
import com.example.mvvmnavigation.navigation.ROUTE_CALCULATOR
import com.example.mvvmnavigation.navigation.ROUTE_HOME
import com.example.mvvmnavigation.navigation.ROUTE_INTENTS
import com.example.mvvmnavigation.ui.theme.MVVMNavigationTheme

@Composable
fun IntentsScreen(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()), // Enable scrolling if the content exceeds the screen height
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            //shorturl.at/stwQ9 has all materials for intents
            var context = LocalContext.current
            Button(onClick = {
                val uri = Uri.parse("smsto:0712982944")
                val intent = Intent(Intent.ACTION_SENDTO, uri)
                intent.putExtra("sms_body", "The SMS text")
                context.startActivity(intent)
            },
                modifier = Modifier
                    .fillMaxWidth(0.95f)
                    .padding(top = 50.dp)
                )

            {
                Text(text = "SMS")
                Icon(
                    painter = painterResource(id = R.drawable.baseline_sms_24),
                    contentDescription = "sms",
                    tint = Color.White,

                    )
            }
            Button(onClick = {
                val emailIntent = Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "praisemunene87@gmail.com", null))
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "job application")
                emailIntent.putExtra(Intent.EXTRA_TEXT, "dear sir following the job advertisement...")
                context.startActivity(Intent.createChooser(emailIntent, "Send email..."))
            },
                modifier = Modifier.fillMaxWidth(0.9f)
                ) {
                Text(text = "Email")
                Icon(
                    painter = painterResource(id = R.drawable.baseline_attach_email_24),
                    contentDescription = "email",
                    tint = Color.White,
                    modifier = Modifier.padding(2.dp)

                    )


            }
//            Button(onClick = {
//                val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
//                startActivityForResult(context as Activity, takePictureIntent, 1,null)
//            },
//                modifier = Modifier.fillMaxWidth(0.8f)
//                ) {
//                Text(text = "Camera")
//            }


            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color.Gray
                ),

                modifier = Modifier
                    .height(200.dp)
                    .width(270.dp)
                    .padding(top = 10.dp, bottom = 10.dp)
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceEvenly
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(130.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        IconButton(
                            onClick = {
                                val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                             startActivityForResult(context as Activity, takePictureIntent, 1,null)
            },

                            modifier = Modifier
                                .weight(1f)
                                .fillMaxHeight()
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.baseline_camera_alt_24),
                                contentDescription = "phone",
                                tint = Color.White,

                                )


                        }
                    }
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.White)
                            .height(70.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Text(
                            text = "Camera"
                        )
                        Divider()
                        Text(text = "Add an id picture")
                    }

                }

            }


            Button(onClick = {
                val shareIntent = Intent(Intent.ACTION_SEND)
                shareIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                shareIntent.type = "text/plain"
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Hey, download this app! from htttps://playstore.com")
                context.startActivity(shareIntent)
            },
                modifier = Modifier.fillMaxWidth(0.7f)
                ) {
                Text(text = "Share")
                Icon(
                    painter = painterResource(id = R.drawable.baseline_share_24),
                    contentDescription = "phone",
                    tint = Color.White,

                    )
            }
            Button(onClick = {
                val simToolKitLaunchIntent: Intent = context.getPackageManager().getLaunchIntentForPackage("com.android.stk")!!
                if (simToolKitLaunchIntent != null) {
                    context.startActivity(simToolKitLaunchIntent)
                }
            },
                modifier = Modifier.fillMaxWidth(0.6f)
                ) {
                Text(text = "Mpesa")
                Icon(
                    painter = painterResource(id = R.drawable.baseline_attach_money_24),
                    contentDescription = "phone",
                    tint = Color.White,

                    )
            }
            Button(onClick = {
                val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+254740690592"))
                if (ContextCompat.checkSelfPermission(
                        context,
                        android.Manifest.permission.CALL_PHONE
                    ) != PackageManager.PERMISSION_GRANTED
                ) {
                    ActivityCompat.requestPermissions(
                        context as Activity,
                        arrayOf<String>(android.Manifest.permission.CALL_PHONE),
                        1
                    )
                } else {
                    context.startActivity(intent)
                }

            },
                modifier = Modifier.fillMaxWidth(0.5f)
                ) {
                Text(text = "Call")
                Icon(
                    painter = painterResource(id = R.drawable.baseline_phone_forwarded_24),
                    contentDescription = "phone",
                    tint = Color.White,

                    )

            }

        }
    }



    BottomAppBar(
        modifier = Modifier
            .background(Color.Transparent)
            .fillMaxWidth()
            .padding(top = 575.dp)


    ) {
        IconButton(
            onClick = {
                navController.navigate(ROUTE_HOME)
            },
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
        ) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_home_24),
                contentDescription = "Dashboard"
            )
//            Icon(imageVector = Icons.Default.home, contentDescription = )
            Text(
                text = "Dashboard",
                modifier = Modifier.padding(top = 35.dp, bottom = 1.dp)
            )
        }
        IconButton(
            onClick = {
                navController.navigate(ROUTE_CALCULATOR)
            },
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
        ) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_account_balance_wallet_24),
                contentDescription = "calculator"
            )
            Text(
                text = "Calculator",
                modifier = Modifier.padding(top = 35.dp, bottom = 1.dp)
            )
        }
        IconButton(
            onClick = {
                navController.navigate(ROUTE_BMIcalc)
            },
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
        ) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_supervised_user_circle_24),
                contentDescription = "BMI"
            )
            Text(
                text = "BMI",
                modifier = Modifier.padding(top = 40.dp, bottom = 1.dp)
            )
        }
        IconButton(
            onClick = {
                navController.navigate(ROUTE_INTENTS)
            },
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
        ) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_settings_24),
                contentDescription = "intents"
            )
            Text(
                text = "Intents",
                modifier = Modifier.padding(top = 35.dp, bottom = 1.dp)
            )
        }
    }


}

@Preview(showBackground = true)
@Composable
fun intentsScreenPreview(){
    MVVMNavigationTheme {
        IntentsScreen(rememberNavController())
    }
}