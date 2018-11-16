package array;

public class Array {

    public static void main(String[] args) {

        int[] myList = {3, 9, 15, 20, 65, 23, 18, 4, 2, 14};
        int even []= new int[myList.length];    
        int odd [] = new int[myList.length];    
        int count =0;
        int bcount = 0;  
        
        for (int i = 0; i < myList.length; i++) {                     
         
            if (myList[i] % 2 == 0) {
                even[count] = myList[i];
                count++;
            }
            if  (myList[i]% 2==1){
                odd[bcount] = myList[i];
                bcount++;  
            }            
            else {
            }
        }
       System.out.println("Even\t Odd");
       for(int i = 0; i<myList.length; i++){
           if(even[i]!=0&&odd[i]!=0){
               System.out.println(even[i]+"\t"+odd[i]);
           }else if(even[i]==0&&odd[i]!=0){
               System.out.println(" \t"+odd[i]);
           }else if(even[i]!=0&&odd[i]==0){
               System.out.println(even[i]+"\t");
           }else{
           }
       
       }
        
    }

}
