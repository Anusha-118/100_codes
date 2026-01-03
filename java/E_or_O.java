public class E_or_O
 {
   public static void main (String[]args)
   {
     int number = 29;
     String status = number % 2 == 0 ? " is Even" : " is Odd";
       System.out.println (number + status);
   }
 }