package com.example.a30days.model

import android.service.quicksettings.Tile
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

class Skill (
    val day : Int,
    @StringRes val titleRes : Int,
    @DrawableRes val imageRes : Int,
    @StringRes val descRes : Int,
)