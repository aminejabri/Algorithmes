package tri;

public class Selection {

	public void trier(int[] tableau){

	    for (int i = 0; i < tableau.length - 1; i++)
	    {
	        int index = i;
	        for (int j = i + 1; j < tableau.length; j++)
	            if (tableau[j] < tableau[index]) 
	                index = j;
	 
	        int pp = tableau[index];  
	        tableau[index] = tableau[i];
	        tableau[i] = pp;
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
		Selection b =new Selection();
		b.trier(tableau);
		b.affichage(tableau);
	}
	
	
}
