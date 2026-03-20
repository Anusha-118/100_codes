import java.util.Scanner;
public class Armstrong {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the number:");
       int number=sc.nextInt();

       int original=number;
       int digit=String.valueOf(number).length();
       int sum=0;
       
       while(number>0){
        int digits=number%10;
        sum=sum+ (int) Math.pow(digits,digit);
        number=number/10;
       }
       if(sum==original){
        System.out.println(original+" "+"is an Amstrong number");
       }
       else{
        System.out.println(original+" "+"is not an Armstrong number");
       }
    }
}
