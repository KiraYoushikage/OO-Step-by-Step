package practice10;


import constant.StrTemplate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import utils.StrUtils;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static constant.CommonConstant.TEACHER;

//TODO 职业,格式
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher extends Person {

    private List<Klass> klasses;

    public Teacher(String name, int age) {
        super(null ,name, age,TEACHER);
    }


    public Teacher(String name, int age, List<Klass> klasses) {
        super(null,name, age,TEACHER);
        this.klasses = klasses;
        klasses.forEach(klass->{
            int number=klass.getNumber();
            ObersverTeacherGroup.observe(number,this);
        });

    }

    public Teacher(int id, String name, int age, List<Klass> klasses) {
        super(id, name, age,TEACHER);
        this.klasses = klasses;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age,TEACHER);
    }


    public List<Klass> getClasses() {
        return klasses;
    }

    public void setClasses(List<Klass> klasses) {
        this.klasses = klasses;
    }

    @Override
    public String introduce() {

        String name= StrTemplate.INTRODUCE_NAME;
        String age = StrTemplate.INTRODUCE_AGE;
        String career=StrTemplate.INTRODUCE_CAREER;
//        String klass= StrTemplate.INTRODUCE_TEACH_CLASS;
        String klass= StrTemplate.INTRODUCE_TEACH_LOTS_OF_CLASS;


        if(Objects.isNull(getKlasses()) || getKlasses().size()==0)
        {
            klass = StrTemplate.TEACH_NO_CLASS;
            String template = StrUtils.contactStr(name,age,career,klass);
            return String.format(template,getName(),getAge(),getCareer());
        }
        List<String>  numbers= getKlasses().stream().map(o->Integer.toString(o.getNumber())).collect(Collectors.toList());
        klass+=String.join(", ",numbers);
        klass+='.';
        String template = StrUtils.contactStr(name,age,career,klass);
        return String.format(template,getName(),getAge(),getCareer());

    }


    public String introduceWith(Student jerry) {

        if (getKlasses().stream().anyMatch(klass -> klass.isEqualTo(jerry.getKlass()))){
            return String.format("My name is %s. I am %d years old. I am a %s. I teach %s.",getName(),getAge(),getCareer(),jerry.getName());
        }
        return String.format("My name is %s. I am %d years old. I am a %s. I don't teach %s.",getName(),getAge(),getCareer(),jerry.getName());

    }

    public boolean isTeaching(Student jerry) {
        return getKlasses().stream().anyMatch(o->o.isEqualTo(jerry.getKlass()));
    }

    public void noticeStudentInfos(Student student) {
        String res=String.format("I am %s. I know %s has joined Class %d.\n",getName(),student.getName(),student.getKlass().getNumber());
        System.out.println(res);
    }
    public void noticeLeaderInfos(Student student) {
        String res=String.format("I am %s. I know %s become Leader of Class %d.\n",getName(),student.getName(),student.getKlass().getNumber());
        System.out.println(res);
    }


}
