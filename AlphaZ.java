import java.util.Scanner;
class AlphaZ {  
public static void main(String args[]){     
 
 Scanner sc = new Scanner(System.in);
          System.out.println("enter the  number");
         
        int row = sc.nextInt();

for(int i=1;i<=row;i++){    

for(int j=1 ;j<=row;j++){  
  
if  (i+j == row + 1  || i == 1|| i == 5 )

System.out.print(i + "" + j + " ");

else 
System.out.print("   ");       
}    
System.out.println();
}    
}}  