package hW10;

public class hw104 {

	public static void main(String[] args) {
		
		 int n1=0;
  		  int n2=1;
      	  int n3=0;                 
            
         for(int i=2;i<10;i++) {                
          n3=n1+n2;    
          System.out.print(" "+n3);    
          n1=n2;    
          n2=n3;    
         } 
         System.out.println("-----------------"); 

 		int[] num= {0,4,6,8,9,23,56,78};
 		int max = 0;
 		int min =0;
   for(int i=0;i < num.length;i++){
     if(num[i] > max){
       max = num[i];
     }
     }for(int s=0;s<num.length;s++){
         if(num[s] < min){
           min = num[s];
         }
     } System.out.println(max+" "+min);
       
     }
     }
     
       
          
       
        
     

	


