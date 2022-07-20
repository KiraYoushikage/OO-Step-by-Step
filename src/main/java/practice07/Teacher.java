package practice07;


import java.util.Objects;

//TODO 职业,格式
public class Teacher extends Person {

    private Klass klass;

    public Teacher(String name, int age) {
        super(-1,name, age,"Teacher");
    }

    public Teacher(String name, int age, Klass klass) {
        super(-1,name, age,"Teacher");
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {

        if(Objects.isNull(getKlass())) return String.format("My name is %s. I am %d years old. I am a %s. I teach No Class.",getName(),getAge(),getCareer());

        return  String.format("My name is %s. I am %d years old. I am a %s. I teach Class %d.",getName(),getAge(),getCareer(),getKlass().getNumber());
    }


    public String introduceWith(Student jerry) {

        if (getKlass().getNumber()==jerry.getKlass().getNumber()){
            return String.format("My name is %s. I am %d years old. I am a %s. I teach %s.",getName(),getAge(),getCareer(),jerry.getName());
        }
        return String.format("My name is %s. I am %d years old. I am a %s. I don't teach %s.",getName(),getAge(),getCareer(),jerry.getName());

    }
}
