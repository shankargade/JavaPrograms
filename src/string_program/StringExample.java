package string_program;

public class StringExample {
    public static void main(String[] args) {

        String s1 = "Saurabh";
        String s2 = new String("SHANKAR");
        String s3 = "Shankar";
        String s4 =" ";

        System.out.println(s2.length());
        System.out.println(s2.toLowerCase());
        System.out.println(s3.toUpperCase());
        System.out.println(s3.concat(s1));
        System.out.println(s2.charAt(2));
        System.out.println(s2.getBytes());
        System.out.println(s2.compareTo(s3));
        System.out.println(s3.compareToIgnoreCase(s2));
        System.out.println(s2.contains("SHANKAR"));
        System.out.println(s2.endsWith("R"));
        System.out.println(s2.indexOf("K"));
        System.out.println(s4.isBlank());
        System.out.println(s4.isEmpty());




        if (s2.equals(s3))
        {
            System.out.println(true);
            //System.out.println(s1+s2);
        }else {

            System.out.println("Not equal");
        }
    }
}
