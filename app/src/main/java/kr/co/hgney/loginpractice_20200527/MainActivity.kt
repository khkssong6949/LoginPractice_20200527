package kr.co.hgney.loginpractice_20200527

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginBtn.setOnClickListener {
            val inputEmail = idEdt.text.toString()
            val inputPw = pwdEdt.text.toString()

//      email / 비번 확인해서 맞으면 / 틀리면 처리

            if(inputEmail == "1" && inputPw == "1"){
                Log.d("로그인확인", "관리자 맞다")
                Toast.makeText(this, "관리자입니다", Toast.LENGTH_SHORT).show()
            }
            else{
                Log.d("로그인확인", "정보 불일치")
                Toast.makeText(this, "관리자가 아닙니다", Toast.LENGTH_SHORT).show()

            }

        }

        eventBtn.setOnClickListener {
            Log.d("이벤트확인", "버튼클릭")
            Log.e("이벤트확인","에러로그 발생")

            Toast.makeText(this, "버튼 클릭 됨", Toast.LENGTH_SHORT).show()

            val inputContent = contentEdt.text.toString()
            eventBtn.text = inputContent


        }
    }
}
