package com.delightroom.android.daro

import android.content.Context
import android.widget.Toast

class DARO {
    fun showToast(context: Context, massage: String) {
        Toast.makeText(context, massage, Toast.LENGTH_SHORT).show()
    }
}