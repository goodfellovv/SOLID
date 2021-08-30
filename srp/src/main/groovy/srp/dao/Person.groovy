package srp.dao

class Person {
    private String firstName
    private String lastName
    private short age
    private Gender gender

    Person() {
    }

    Person(String firstName, String lastName, short age, Gender gender) {
        this.firstName = firstName
        this.lastName = lastName
        this.age = age
        this.gender = gender
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
