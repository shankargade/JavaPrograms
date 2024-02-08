package InheritancePrograms;

public class HierarchyClassDemo {

    public static void main(String[] args) {

        HierarchyClassD d1 =new HierarchyClassD();
        d1.a=10;
        d1.d=20;
        d1.display();

        HierarchyClassC c1 = new HierarchyClassC();
        c1.c =30;
        c1.a=40;
        c1.display();

        HierarchyClassB b1 = new HierarchyClassB();
        b1.a =40;
        b1.b =50;
        b1.display();

        HierarchyClassA a1 = new HierarchyClassA();
        a1.a=60;
        a1.display();


    }
}
