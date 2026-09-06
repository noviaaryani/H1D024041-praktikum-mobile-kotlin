package com.pemmob.noviarizky

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MaterialTheme(
                colorScheme = darkColorScheme()
            ) {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    containerColor = Color(0xFF141318)
                ) { innerPadding ->
                    HalamanInformatika(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun HalamanInformatika(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF141318))
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.gedung_teknik),
            contentDescription = "Gedung Fakultas Teknik",
            modifier = Modifier
                .fillMaxWidth()
                .height(230.dp),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(18.dp))

        Text(
            text = "Selamat datang di Prodi Informatika,\nFakultas Teknis,\nUniversitas Jenderal Soedirman",
            color = Color.White,
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            lineHeight = 20.sp,
            modifier = Modifier.padding(horizontal = 14.dp)
        )

        Spacer(modifier = Modifier.height(14.dp))

        Text(
            text = "Program Studi Informatika di Universitas Jenderal Soedirman (Unsoed) berdiri pada tahun 2008, berawal dari kebutuhan yang semakin mendesak akan tenaga ahli di bidang teknologi informasi dan komunikasi." +
                    "Saat itu, perkembangan teknologi yang pesat di Indonesia dan dunia memerlukan adanya program pendidikan tinggi yang mampu mencetak lulusan dengan kompetensi tinggi di bidang informatika." +
                    "\nPada tahun tersebut, Fakultas Sains dan Teknik (FST) Unsoed mengambil inisiatif untuk mendirikan Program Studi Informatika. Pembentukan program studi ini bertujuan untuk memenuhi tuntutan masyarakat dan industri yang membutuhkan tenaga profesional dalam bidang teknologi informasi. Kurikulum yang disusun dirancang untuk memberikan pendidikan berkualitas, menggabungkan aspek praktis dan teoritis dari informatika, seperti pemrograman, sistem informasi, jaringan komputer, dan kecerdasan buatan.",
            color = Color.White,
            fontSize = 13.sp,
            textAlign = TextAlign.Start,
            lineHeight = 17.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 14.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 16.dp, bottom = 24.dp),
            contentAlignment = Alignment.CenterEnd
        ) {
            Button(
                onClick = { /* Aksi tombol */ },
                shape = RoundedCornerShape(50),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFECE6F0),
                    contentColor = Color(0xFF21005D)
                ),
                modifier = Modifier.height(44.dp)
            ) {
                Text(
                    text = "NEX",
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewHalamanInformatika() {
    MaterialTheme(colorScheme = darkColorScheme()) {
        HalamanInformatika()
    }
}