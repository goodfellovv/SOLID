package isp.dao

interface PublicPerson extends Person {

    void setFirstName(String firstName)

    String getFirstName()

    void setLastName(String lastName)

    String getLastName()
}