public class StaticBlock {

    public static int FoundationYear ;
    public int VariableAdd;

    static {

        FoundationYear = 1989;
    }

    static
    {
        FoundationYear =FoundationYear+10 ;
    }
    {
        VariableAdd = 999;
    }

    {
        VariableAdd =VariableAdd+2;
    }

    public static void main(String[] args) {
        StaticBlock staticBlock = new StaticBlock();
        StaticBlock staticblock2 = new StaticBlock();

        System.out.println(staticBlock.VariableAdd);
        System.out.println(staticBlock.FoundationYear);
        System.out.println(staticblock2.FoundationYear);
        System.out.println(staticblock2.VariableAdd);



    }
}

