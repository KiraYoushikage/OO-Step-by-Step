package practice09;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import utils.StrUtils;

import java.util.Objects;

import static constant.StrTemplate.INTRODUCE_AGE;
import static constant.StrTemplate.INTRODUCE_NAME;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private Integer id;
    private String name;
    private int age;


    private String career;

    public String introduce() {
        String name=INTRODUCE_NAME;
        String age=INTRODUCE_AGE;
        String template= StrUtils.contactStr(name,age);
        return  String.format(template,this.name,this.age);
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
