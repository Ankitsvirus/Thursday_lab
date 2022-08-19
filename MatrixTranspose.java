package labtest2;

public class MatrixTranspose {

	  
		public static void main(String args[]){  
	 
		int original[][]={{1,5,6},{2,7,9},{3,6,8}};    
		int transpose[][]=new int[3][3];  
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		transpose[i][j]=original[j][i];  
		}    
		}    
		  
		System.out.println("Matrix without transpose:");  
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		System.out.print(original[i][j]+" ");    
		}    
		System.out.println();//new line    
		}    
		System.out.println("Matrix After Transpose:");  
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		System.out.print(transpose[i][j]+" ");    
		}    
		System.out.println();//new line    
		}    
		}
		}  
