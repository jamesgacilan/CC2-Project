package javaapplication1;

import java.util.*;

public class JavaApplication1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Course:\n"
                + " IT\n"
                + " CS\n"
                + " BSDA");  
        
        String course = sc.next();

        if (course.equalsIgnoreCase("IT")) {
            System.out.println("Enter Your Major:\n"
                    + " NeTSec\n"
                    + " WebTech\n"
                    + " ERP");           
            String it = sc.next();
            if (it.equals("NetSec")) {
                System.out.println("You are Major in Network in Security");

            } else if (it.equals("WebTech")) {
                System.out.println("You are Major in WebTech");

            } else if (it.equals("ERP")) {
                System.out.println("You are Major in Entereprises Resource Planning");
            }
        } else if (course.equals("CS")) {
            System.out.println("Enter Your Major:");
            String it = sc.next();
            if(it.equals("WebDev")){
                System.out.println("You are Major in Web Development");              
            }
            else if(it.equals("Digital arts")){
                System.out.println("You are Major in Digital Arts and Animation");
            }
        }
        else if(course.equals("BSDA")){ 
            System.out.println("You are Major in Bachelor of Science in Data Analytics");
        }
        else{
            System.out.println("Invalid Input");
        }
        
    }

}
