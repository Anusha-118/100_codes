import java.util.Scanner;
public class Power2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num1:");
        int num1=sc.nextInt();
        System.out.println("enter num2:");
        int num2=sc.nextInt();
          System.out.println("enter res1:");
        int res1=sc.nextInt();
        System.out.println("enter res2:");
        int res2=sc.nextInt();
        
        int a,b;
        a=(int) Math.pow(num1,res1);
        b=(int) Math.pow(num2,res2);
        System.out.println(a);
        System.out.println(b);
    }
}
