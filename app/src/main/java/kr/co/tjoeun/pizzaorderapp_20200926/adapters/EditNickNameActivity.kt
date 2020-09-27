package kr.co.tjoeun.pizzaorderapp_20200926.adapters

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nick_name.*
import kr.co.tjoeun.pizzaorderapp_20200926.BaseActivity
import kr.co.tjoeun.pizzaorderapp_20200926.R

class EditNickNameActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nick_name)

        setupEvents()
        setValues()

    }

    override fun setupEvents() {

        okBtn.setOnClickListener {

            val inputNickName = nickNameEdt.text.toString()

            val resultIntent = Intent()
            resultIntent.putExtra("nick", inputNickName)
            setResult(Activity.RESULT_OK, resultIntent)
            finish()

        }
    }

    override fun setValues() {

    }
}