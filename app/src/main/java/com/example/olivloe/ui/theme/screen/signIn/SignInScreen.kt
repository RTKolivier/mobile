package com.example.olivloe.ui.theme.screen.signIn

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.olivloe.ui.theme.MatuleTheme
import com.example.olivloe.ui.theme.matuleFontFamily

@Composable
fun SignInScreen(){
SignInContent()
}

@Composable
fun SignInContent(){
Column {
    TitleWithSubtitleText()
}
}

@Preview
@Composable
fun TitleWithSubtitleText(){
   Column(
       Modifier.padding(horizontal = 20.dp),
       horizontalAlignment = Alignment.CenterHorizontally,
       verticalArrangement = Arrangement.spacedBy(8.dp)
   ){

       Text(text = "Привет",
           style = MatuleTheme.typography.headingBold32.copy(color = MatuleTheme.colors.text),
           textAlign = TextAlign.Center
       )
       Text(
           text = "Заполните свои данные или продолжите через социальные медиа",
           maxLines = 2,
           style = MatuleTheme.typography.subTitleRegular16.copy(color = MatuleTheme.colors.subTextDark),
           textAlign = TextAlign.Center
       )
   }
}
