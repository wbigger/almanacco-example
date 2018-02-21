class Year(val year: Int) {
    val isLeap: Boolean
    get() {
        var isLeap = (year % 4) == 0

        isLeap = isLeap && (year % 100) != 0

        isLeap = isLeap || (year % 400) == 0

        return isLeap
    }
}