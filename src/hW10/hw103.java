package hW10;

public class hw103 {

	public static void main(String[] args) {
		
		int evenSum=0;
		int oddSum=0;
		int[][] num= {
				{23,56,7,44,22},
				{99,89,88,70,11}
		};
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[0].length;j++) {
				 if(num[i][j]%2 ==0) {
				 
					 evenSum+=num[i][j];
					System.out.print(evenSum+" ");
				 
				 }else {
					 oddSum+=num[i][j];
				 } 
				
				
				System.out.print(oddSum+" ");
				 
				

	}

}
	}
}
