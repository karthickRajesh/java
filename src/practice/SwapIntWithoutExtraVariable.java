package practice;

public class SwapIntWithoutExtraVariable {

    public static void main(String[] args) {

        int a =10;
        int b = 17;
        System.out.println("Before Swapping a=" + a + " b=" +b);

        b = b-a; // 17-10=7
        a= b+a; // 7+10=17
        b= a-b; //17-7=10

        System.out.println("After Swapping a=" + a + " b=" +b);
    }
}
