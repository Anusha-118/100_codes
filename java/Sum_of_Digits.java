public class Sum_of_Digits {
    public static void main(String[] args) {
       
        int num=722;
        int sum=0;
         while(num!=0){
        
        sum=sum+num%10;
        num=num/10;
         //System.out.println(sum);
    }
   System.out.println(sum);
}
}
