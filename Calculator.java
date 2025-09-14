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
            System.out.println("Addition of a and b is:"a+b);
            break;
            case 2:
            System.out.println("Subtraction of a and b is:"a-b);
            break;
            case 3:
            System.out.println("Multiplication of a and b is:"a*b);
            break;
            case 4:
            if (b==0) {
                System.out.println("invalid divison");
            }else{
                System.out.println("Division of a and b is:"a/b);
            }break;
            case 5:
            if(b==0){
                System.out.println("invalid divison");
            }else{
                System.out.println("Modulo division of a and b is:"a%b);
            }break;
            default:
            System.out.println("invalid operator");
        }
    }
}

