/*import java.util.*;

public class Strings {
    public static void main(String args[]){
        //concatenation
        String firstName = "Pragati";
        String lastName = "Bangar";
        String fullName = firstName + " "+ lastName;
        System.out.println(fullName);
    }
}


import java.util.*;

public class Strings {
    public static void main(String args[]){

        String firstName = "Pragati";
        String lastName = "Bangar";
        String fullName = firstName + " "+ lastName;
        System.out.println(fullName.length());

        //charAt
        for(int i = 0 ; i<fullName.length() ; i++){
            System.out.println(fullName.charAt(i));
        }
    }
}

import java.util.*;

public class Strings {
    public static void main(String args[]){
        String name1 = "Pragati";
        String name2 = "Nutan";
        //1  s1>s2  : positive value
        //2  s1=s2  : 0
        //3  s1<s2  : negative value
        //if(name1.compareTo(name2)== 0){
        //   System.out.print("Strings are equal");
        //} else {
        //    System.out.print("Strings are not equal");
        //}
        if(name1== name2){
            System.out.print("Strings are equal");
        } else {
            System.out.print("Strings are not equal");
        }
    }
}

//String builder

import java.util.*;

public class Strings {
    public static void main(String args []){
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        
        //char At index 0
        System.out.println(sb.charAt(0));

        //set char At index 0
       
        sb.setCharAt(0 , 'A');
        System.out.println(sb);
        
        sb.setCharAt(2 , 'n');
        System.out.println(sb);

        //delete the extra 'p'
        sb.delete(3,4);
        System.out.print(sb);


    }
}

import java.util.*;

public class Strings {
    public static void main(String args []){
        StringBuilder sb = new StringBuilder("h");
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");
        System.out.println(sb);
        System.out.println(sb.length());
    }
}*/

import java.util.*;
public class Strings{
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Hello");
        
      for(int i =0 ; i< sb.length()/2 ; i++ ){
        
            int front = i ; 
            int back = sb.length()-1-i ;         //5-1-0 = H go to 4 position
       
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
             
            sb.setCharAt(front , backChar);
            sb.setCharAt(back , frontChar);
      }    
      System.out.println(sb);
    }
}

