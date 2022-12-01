/* 
public class AdvancePattern {
   public static void main(String args[]){
    int s = 5 ;
    //upper half
    for(int i=1 ; i<=s ; i++){
        //first part
        for(int j=1 ; j<=i ;  j++){
            System.out.print("*");
        }
        //spaces
        int spaces = 2* (s-i);
        for(int j=1 ; j<=spaces ; j++){
            System.out.print(" ");
        }
        //2 part 
        for(int j=1 ; j<=i ; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    //lower half
    for(int i=s ; i>=1 ; i--){
        // first part
        for (int j = 1 ; j<=i ; j++){
              System.out.print("*");
        }
        //spaces
        int spaces = 2*(s-i);
        for(int j =1 ; j<=spaces ; j++){
            System.out.print(" ");
        }
            //2 part
        for(int j = 1 ; j<=i ; j++){
             System.out.print("*");
        }
        System.out.println();
        }
    } 
}


public class AdvancePattern{
    public static void main(String args[]){
        int n = 5;
        for(int i=1 ; i<=n ; i++){
            
            for(int j=1 ; j<=n-i ; j++){
                 System.out.print(" ");
            } 
            for(int j=1 ; j<=5 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class AdvancePattern{
    public static void main(String args[]){
         int p = 5;
         for(int i=1 ; i<=p ; i++){

            for (int j=1 ; j<=p-i ; j++){
                System.out.print(" ");
            }
            for( int j=1 ; j<=i ; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

public class AdvancePattern {
    public static void main(String args []) {
        int n = 5;
        
        for(int i=1 ; i<=n ;i++){
            //spaces
            for(int j=1 ; j<=n-i ; j++){
                System.out.print(" ");
            }
            //1st half number
            for(int j=i ; j>=1 ; j--){
                System.out.print(j);
            }
            //2 half numbers
            for(int j=2 ; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}*/

public class AdvancePattern{
    public static void main(String args []){
        int n = 4;
        //lower half
        for(int i=1 ; i<=n ; i++){
            //spaces
            for(int j=1 ; j<=n-i ; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1 ; j<=2*i-1 ; j++){
                 System.out.print("*");
            }
            System.out.println();
        }
        for(int i =n ; i>=1 ; i--){
            //spaces
            for(int j=1 ; j<=n-i ; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1 ; j<=2*i-1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}