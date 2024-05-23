package com.example.woof.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class dogs(val stringResourceId: Int,
                val imageResourceId: Int)
data class Dog(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)
