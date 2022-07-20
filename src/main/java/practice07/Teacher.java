package practice07;


import constant.StrTemplate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import utils.StringUtils;

import java.util.Objects;

import static constant.CommonConstant.TEACHER;

//TODO 职业,格式
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher extends Person {

    private Klass klass;

    public Teacher(String name, int age) {
        super(null ,name, age,TEACHER);
    }


    public Teacher(String name, int age, Klass klass) {
        super(null,name, age,TEACHER);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age,TEACHER);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age,TEACHER);
    }


    @Override
    public String introduce() {

        String name= StrTemplate.INTRODUCE_NAME;
        String age = StrTemplate.INTRODUCE_AGE;
        String career=StrTemplate.INTRODUCE_CAREER;
        String klass= StrTemplate.INTRODUCE_TEACH_CLASS;


        if(Objects.isNull(getKlass()))
        {
            klass = StrTemplate.TEACH_NO_CLASS;
            String template = StringUtils.contactStr(name,age,career,klass);
            return String.format(template,getName(),getAge(),getCareer());
        }

        String template = StringUtils.contactStr(name,age,career,klass);
        return String.format(template,getName(),getAge(),getCareer(),getKlass().getNumber());

    }


    public String introduceWith(Student jerry) {

        if (getKlass().getNumber()==jerry.getKlass().getNumber()){
            return String.format("My name is %s. I am %d years old. I am a %s. I teach %s.",getName(),getAge(),getCareer(),jerry.getName());
        }
        return String.format("My name is %s. I am %d years old. I am a %s. I don't teach %s.",getName(),getAge(),getCareer(),jerry.getName());

    }
}
