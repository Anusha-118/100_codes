public class Prime2_bool {
    public static void main(String args[]){
        int i;
        int n=13;
        boolean isprime=true;
        if(n<2){
            System.out.println(n+"not a prime");
        }
        else{
            for(i=2;i<=n/2;i++){
            if(n%i==0){
                isprime=false;
            }
        }
        String result=isprime?n+" "+"is a prime number":n+" "+"is not a prime number";
        System.out.println(result);

    }
    
}}
