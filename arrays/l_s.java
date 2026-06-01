public class l_s {
    public static void main(String args[]){
        int arr[]={12,13,20,4,30,60};
       int smallest=arr[0],largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[0]){
                largest=arr[i];
            }
            if(arr[i]<arr[0]){
                smallest=arr[i];
            }
        }
        System.out.println(smallest);
        System.out.println(largest);
    } 
    
}
