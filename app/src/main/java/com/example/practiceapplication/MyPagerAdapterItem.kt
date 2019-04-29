package com.example.practiceapplication

import android.graphics.Color
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.my_view_pager_adapter_item.*

class MyPagerAdapterItem: Fragment() {
    lateinit var adapterData: MainActivity.CustomListItem

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.my_view_pager_adapter_item, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tv.text = "Fragment position ${adapterData.name}"
        tv.setBackgroundColor(Color.parseColor(adapterData.bgColor))
    }
}