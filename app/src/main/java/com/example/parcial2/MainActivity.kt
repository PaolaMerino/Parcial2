package com.example.parcial2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tvespecie: TextView
    lateinit var tvsexo: TextView
    lateinit var tvhabitat: TextView
    lateinit var ivImgFoto: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvespecie = findViewById(R.id.tv_especie)
        tvsexo=findViewById(R.id.tv_sexo)
        tvhabitat=findViewById(R.id.tv_habitat)
        ivImgFoto=findViewById(R.id.iv_ImgFoto)

        var bundle:Bundle = getIntent().getExtras()!!




    }

}

