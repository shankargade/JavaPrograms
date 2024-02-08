package string_program;

public class StringImmutability
{
    public static void main(String[] args)
    {


        // In java String is Immutable in nature



        String str1 = "Hello";  //

        String str2 = "Hello";  //

        String str3 = new String("Hello");

        String str4 = "world";
        str1 = str1 + " " + str4;
        System.out.println(str1.hashCode() +str1);
        System.out.println(str2.hashCode() + str2);
        System.out.println(str3.hashCode() + str3);
        System.out.println(str4.hashCode()+ str4);

        String str5 = "Hello world";
        System.out.println(str5.hashCode());
    }
}
