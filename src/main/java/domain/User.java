package domain;

public class User {

    private long id;
    private String firstName;
    private String lastName;
    private int age;
    private char sex;

    public User(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /////////////////////////////////////

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setSex(char sex){
        this.sex = sex;
    }

    public char getSex(){
        return  sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}