package practice06;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
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

}
