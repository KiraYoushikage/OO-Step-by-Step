package practice10;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static constant.CommonConstant.NOT_ONE_OF_US;
import static constant.CommonConstant.STUDENT;
import static constant.StrTemplate.DEFAULT_CLASS;

@Data
public class Klass {

    private int number;

    private String displayName;

    private Person leader;

    private List<Person> members;

    public Klass(int number) {
        this.number = number;
        displayName = DEFAULT_CLASS;//根据测试单元，暂时默认为Class 2
        members = new ArrayList<>();
    }

    public void assignLeader(Person person) {

        if ((person instanceof Student) && person.getCareer().equals(STUDENT)) {
            Student student = (Student) person;
            //不是这么判断的
//            if(student.getKlass().getNumber()==this.number){
//                student.setLeaderClass(this);
//                this.leader=person;
//            }else{
//                System.out.print(NOT_ONE_OF_US+"\n");
//            }
            if (this.members.stream().anyMatch(member -> member.isEqualTo(person))) {
                student.setLeaderClass(this);
                this.leader = person;
                ObersverTeacherGroup.notifyLeaderInfos(student.getKlass().getNumber(),student);
            } else {
                System.out.print(NOT_ONE_OF_US + "\n");
            }

        }
    }



    public void appendMember(Person member) {
        if(Objects.nonNull(member) && member instanceof Student){
            this.members.add(member);
            Student student=(Student)member;
            ObersverTeacherGroup.notifyStudentInfos(student.getKlass().getNumber(),student);
        }

    }

    public boolean isEqualTo(Object object){
        if (Objects.isNull(object))return false;
        if(object instanceof Klass)
            return getNumber()==(((Klass) object).getNumber());
        return false;
    }
}
