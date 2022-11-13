package com.example.android.architecture.blueprints.foonkiemonkey

import android.media.tv.TvContract
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.ButtonDefaults.buttonColors
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.android.architecture.blueprints.foonkiemonkey.ui.theme.*

@Preview
@Composable
fun Home() {
    Surface() {

    }
    Scaffold(floatingActionButton = { Fab() }) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                ) {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(695.65.dp)
                    .background(color = Box1)){

                Box1Content()

            }


            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(968.dp)
                    .background(color = Box2)){

            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(574.dp)
                    .background(color = Box3)){

            }
            
        }

        Box(
            modifier = Modifier
                .padding(top = 378.16.dp)
                .fillMaxSize(),
            contentAlignment = Alignment.Center
            ){
            MonkeyImage1()
        }


    }

}



@Composable
private fun Box1Content() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 50.72.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Logo()

        Divider(modifier = Modifier
            .width(57.07.dp)
            .padding(top = 22.56.dp))

        Text(
            text = stringResource(id = R.string.expert_samu),
            modifier = Modifier
                .padding(top = 7.25.dp),
            fontFamily = DmSerifDisplay,
            style = TitleFontStyle
        )

        Text(
            text = stringResource(id = R.string.we_are_samu),
            modifier = Modifier
                .padding(top = 14.13.dp, start = 54.dp, end = 54.dp),
            fontFamily = Rubik,
            style = ContentFontStyle,
        )

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .padding(top = 21.77.dp),
            shape = getInTouch,
            colors = buttonColors(backgroundColor = ButtonColor)
        ) {
            Text(text = stringResource(id = R.string.get_in_touch),
                fontFamily = DmSerifDisplay,
                style = GetInTouchButtonText)
        }

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
fun Logo(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.foonkie_monkey_logo),
        contentDescription = "Foonkie monkey logo",
        modifier = modifier
            .height(55.34.dp)
            .width(101.45.dp))
}


@Composable
private fun MonkeyImage1(modifier: Modifier = Modifier) {
        Image(
            painter = painterResource(id = R.drawable.foonkie_monkey_1),
            contentDescription = "Samurai Monkey 1",
            modifier = modifier.width(257.25.dp)
                .height(476.18.dp)
        )
}


@Composable
private fun MonkeyImage2() {
    Image(
        painter = painterResource(id = R.drawable.foonkie_monkey_2),
        contentDescription = "Samurai Monkey 2",
        modifier = Modifier.fillMaxSize()
    )
}


