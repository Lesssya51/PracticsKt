fun calculateFrames(minutes: Int, fps: Int): Int {
    val seconds = minutes * 60
    return seconds * fps
    fun main(){
        val minutes = 5
        val fps = 60
        val frames = calculateFrames(minutes, fps)
        println(frames)
    }
}