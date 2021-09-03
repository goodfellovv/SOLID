package lsp.dao

abstract class PublicPerson implements Person {
    private String firstName
    private String lastName
    private short age
    private Gender gender

    String getFirstName() {
        return firstName
    }

    void setFirstName(String firstName) {
        this.firstName = firstName
    }

    String getLastName() {
        return lastName
    }

    void setLastName(String lastName) {
        this.lastName = lastName
    }

    @Override
    short getAge() {
        return age
    }

    @Override
    void setAge(short age) {
        this.age = age
    }

    @Override
    Gender getGender() {
        return gender
    }

    @Override
    void setGender(Gender gender) {
        this.gender = gender
    }

    abstract String whoAmI()
}