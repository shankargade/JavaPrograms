public class BlockOp {
    public int instanceVar;
    public static int someValue;
    static
    {
        someValue = 100;
    }
    static
    {
        someValue =someValue +10;
    }
    {
        instanceVar = someValue +10;
    }
    {
        instanceVar = instanceVar + 10;
    }
    BlockOp() {
    }
    public BlockOp(int instanceVar) {
        this.instanceVar = instanceVar;
    }
    public static void main(String[] args) {
        BlockOp obj1 = new BlockOp();
        BlockOp obj2 = new BlockOp();
        System.out.println(obj1.instanceVar); // 120,120,220
        System.out.println(obj1.someValue); // 100,100,100
        System.out.println(obj2.instanceVar); // 200,200, 220
        System.out.println(obj2.someValue); // 100,100,100

    }
}
