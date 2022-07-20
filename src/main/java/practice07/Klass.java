package practice07;

import lombok.Data;

import static constant.StrTemplate.DEFAULT_CLASS;

@Data
public class Klass {

    private int number;

    private String displayName;

    private Person leader;

    public Klass(int number) {
        this.number = number;
        displayName=DEFAULT_CLASS;//根据测试单元，暂时默认为Class 2
    }

    public void assignLeader(Person person) {
        this.leader=person;
    }
}
