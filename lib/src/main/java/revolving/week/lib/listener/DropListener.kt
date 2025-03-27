package revolving.week.lib.listener

import android.view.View
import revolving.week.lib.DayTime

interface DropListener {
    /**
     * Triggered when view dropped
     *
     * @param view dropped view.
     * @param day object set with the day and time of the dropped coordinates on the view.
     */
    fun onDrop(view: View, day: DayTime)
}