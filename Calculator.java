import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int a,b;
        Scanner s=new Scanner(System.in);
        System.out.println("enter a,b values:");
        a=s.nextInt();
        b=s.nextInt();
        System.out.println("enter the operator case:");
        int operator=s.nextInt();
        //operators
        // 1==>+
        // 2==>-
        // 3==>*
        // 4==>/
        // 5==>%
        switch(operator){
            case 1:
            System.out.println(a+b);
            break;
            case 2:
            System.out.println(a-b);
            break;
            case 3:
            System.out.println(a*b);
            break;
            case 4:
            if (b==0) {
                System.out.println("invalid divison");
            }else{
                System.out.println(a/b);
            }break;
            case 5:
            if(b==0){
                System.out.println("invalid divison");
            }else{
                System.out.println(a%b);
            }break;
            default:
            System.out.println("invalid operator");
        }
    }
}
