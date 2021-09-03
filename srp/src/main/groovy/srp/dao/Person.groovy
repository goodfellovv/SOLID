package srp.dao

class Person {
    private String firstName
    private String lastName
    private short age
    private Gender gender

    Person() {
    }

    String getFirstName() {
        return firstName
    }

    String getLastName() {
        return lastName
    }

    short getAge() {
        return age
    }

    Gender getGender() {
        return gender
    }
}
