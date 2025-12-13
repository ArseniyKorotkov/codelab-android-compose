package by.arsy.composebasicspractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import by.arsy.composebasicspractice.ui.theme.ComposeBasicsPracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeBasicsPracticeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TutorialScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun TutorialScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        TitleImage(
            painter = painterResource(R.drawable.bg_compose_background)
        )
        TutorialText(
            title = stringResource(R.string.jetpack_compose_tutorial_title),
            shortDescription = stringResource(R.string.about_jetpack_compose),
            longDescription = stringResource(R.string.about_jetpack_compose_tutorial),
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Composable
fun TitleImage(
    painter: Painter,
    modifier: Modifier = Modifier
) {
    Image(
        painter = painter,
        contentDescription = null,
        contentScale = ContentScale.Fit,
        modifier = modifier
    )
}

@Composable
fun TutorialText(
    title: String,
    shortDescription: String,
    longDescription: String,
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = modifier
    ) {
        Text(
            text = title,
            fontSize = 24.sp
        )
        Text(
            text = shortDescription,
            textAlign = TextAlign.Justify
        )
        Text(
            text = longDescription,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TutorialScreenPreview() {
    ComposeBasicsPracticeTheme {
        TutorialScreen()
    }
}