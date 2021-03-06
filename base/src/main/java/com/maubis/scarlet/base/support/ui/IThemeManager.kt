package com.maubis.scarlet.base.support.ui

import android.content.Context

interface IThemeManager {

  fun setup(context: Context)

  fun notifyChange(context: Context)

  fun isNightTheme(): Boolean

  fun get(type: ThemeColorType): Int

  fun get(context: Context, lightColor: Int, darkColor: Int): Int
}
