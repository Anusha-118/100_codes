//import java.util.Scanner;

public class largest{
    public static void main(String args[]){
        int arr[]={12,10,13,9,34,5};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[0]){
                max=arr[i];
            }

        }

System.out.println(max);
    }
}
  