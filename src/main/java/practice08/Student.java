package practice08;

import constant.StrTemplate;
import lombok.Data;
import lombok.EqualsAndHashCode;
import utils.StringUtils;

import java.util.Objects;

import static constant.CommonConstant.STUDENT;

@EqualsAndHashCode(callSuper = true)
@Data
public class Student extends Person {

    private Klass klass;

    private Klass leaderClass;

    public Student(String name, int age, Klass klass) {
        super(null,name, age,STUDENT);
        this.klass = klass;
    }

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age,STUDENT);
        this.klass = klass;
    }


    @Override
    public String introduce() {
       String name= StrTemplate.INTRODUCE_NAME;
       String age = StrTemplate.INTRODUCE_AGE;
       String career=StrTemplate.INTRODUCE_CAREER;
       String klass= "";
       if(Objects.nonNull(this.getKlass())){
           klass=StrTemplate.INTRODUCE_CLASS;
       }
       if(Objects.nonNull(this.getKlass().getLeader())&&this.klass.getLeader().getId().equals(getId())){
           klass=StrTemplate.INTRODUCE_LEADER_OF_CLASS;
       }
        if(Objects.nonNull(this.getLeaderClass())){
            klass=StrTemplate.INTRODUCE_LEADER_OF_CLASS;
            String template= StringUtils.contactStr(name,age,career,klass);
            return  String.format(template ,getName(),getAge(),getCareer(),getLeaderClass().getNumber());
        }


        String template= StringUtils.contactStr(name,age,career,klass);

       return  String.format(template ,getName(),getAge(),getCareer(),getKlass().getNumber());
    }


}
