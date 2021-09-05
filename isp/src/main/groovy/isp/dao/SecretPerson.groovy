package isp.dao

class SecretPerson implements AnonymousPerson {
    private short age
    private Gender gender
    private String job

    SecretPerson() {
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

    @Override
    String getJob() {
        return job
    }

    @Override
    void setJob(String job) {
        this.job = job
    }
}
