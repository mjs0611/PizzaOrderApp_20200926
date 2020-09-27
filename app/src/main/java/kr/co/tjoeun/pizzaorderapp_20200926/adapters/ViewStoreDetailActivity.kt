package kr.co.tjoeun.pizzaorderapp_20200926.adapters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.co.tjoeun.pizzaorderapp_20200926.BaseActivity

class ViewStoreDetailActivity : BaseActivity {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_store_detail)

        setupEvents()
        setValues()
    }
}