class Prime_Bool{
    public static void main(String args[]){
        int i;
        int n=14;
        boolean isprime=true;
        if(n<2){
            System.out.println(n+"is not prime");
        }
        else{
            for(i=2;i<n;i++){

            if(n%i==0){
                isprime=false;
            }
        }
        String result= isprime?"prime":"not prime";
        System.out.println(result);

    }
}}