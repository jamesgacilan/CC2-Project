package guessing;

import java.io.*;

public class Guessing {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a Correct Answer");
        int correct = Integer.parseInt(br.readLine());

        System.out.println(".\n"
                + ".\n"
                + ".\n"
                + ".\n"
                + ".\n"
                + ".\n"
                + ".\n"
                + ".\n"
                + ".\n"
                + ".\n"
                + ".\n"
                + ".\n"
                + ".\n"
                + ".\n"
                + ".\n");
        
        int num;

        do {
            System.out.println("Enter your guess number:");
            num = Integer.parseInt(br.readLine());
            if (num < correct) {
                if(num % 2==0){
                    System.out.println("Even Higher");}
                else{
                    System.out.println("Odd Higher");}
                

            } else if (num > correct) {
                 if(num % 2==0){
                    System.out.println("Even Lower");}
                else{
                    System.out.println("Odd Lower");}

            } else if (num == correct) {
                System.out.println("Nice Guess");

            } else {
                System.out.println("Invalid Input");

            }
        } while (num != correct);

    }

}
