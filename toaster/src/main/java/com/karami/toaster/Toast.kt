package com.karami.toaster

import android.content.Context
import android.widget.Toast

fun toaster(context: Context , msg: String){
    Toast.makeText(context, msg , Toast.LENGTH_LONG).show()

}