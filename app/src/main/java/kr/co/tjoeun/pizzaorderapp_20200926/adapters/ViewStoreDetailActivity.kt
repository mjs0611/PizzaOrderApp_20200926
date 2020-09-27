package kr.co.tjoeun.pizzaorderapp_20200926.adapters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.gun0912.tedpermission.PermissionListener
import kotlinx.android.synthetic.main.activity_view_store_detail.*
import kr.co.tjoeun.pizzaorderapp_20200926.BaseActivity
import kr.co.tjoeun.pizzaorderapp_20200926.R
import kr.co.tjoeun.pizzaorderapp_20200926.datas.Store
import java.security.Permission

class ViewStoreDetailActivity : BaseActivity {

    lateinit var mStore : Store

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_store_detail)

        setupEvents()
        setValues()

    }

    override fun setupEvents() {

        callBtn.setOnClickListener {
            val pl = object : PermissionListener {
                override fun onPermissionGranted() {

                }

                override fun onPermissionDenied(deniedPermissions: MutableList<String>?) {

                }

            }
        }

    }

    override fun setValues() {
        mStore = intent.getSerializableExtra("storeData") as Store

        Glide.with(mContext).load(mStore.logoUrl).into(storeLogoImg)
        storeNameTxt.text = mStore.brandname
        phoneNumTxt.text = mStore.phoneNum
    }

}