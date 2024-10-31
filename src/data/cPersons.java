/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author PC
 */
public class cPersons {
    
    private long idPerson;
    private String name;
    private String lastName;
    private String email;
    private String contactNumber;
    private String gender;
    private int age;
    private long idUser;

    public long getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(long idPerson) {
        this.idPerson = idPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContacNumber() {
        return contactNumber;
    }

    public void setContacNumber(String contacNumber) {
        this.contactNumber = contacNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public cPersons() {
    }

    @Override
    public String toString() {
        return "cPersons{" + "idPerson=" + idPerson + ", name=" + name + ", lastName=" + lastName + ", email=" + email + ", contactNumber=" + contactNumber + ", gender=" + gender + ", age=" + age + ", idUser=" + idUser + '}';
    }
    
    public String toJSON() {
    return "{"
            + "\"name\": \"" + name + "\", "
            + "\"lastName\": \"" + lastName + "\", "
            + "\"email\": \"" + email + "\", "
            + "\"contactNumber\": \"" + contactNumber + "\", "
            + "\"gender\": \"" + gender + "\", "
            + "\"age\": " + age + ", "
            + "\"idUser\": " + idUser
            + "}";
    }
    
}
