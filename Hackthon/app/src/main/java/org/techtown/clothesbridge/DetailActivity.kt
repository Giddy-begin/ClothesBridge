package org.techtown.clothesbridge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        //액션바 이름설정
        supportActionBar?.title = ""

        //뒤로가기 버튼
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }

}