package io.github.lsj8367.domain;

public record Member(
    String email,
    String name,
    Gender gender
) {

    public boolean isMale() {
        return Gender.MALE.equals(gender);
    }

    public enum Gender {
        MALE, FEMALE
    }
}
