package lombok.builder;

public class App {

    public static void main(String[] args) {

        Obj o = Obj.builder()
                .number(3)
                .name("devin")
                .build();

        System.out.println(o);
    }
}
