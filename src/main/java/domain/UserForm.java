package domain;

public class UserForm {

    private String id;
    private String name;
    private String age;
    private String sex;

    public UserForm(String id, String name, String age, String sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String firstName) {
        this.name = name;
    }


    /////////////////////////////////////

    public void setAge(String age){
        this.age = age;
    }

    public String getAge(){
        return age;
    }

    public void setSex(String sex){
        this.sex = sex;
    }

    public String getSex(){
        return  sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}