class array4{
    public static void main(String args[]){
        int arr[]=new int[4];
        for(int i=0;i<4;i++){
            arr[i]=(int)(Math.random()*10);
        }

        for(int i=0;i<4;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
System.out.println("second ele of array is:"+arr[2]);
    }

}
