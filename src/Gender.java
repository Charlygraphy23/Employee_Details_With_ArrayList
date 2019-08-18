public enum Gender {
    M("Male"),
    F("Female"),
    O("Other");

    private String description;

    Gender(String description){
        this.description=description;
    }

    public String getDescription() {
        return description;
    }
}
