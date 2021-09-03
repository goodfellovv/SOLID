package lsp.dao

class SecretPerson implements Person {
    private short age
    private Gender gender

    SecretPerson() {
    }

    @Override
    short getAge() {
        return this.age
    }

    @Override
    void setAge(short age) {
        this.age = age
    }

    @Override
    Gender getGender() {
        return this.gender
    }

    @Override
    void setGender(Gender gender) {
        this.gender = gender
    }


    @Override
    String toString() {
        return "Secret person - |" +
                " First name: ********" +
                "; Last name: ********" +
                "; Age: ${age}" +
                "; Gender: ${gender}" +
                " |"
    }
}
