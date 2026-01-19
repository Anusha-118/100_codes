class Prime{
    public static void main(String args[]){
        int num=3;
        int count=0;
        if(num<2){
            System.out.println(num + "is not a prime number");
        }
        for(int i=1;i<=num;i++){
            if(num % i == 0){
              
                count=count+1;
                
            }
            
        }
        if(count>2){
            System.out.println(num + "is not a prime number");
        }
        else{
            System.out.println(num +" " + "is a prime number");
        }
    }
}