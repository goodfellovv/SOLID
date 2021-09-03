package ocp.dao

class Laborer implements Person {
    private String firstName
    private String lastName
    private short age
    private Gender gender

    Laborer() {
    }

    @Override
    String getFirstName() {
        return firstName
    }

    @Override
    String getLastName() {
        return lastName
    }

    @Override
    short getAge() {
        return age
    }

    @Override
    Gender getGender() {
        return gender
    }
}
