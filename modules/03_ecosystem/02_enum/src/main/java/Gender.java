public enum Gender {

    MALE("male"),
    FEMALE("female"),
    DIVERSE("diverse");

    private final String value;

    Gender(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
