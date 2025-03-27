package revolving.week.lib.listener

import androidx.annotation.ColorInt
import revolving.week.lib.WeekViewEvent

interface TextColorPicker {
    @ColorInt
    fun getTextColor(event: WeekViewEvent): Int
}