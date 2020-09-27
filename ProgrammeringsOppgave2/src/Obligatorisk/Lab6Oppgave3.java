package Obligatorisk;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
public class Lab6Oppgave3 {

	public static void main(String[] args) {
		//Les beskrivelsen av matriser i oppgave 5.17 i java-boken.
		int[][] matrise = {{0,0,1,1,1,1,0,0},
	  					  {0,1,0,0,0,0,1,0},
			  		      {0,1,0,0,0,0,1,0},
			  			  {0,0,1,1,1,1,0,0},
			  			  {0,1,0,0,0,0,1,0},
			  			  {0,1,0,0,0,0,1,0},
			  			  {0,1,0,0,0,0,1,0},
			  			  {0,0,1,1,1,1,0,0}};
		
		int[][] toTab ={ {1,2,3},
				        {4,5,6},
				        {7,8,9} };
		int[][] toTab1 ={ {1,2,8},
		                 {4,5,6},
		                 {2,3,3}};
		     
			skrivUtv1(matrise);	
			skrivUtv1(toTab);
			skrivUtv12(matrise);
			skrivUtv12(toTab);
			System.out.println(tilStreng(toTab));
		System.out.println();
		System.out.println(erLik(toTab, toTab1 ));
		System.out.println();
		System.out.println(skaler(3, toTab1));
		//System.out.println(multipliser(toTab1, toTab));
	}
	
	//a. Implementer en metode:som kan skrive ut en matrise. Prøv å bruk to to (nøstede) 
	//utvidede for-løkker (se avsnitt 5.6i boken for beskrivelse av utvidet for-løkke).
	
	public static void skrivUtv1(int[][] matrise) {
		
		for (int row[] : matrise) {
			for (int col : row) {
			System.out.print(col + " ");
		}
		System.out.println();
		}
	}

	public static void skrivUtv12(int[][] matrise) {
	
		for (int row = 0; row< matrise.length; row++) {
			
			for (int col = 0; col< matrise[row].length; col++) {
			
				System.out.print(matrise[row][col] + " ");
			
		    
			}   
			System.out.println();
		}
	}

	//b. Implementer en metode som returnerer en streng-representation 
    //av en matrise. Om matrisen er følgende:{ {1,2,3}, {4,5,6}, {7,8,9} }
	//da skal strengen som returneres ha følgende innhold:1 2 3 \n4 5 6 \n7 8 9 \n
	public static String tilStreng(int[][] matrise) {
		
		String elementer = "";
		
		for (int row = 0; row< matrise.length; row++) {
			
			for (int col = 0; col< matrise[row].length; col++) {
				
				elementer += matrise[row][col] + " ";
			}
			elementer += "\n";
		}
		return elementer;
	}

		
	//c. Implementer en metode som returnerer en ny matrise der alle tall i matrisen er
	//multiplisert med parameteren tall. Metoden må først opprette en matrise like stor som 
	//parameteren og så multiplisere alle elementer med tall.
	public static int skaler(int tall, int[][] matrise){
		int k= tall;

	for (int i=0 ;i<matrise.length; i++) {
		for(int j=0; j<matrise[i].length; j++) {
		int resultat= k* matrise[i][j];
		
		System.out.print(resultat + "  ");
		}	
		System.out.println();
		
	}
	return k;
	}
	
	
	
	
	//d.Implementer en metode som avgjør om to matriser gitt ved parametrene 
     //a og b er like.
	public static boolean erLik(int[][] mat1, int[][] mat2) {
		
		if ( mat1.length != mat2.length) {
			return false;
		}
		
		for( int i=0; i< mat1.length; i++) {
			if(mat1[i].length!= mat2[i].length) {
				return false;
			}
			for(int j=0; j<mat1[i].length; j++) {
				
				if(mat1[i][j] != mat2[i][j]) {
					return false;
				}		
			}
		}
		return true;
	}

	//f) (Valgfri/vanskelig)
	//Implementer en metode som kan multiplisere to matriser. Test metoden. 
//	public static int[][] multipliser(int[][] a, int[][] b){
//		
//		for(int i=0; i<a.length; i++) {
//			for(int j=0; j<b.length; i++) {
//				for(int k=0; k<a.length; k++) {
//			
//					
//					int resultat[][]=new int[i][j];
//			resultat [i][j]= resultat[i][j]+ (a[i][k]*b[j][k]);
//			
//			System.out.println(resultat + "  ");
//				}
//				System.out.println();
//			}
//		}
//		return b;
//	}
}
	 