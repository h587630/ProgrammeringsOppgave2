package Obligatorisk;

public class Kap5Oppgave6 {

	public static void main(String[] args) {
		
		int[] tabell1= {3,7,9,34,12,0,5};
		int[] tabell2= {6,45,73,4,8,1,23};
		int[] storTabell=settSammen(tabell1, tabell2);
		int[] tab={42, 67,89};
		skrivUt(tabell1);
		System.out.println();
		skrivUt(tabell2);
		System.out.println();
		skrivUt(storTabell);
		System.out.println();
		summer(tabell2);
		System.out.println();
		finnesTall(tabell1, 23);
		System.out.println(finnesTall(tabell1, 10));
		System.out.println(finnesTall(tabell1, 3));
		erSortert(tabell1);
		System.out.println(erSortert(tabell1));
		reverser(tabell1);
		skrivUt(reverser(tabell1));
		System.out.println(reverser(tabell1));
		System.out.println(tilStreng(tabell1));
		System.out.println(tilStreng(tab));
	
}
	
	
	//Implementer en metode:som kan skrive ut en tabell med heltal.
	public static void skrivUt (int[] tab) {
		System.out.print("[");
		for(int i= 0; i<tab.length; i++) {
			System.out.print(tab[i]+ " ");
		}
			System.out.print("]");
		}
	
	
	//Implementer en metode:som kan returnere en string med innholdet av en tabell.
	//For en tabell med elementene 42,67,89 skal følgende streng returneres:
		//"[42,67,89]"
	public static String tilStreng (int[] tabell) {
		System.out.print("\"");
		System.out.print("[ ");
		for (int i = 0;i<tabell.length;i++) {
			System.out.print(tabell[i] + " ");
		}
		System.out.print("]");
		System.out.print("\"");
		return "";

	}
	
   //Implementer en metode som gitt en tabell av heltall som parameter beregner
   //summen av tallene som er lagret i tabellen.Implementer tre varianter av metoden:
	//en som bruker en vanlig for-løkke, en som bruker en while-løkke, og en som 
	//bruker en utvidet for-løkke. 
	public static int summer(int[] tab) {
		
		  
		 System.out.println(" for version");
		  int sum=0;
		  for(int i: tab)
		  sum+= i;
		  System.out.println("Sum av tallene i tabellen er : "+ sum);
		  return sum;
		  
	}
		 
	public static int summer1(int[] tab) { 
	//while version
		int j=0;
		int sum1=0;
		while ( j <= tab.length) {
		sum1 += tab[j];
		j++;
		}
		System.out.println("Sum av tallene er: "+ sum1);
	
			return sum1;	
}
	
	public static int summer2(int[] tab1) { 
		int i=0;
		int sum2=0;
		for ( i = 0; i <= tab1.length; i++ ) {
		sum2 += tab1[i];
		i++;
		}
		System.out.println("Sum av tallene er: "+ sum2);
		return sum2;
		
	}

		//Implementer en metode som gitt en tabell og et tall returnerer true om 
		//tabellen tabell innholder tallet tall og false ellers.
		  public static boolean finnesTall(int[] tabell, int tall) {
		  
		  boolean funnet = false; 
		  int i = 0; 
		  while (!funnet && i<tabell .length) {
			 if( tabell[i]== tall)
				 funnet=true;
			 else 
				 i++;
		  }
		  return funnet; 
		  }
		 
	
		//Implementer en metode som returnerer det første index (posisjon) i tabell som 
		//inneholder tallet tall og -1 ellers.
		public static int posisjonTall (int[] tabell, int tall) {
		
		if ( tabell[0] == tall) {
			System.out.println(tall);
			}else if(tabell[0]> tall  || tabell[0 ]< tall) {
				System.out.println("-1");
			}
		return tall;
		}
	
	
	   //Implementer en metode som gitt en tabell av heltall returnerer en ny tabell som har de samme 
		//elementene som tabell men i modsatt rekkefølge.
		private static int[] reverser(int[] tabell1) {
			 int sistePos = tabell1.length - 1;
			  
			   for (int i=0; i <= sistePos/2; i++) {
			    int p = tabell1[i];
			    tabell1[i] = tabell1[sistePos-i];
			    tabell1[sistePos-i] = p;
			    }
				return tabell1;
			  }
	
		
		//Implementer en metode som kan avgjere om ein array (tabell) av heiltal er sortert stigande 
		//(dvs. at alle tal skal vere større enn det forrige)
		public static boolean erSortert(int[] tabell) {
		boolean sortert= true;
		int i=0;
		while(sortert && i<tabell.length) {
			if (tabell[i-1]<=tabell[1])
				i++;
			else
				sortert= false;
	
}
		return sortert;
}
		
		
		//Implementer en metodesom gitt to tabeller tabell1 og tabell2 som paramtere 
		//returnerer en ny tabell som er sammensetning av de to tabeller.
		public static int[] settSammen(int[] tabell1,int[] tabell2) {
			int nyLengde=tabell1.length+tabell2.length;
			int[]nyTab= new int[nyLengde];
			for(int i=0; i<tabell1.length; i++) {
				nyTab[i]=tabell1[i];
			}
			for(int j=0; j< tabell2.length; j++) {
				nyTab[tabell1.length+j]= tabell2[j];
			}
				return nyTab;
			}
}
		
		