package constant;

import lombok.Data;

@Data
public class StrTemplate {

    public static final String INTRODUCE_NAME="My name is %s.";
    public static final String INTRODUCE_AGE="I am %d years old.";
    public static final String INTRODUCE_CAREER="I am a %s.";
    public static final String INTRODUCE_CLASS="I am at Class %d.";
    public static final String INTRODUCE_LEADER_OF_CLASS="I am Leader of Class %d.";

    public static final String DEFAULT_CLASS="Class 2";
}
