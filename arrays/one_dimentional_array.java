import java.util.Scanner;
class one_dimentional_array
{
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        int nums[]=new int[4];
        for(int i=0;i<4;i++){
        System.out.println("enter the element:");
        nums[i]=sc.nextInt();
    }
        

        System.out.println("Array elements are:");
    
        for(int i=0;i<4;i++){
        
            System.out.println(nums[i]);
        }
        sc.close();
    }
}