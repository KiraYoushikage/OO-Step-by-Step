package practice07;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
    private int id;
    private String name;
    private int age;
    private String career;

    public String introduce() {
        return  String.format("My name is %s. I am %d years old.",name,age);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public boolean isEqualTo(Object object){
        if(object instanceof Person)
            return (this.id==((Person) object).getId());
        return false;
    }

}
