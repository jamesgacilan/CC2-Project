package qued;

import java.util.*;

public class Qued {
     public static int zz;
    
    public static void main(String[] args) {
        userInput();
        display();
    }

    public static void userInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a NUmber:");
        zz = sc.nextInt();

    }
    
    public static void display() {

        for (int i = 0; i <= zz; i++) {
        System.out.print("f("+ i +")\t"); 
            }
        for (int i = 0; i <= zz; i++) {
            System.out.println("");
            for (int j = 0; j <= i; j++) {
                 System.out.print(""+sol(j)+"\t");
            }
        }
               
              }
    public static int sol(int a){  
        if (a == 0) {
            return 0;
           
        }else if (a == 1) {
            return 1;
        }
        else{
               return sol(a-1)+sol(a-2);          
        }
        
    }
    
}
