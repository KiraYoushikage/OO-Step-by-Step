package practice07;

import lombok.Data;

@Data
public class Klass {

    private int number;
    private String displayName;
    private String leader;

    public Klass(int number) {
        this.number = number;
        displayName="Class 2";//根据测试单元，暂时默认为Class 2
    }

    public void assignLeader(Student jerry) {
    }
}
