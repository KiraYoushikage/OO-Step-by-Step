package practice10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author KiraYous
 * @version V1.0
 * @Package practice10
 * @date 2022/7/21 0:28
 */

public class ObersverTeacherGroup {

    public static final  Map<Integer, List<Teacher>> group;
    static{
        group=new HashMap<>();
    }

    public static void observe(int number ,Teacher teacher){
        List<Teacher> teachers=group.getOrDefault(number,new ArrayList<>());
        teachers.add(teacher);
        group.put(number, teachers);
    }

    public static void notifyLeaderInfos(){

    }

    public static void notifyStudentInfos(int number, Student student) {
        List<Teacher> teachers=group.get(number);
        teachers.forEach(teacher -> teacher.noticeStudentInfos(student));

    }
}
