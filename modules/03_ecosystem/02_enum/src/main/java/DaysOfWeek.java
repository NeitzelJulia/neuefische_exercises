public enum DaysOfWeek {

    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    private final String value;

    DaysOfWeek(String value) {
        this.value = value;
    }

    public String getValue() {
        if (this == SATURDAY || this == SUNDAY) {
            return "Weekend";
        }
        return value;
    }

}
