public class P {
    public static void main(String[] args) {
        int a=10;int b=20;
        
        for(int n=a;n<=b;n++){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count+=1;
            }
        }
        if(count==2){
            System.out.println(n);
        }
        
    }
}
}
