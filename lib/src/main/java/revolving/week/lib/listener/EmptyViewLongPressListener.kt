package revolving.week.lib.listener

import revolving.week.lib.DayTime

interface EmptyViewLongPressListener {
    /**
     * Similar to [EmptyViewClickListener] but with a long press.
     *
     * @param time [DayTime] object set with the day and time of the long-pressed position on the view.
     */
    fun onEmptyViewLongPress(time: DayTime)
}