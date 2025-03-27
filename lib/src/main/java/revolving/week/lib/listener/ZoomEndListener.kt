package revolving.week.lib.listener

interface ZoomEndListener {
    /**
     * Triggered when the user finishes a zoom action.
     * @param hourHeight The final height of hours when the user finishes zoom.
     */
    fun onZoomEnd(hourHeight: Int)
}