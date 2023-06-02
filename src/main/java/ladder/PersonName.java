package ladder;

public class PersonName {
    private final String value;

    public PersonName(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("5자를 초과할 수 없습니다.");
        }
        this.value = name;
    }
}
