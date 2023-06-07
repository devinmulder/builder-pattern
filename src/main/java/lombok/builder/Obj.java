package lombok.builder;

public class Obj {
    private int number;
    private String name;

    Obj(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public static Obj.ObjBuilder builder() {
        return new Obj.ObjBuilder();
    }

    public static class ObjBuilder {
        private int number;
        private String name;

        ObjBuilder() {
        }

        public Obj.ObjBuilder number(int number) {
            this.number = number;
            return this;
        }

        public Obj.ObjBuilder name(String name) {
            this.name = name;
            return this;
        }

        public Obj build() {
            return new Obj(this.number, this.name);
        }

        public String toString() {
            return "Obj.ObjBuilder(number=" + this.number + ", name=" + this.name + ")";
        }
    }
}