
/*import java.util.*;

public class Pattern {
    public static void main(String args[]){
        int m = 4;
        int n= 5;

        for( int i = 1 ; i<=m ; i++ ){
           for( int j = 1 ; j<=n ; j++ ){
               System.out.print("*");
        }
        System.out.println();
    }
}
}

import java.util.*;

public class Pattern {
    public static void main(String args[]){
        int p = 4;
        int q = 5;

        for( int i = 1 ; i<= p ; i++ ){
           for( int j = 1 ; j<= q ; j++ ){
               if(i==1 || j==1 || i==p || j==q){
                  System.out.print("*");
                } else {
                  System.out.print(" ");
               }
            }
            System.out.println();
        }
    }
}

import java.util.*;

public class Pattern {
    public static void main(String args[]){
        int p = 4;
        for(int i=1 ; i<=p ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
        System.out.println();
        }
    }
}

public class Pattern {
    public static void main(String args[]){
        int k = 4;
        for(int i=k ; i>=1 ; i--){
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class Pattern {
    public static void main(String args[]){
        int k = 4;
        
        for(int i=1 ; i<=k ; i++) {
         
            for(int j=1 ; j<=k-i ; j++) {
                System.out.print(" ");
            }
            
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}

public class Pattern{
    public static void main(String args[]){
        int p = 5;
        for(int i = 1 ; i<=p ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

public class Pattern{
    public static void main(String args[]){
        int p = 5;
        for(int i = 1 ; i<=p ; i++){
            for(int j=1 ; j<=p-i+1 ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}


public class Pattern{
    public static void main(String args[]){
        int p = 5;
        int number = 1;
        for(int i = 1 ; i<=p ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}*/

public class Pattern{
    public static void main(String args[]){
        int n = 5;
        for(int i = 1 ; i<=n ; i++){
            for(int j=1 ; j<=i ; j++){
                int sum = i+j;
                if(sum % 2==0){
                   System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
