package practice05;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
    private String name;
    private int age;


    public String introduce() {
        return  String.format("My name is %s. I am %d years old.",name,age);
    }
}
