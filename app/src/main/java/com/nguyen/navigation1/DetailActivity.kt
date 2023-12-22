package com.nguyen.navigation1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nguyen.navigation1.databinding.ActivityDetailBinding


class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}