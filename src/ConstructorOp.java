public class ConstructorOp extends ParentClass {
    public int attribute1;

    public ConstructorOp() {
      // super();
    }

    int ConstructorOp()
    {
        System.out.println("Its method");
        return 0;
    }
    ConstructorOp(int attribute1) {
        this.attribute1 = attribute1;
    }

    @Override
    public String toString() {
        return "ConstructorOp{" +
                "attribute1=" + attribute1 +
                ", baseAttribute=" + baseAttribute +
                '}';
    }

    public static void main(String[] args) {
        ConstructorOp obj1 = new ConstructorOp();
        ConstructorOp obj2 = new ConstructorOp(100);
        obj1.ConstructorOp();
        obj2.ConstructorOp();
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
