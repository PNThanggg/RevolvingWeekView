package revolving.week.lib.listener

import revolving.week.lib.WeekViewEvent

interface WeekViewLoader {
    /**
     * Load the events within the period
     *
     * @return A list with the events of this period
     */
    fun onWeekViewLoad(): MutableList<WeekViewEvent>
}