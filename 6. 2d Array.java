package mulitiarray;

import java.util.*;

public class Mulitiarray {

    public static void main(String[] args) {

        /* String [][] names ={{"Teofilo","Ana"},{"Adrian","Aldain"},{"Fred","John"},{"Emil","David"}};
            for(int i = 0; i<names.length; i++){
                System.out.println("Row"+i);
                for(int j= 0; j<names.length; j++){
                    System.out.println(names[i][j]);
                }
            
            }
    Scanner sc=new Scanner (System.in);
    
    
        System.out.println("Input a Number");
        
        int x =sc.nextInt();
        int[] at = new int[x];
        
        for (int i = 0; i <at.length; i++) {
            System.out.println("index"+i+"\t");
            at[i] = sc.nextInt();
            System.out.println("");
            
        }
         */
        Scanner sc = new Scanner(System.in);

        int rows;

        int columns;

        System.out.println("Enter number of Row: ");

        rows = sc.nextInt();

        System.out.println("Now enter the number of columns: ");

        columns = sc.nextInt();

        int[][] ar = new int[rows][columns];

        for (int i = 0; i < rows; i++) {      
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter the number for row " + i + " and column " + j + " : ");
                ar[i][j] = sc.nextInt();
            }

            }
                
              for(int i = 0; i<ar.length; i++){
                System.out.println("\nRow:"+i+"\tColumn:"+i);
                for(int j= 0; j<ar.length; j++){
                    System.out.print(ar[i][j]+"\t");
                    
                }
        }
    }
}
    
    
