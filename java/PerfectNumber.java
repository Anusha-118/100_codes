public class PerfectNumber {
    public static void main(String[] args) {
        int n=6;  //sum of divisors is calles perfect number divisorsof 6 are 1,2,3, 1+2+3=6 6==6
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(sum==n){
            System.out.println(n+ " "+ "is a perfect number");
        
        }
        else{
        System.out.println(n+ " "+ "not a perfect number");
    }}
    
}
