package com.example.android.architecture.blueprints.foonkiemonkey

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.widget.Toast
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.ButtonDefaults.buttonColors
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android.architecture.blueprints.foonkiemonkey.ui.theme.*

@Preview
@Composable
fun Home() {

    Scaffold(floatingActionButton = { Fab() }) {

        Box(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState()),
        ) {

            Column(
                modifier = Modifier
                    .fillMaxSize()
            ) {

                Box1Content(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(695.65.dp)
                        .background(color = Box1)
                )

                Box2Content(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(830.51.dp)
                        .background(color = Box2)
                )

                Box3Content(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(574.dp)
                        .background(color = Box3)
                )
            }
            MonkeyImage1(
                modifier = Modifier
                    .align(Alignment.TopCenter)
                    .padding(top = 378.dp)
            )

            MonkeyImage2(
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(
                        bottom = 283.95.dp,
                        end = 77.dp
                    )
                    .offset(x = (-54).dp)
            )

        }

    }

}

@Composable
private fun Box1Content(modifier: Modifier = Modifier) {

    val context = LocalContext.current

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(top = 50.72.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

            MonkeyLogo(modifier = Modifier
                .height(55.34.dp)
                .width(101.45.dp))

            Divider(
                modifier = Modifier
                    .padding(top = 22.56.dp)
                    .width(57.07.dp),
                color = TextBlack,
                thickness = 0.18.dp)

            Text(
                text = stringResource(id = R.string.expert_samu),
                modifier = Modifier
                    .padding(top = 7.25.dp),
                fontFamily = DmSerifDisplay,
                style = Title1FontStyle
            )

            Text(
                text = stringResource(id = R.string.we_are_samu),
                modifier = Modifier
                    .padding(top = 14.13.dp, start = 54.dp, end = 54.dp),
                fontFamily = Rubik,
                style = ContentFontStyle,
            )

        Button(
            onClick = { context.sendEmail() },
            modifier = Modifier
                .padding(top = 21.77.dp)
                .height(34.67.dp)
                .width(121.75.dp),
            shape = getInTouch,
            colors = buttonColors(backgroundColor = ButtonColor)
        ) {
            Text(
                text = stringResource(id = R.string.get_in_touch),
                fontFamily = DmSerifDisplay,
                style = GetInTouchButtonText,
                fontSize = 15.22.sp
            )
        }
    }
}


@Composable
private fun Box2Content(modifier: Modifier = Modifier) {

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(top = 115.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {

        Text(
            text = stringResource(id = R.string.box2_title),
            modifier = Modifier
                .padding(
                    start = 53.dp),
            fontFamily = DmSerifDisplay,
            style = Title2FontStyle
        )

        Divider(modifier = Modifier
            .padding(
                top = 4.82.dp,
                start = 53.dp)
            .width(49.83.dp),
            color = TextWhite,
            thickness = 0.32.dp)

    }
}

@Composable
private fun Box3Content(modifier: Modifier = Modifier) {

    val context = LocalContext.current

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(top = 97.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.End
    ) {

        Text(
            text = stringResource(id = R.string.box3_title),
            modifier = Modifier
                .padding(
                    end = 30.dp),
            fontFamily = DmSerifDisplay,
            style = Title2FontStyle,
            fontSize = 24.sp
        )

        Button(
            onClick = { context.sendEmail() },
            modifier = Modifier.padding(
                top = 43.72.dp,
                end = 30.dp)
                .width(103.dp)
                .height(29.33.dp),
            shape = getInTouch,
            colors = buttonColors(backgroundColor = ButtonColor)
        ) {
            Text(
                text = stringResource(id = R.string.get_in_touch),
                fontFamily = DmSerifDisplay,
                style = GetInTouchButtonText,
                fontSize = 12.sp
            )
        }

        Divider(modifier = Modifier
            .padding(
                top = 53.67.dp,
                end = 36.dp)
            .width(51.54.dp),
            color = TextWhite,
            thickness = 0.34.dp)

        MonkeyLogo(modifier = Modifier
            .padding(
                top = 22.dp,
                end = 35.57.dp)
            .height(66.08.dp)
            .width(124.43.dp))

        Text(
            text = stringResource(id = R.string.office_locations),
            modifier = Modifier
                .padding(
                    top = 16.31.dp,
                    end = 36.05.dp),
            fontFamily = Rubik,
            style = ContentFontStyle2
        )

        Divider(modifier = Modifier
            .padding(
                top = 20.06.dp,
                end = 36.dp)
            .width(51.54.dp),
            color = TextWhite,
            thickness = 0.34.dp)

        Text(
            text = stringResource(id = R.string.fm_id),
            modifier = Modifier
                .padding(
                    top = 20.06.dp,
                    end = 36.42.dp),
            fontFamily = Rubik,
            style = ContentFontStyle2
        )


    }
}


/* Button */

@Composable
fun Fab() {
    FloatingActionButton(
        modifier= Modifier
            .width(61.dp)
            .height(61.dp),
        backgroundColor = FabColor,
        onClick = {}) { Icon(Icons.Filled.Menu,
            contentDescription = "FAB",
            tint = FabIcon)
    }
}

/*  Drawables */

@Composable
private fun MonkeyLogo(modifier: Modifier = Modifier) {
    
    Image(
        painter = painterResource(id = R.drawable.foonkie_monkey_logo),
        contentDescription = "Foonkie monkey logo",
        modifier = modifier)
}


@Composable
private fun MonkeyImage1(modifier: Modifier = Modifier) {

        Image(
            painter = painterResource(id = R.drawable.foonkie_monkey_1),
            contentDescription = "Samurai Monkey 1",
            modifier = modifier
                .height(476.18.dp)
                .width(257.25.dp)
        )
}


@Composable
private fun MonkeyImage2(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.foonkie_monkey_2),
        contentDescription = "Samurai Monkey 2",
        modifier = modifier
            .height(329.56.dp)
            .width(352.dp)
    )
}


fun  Context.sendEmail(){

    val subject = "I want a quote"
    val body = "I need you to build an application"

    val sendIntent = Intent(Intent.ACTION_VIEW).apply {
        val data = Uri.parse("mailto:?subject=" + subject + "&body=" + body)
        setData(data)
    }


    try {

        startActivity(sendIntent)

    } catch (e: ActivityNotFoundException) {

        Toast.makeText(
            this,
            "Could not find a mail application installed",
            Toast.LENGTH_SHORT
        ).show()

    }

}