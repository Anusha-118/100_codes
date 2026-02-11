//import java.util.Scanner;
class Palindrome{
    public static void main(String args[]){
        //Scanner sc=new Scanner(system.in);
        //System.out.println("enter the number:");
  //      int original=sc.nextInt();
  
         int original=12921;
         int temp =original;
         int digit;
         int reverse=0;
        while(temp!=0){
            digit = temp %10;
            reverse=reverse * 10 +digit;
            temp= temp/10;

        }
       // System.out.println(reverse);
if(original==reverse){
    System.out.println("number is a palindrome");
}
else{
    System.out.println("number is not a palindrome");
}

    }
}