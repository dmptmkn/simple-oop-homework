import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.lang.reflect.Field;
import java.util.Arrays;

@Getter
@ToString(callSuper = true)
@EqualsAndHashCode
public class Person {

    private String name;
    private int age;
    private boolean married;

    public Person(String name, int age, boolean married) {
        this.name = name;
        this.age = age;
        this.married = married;
    }

    public void display() {
        System.out.println(this);
    }
}
