import java.util.Locale;

public enum Gender {
    MALE("male"),
    FEMALE("female"),
    UNKNOWN("unknown");

    private String genderName;

    Gender(String genderName) {
        this.genderName = genderName;
    }
}
