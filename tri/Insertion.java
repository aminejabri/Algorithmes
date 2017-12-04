package tri;

public class Insertion {



	
	public void trier(int[] tableau){
		
	    int temp;
	    
	    for (int i = 1; i < tableau.length; i++) {
		    for(int j = i ; j > 0 ; j--){
			    if(tableau[j] < tableau[j-1]){
				    temp = tableau[j];
				    tableau[j] = tableau[j-1];
				    tableau[j-1] = temp;
			    }
		    }
	    }
	}
	
	public void affichage(int[] tableau) 
	{
		for (int i = 0; i < tableau.length; i++) {
			System.out.print(tableau[i] + ", ");
		}
		System.out.println("\n");
	}
	
	public static void main(String[] args) 
	{
		
		int[] tableau = { 4, 9 , 2 , 60 , 1 , 32 , 281 , 14 , 42 , 0  , 5  , 2 };		
		Insertion b =new Insertion();
		b.trier(tableau);
		b.affichage(tableau);
	}
}