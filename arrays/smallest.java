//import java.util.Scanner;

public class smallest{
    public static void main(String args[]){
        int arr[]={12,10,13,9,34,5};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<arr[0]){
                min=arr[i];
            }

        }

System.out.println(min);
    }
}
  