package kr.co.hgney.loginpractice_20200527

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        eventBtn.setOnClickListener {
            Log.d("이벤트확인", "버튼클릭")
            Log.e("이벤트확인","에러로그 발생")
        }
    }
}
