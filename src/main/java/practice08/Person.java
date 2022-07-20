package practice08;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private Integer id;
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

    public Person(Integer id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

//    public Person(Integer id, String name, int age, String career) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//        this.career = career;
//    }

    public boolean isEqualTo(Object object){
        if (Objects.isNull(object))return false;
        if(object instanceof Person)
            return getId().equals(((Person) object).getId());
        return false;
    }

}
