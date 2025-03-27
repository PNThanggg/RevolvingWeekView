package revolving.week.lib.listener

import revolving.week.lib.DayTime

interface AddEventClickListener {
    /**
     * Triggered when the users clicks to create a new event.
     *
     * @param startTime The startTime of a new event
     * @param endTime The endTime of a new event
     */
    fun onAddEventClicked(startTime: DayTime, endTime: DayTime)
}