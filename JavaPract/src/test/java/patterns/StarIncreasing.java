package patterns;

public class StarIncreasing {
    public static void main(String[] args){
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=i; j<=n; j++){
                System.out.println("");
            }
            for (int j = 1; j < i; j++) {
                System.err.println("*");
                
            }
            System.out.println();
           // )
        }
    }
    
}
