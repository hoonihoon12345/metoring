package com.mentoring.sample.util.dummy

import androidx.annotation.DrawableRes
import com.mentoring.sample.ui.adapter.MainRecyclerAdapter


data class DummyContents(
    val id: String,
    @DrawableRes val iconRes: Int,
    val price: Int,
    val onClick: (id: String) -> Unit
)