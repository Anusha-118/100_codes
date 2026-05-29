public class Twod {
    public static void main(String args[]){
        double nums[][]=new double[3][4];
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
        
        nums[i][j]= (Math.random()*10);//random generates desimal values.so, convert into int using type casting
        
            }
            
        }
        
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
        
        System.out.print(nums[i][j]+ " ");
        
            }
            System.out.println();
        }
        

    }
}
