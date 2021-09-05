package isp.dao

final class FamousPerson implements PublicPerson {
    private String firstName
    private String lastName
    private short age
    private Gender gender

    FamousPerson() {
    }

    @Override
    String getFirstName() {
        return firstName
    }

    @Override
    void setFirstName(String firstName) {
        this.firstName = firstName
    }

    @Override
    String getLastName() {
        return lastName
    }

    @Override
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
}
