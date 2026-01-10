public class Leapyear_ternary {
    public static void main(String args[]){
        int year=2024;
        int flag;
        flag= year% 400 == 0|| (year % 4 ==0 && year % 100!=0)? 1:0;
        if(flag==1){
            System.out.println(year + " "+"is a leap year");

        }
        else{
    System.out.println(year+" "+"is not a leap year");
        }
    }
    
}
