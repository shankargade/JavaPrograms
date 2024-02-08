public class ConstructorPractice {
    public int Value;

    public ConstructorPractice(int value) {
        Value = value;
    }

    public static void main(String[] args) {
        ConstructorPractice cons = new ConstructorPractice(1000);
        System.out.println(cons);
    }
}
