package lombok.builder;

import org.junit.Test;

import static org.junit.Assert.*;

public class ObjTest {

    @Test
    public void test1() {

        Obj o = Obj.builder()
                .number(3)
                .name("devin")
                .build();

        System.out.println(o);

    }


}