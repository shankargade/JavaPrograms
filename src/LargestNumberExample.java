public class LargestNumberExample {

    public static void main(String[] args) {

        int x=59;
        int y=69;
        int z=79;
        int largestNumber= (x > y) ? (x > z ? x : z) : (y > z ? y : z);
        System.out.println("The largest numbers is:  "+largestNumber);
    }
}
