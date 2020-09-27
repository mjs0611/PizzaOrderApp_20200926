package kr.co.tjoeun.pizzaorderapp_20200926.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import kr.co.tjoeun.pizzaorderapp_20200926.R
import kr.co.tjoeun.pizzaorderapp_20200926.datas.Store

class StoreAdapter(
    val mContext:Context,
    resID:Int,
    val mList:List<Store>) : ArrayAdapter<Store>(mContext, resID, mList) {

    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.store_list_item, null)
        }

        val row = tempRow!!


        val logoIng = row.findViewById<ImageView>(R.id.logoImg)
        val brandNameTxt = row.findViewById<TextView>(R.id.brandNameTxt)

        val storeData = mList[position]

        brandNameTxt.text = storeData.brandname

        return row

    }


}