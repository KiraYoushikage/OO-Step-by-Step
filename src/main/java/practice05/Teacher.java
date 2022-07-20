package practice05;

import lombok.Data;


public class Teacher extends Person {

    private int klass=-1;


    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {

        if(getKlass()==-1) return String.format("My name is %s. I am %d years old. I am a Teacher. I teach No Class.",getName(),getAge());

        return  String.format("My name is %s. I am %d years old. I am a Teacher. I teach Class %d.",getName(),getAge(),getKlass());
    }


}
