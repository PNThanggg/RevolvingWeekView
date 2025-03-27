package revolving.week.lib.listener

import android.graphics.RectF
import revolving.week.lib.WeekViewEvent

interface EventClickListener {
    /**
     * Triggered when clicked on one existing event
     *
     * @param event event clicked.
     * @param eventRect view containing the clicked event.
     */
    fun onEventClick(event: WeekViewEvent, eventRect: RectF)
}