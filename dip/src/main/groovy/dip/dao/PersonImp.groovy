package dip.dao

class PersonImp implements Person{
    private String firstName
    private String lastName
    private short age
    private Gender gender

    PersonImp() {
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
