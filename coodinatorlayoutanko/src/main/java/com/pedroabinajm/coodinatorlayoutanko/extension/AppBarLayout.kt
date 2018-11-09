package com.pedroabinajm.coodinatorlayoutanko.extension

import android.support.design.widget.AppBarLayout
import android.support.design.widget.CollapsingToolbarLayout

val scroll: Int
    get() = AppBarLayout.LayoutParams.SCROLL_FLAG_SCROLL

val exitUntilCollapsed: Int
    get() = AppBarLayout.LayoutParams.SCROLL_FLAG_EXIT_UNTIL_COLLAPSED

val pin: Int
    get() = CollapsingToolbarLayout.LayoutParams.COLLAPSE_MODE_PIN
