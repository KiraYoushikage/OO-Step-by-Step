package practice07;

public class Student extends Person {

    private Klass klass;

    public Student(String name, int age, Klass klass) {
        super(-1,name, age,"Student");
        this.klass = klass;
    }

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
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
       return  String.format("My name is %s. I am %d years old. I am a %s. I am at Class %d.",getName(),getAge(),getCareer(),getKlass().getNumber());
    }
}
