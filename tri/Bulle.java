package tri;


public class Bulle {
	
	
	public void trier(int tableau[]) 
	{
		int n = tableau.length;
		int k;
		for (int m = n; m >= 0; m--) {
			for (int i = 0; i < n - 1; i++) {
				k = i + 1;
				if (tableau[i] > tableau[k]) {
					echanger(i, k, tableau);
				}
			}
			}
		affichage(tableau);
	}
	private  void echanger(int i, int j, int[] tableau) 
	{
		int temp;
		temp = tableau[i];
		tableau[i] = tableau[j];
		tableau[j]=temp;
	}
	private  void affichage(int[] tableau) 
	{
		for (int i = 0; i < tableau.length; i++) {
			System.out.print(tableau[i] + ", ");
		}
		System.out.println("\n");
	}

	public void main(String[] args) {
		
		int[] tableau = { 4, 9 , 2 , 545 , 6 , 23 , 312 , 12 , 34 , 0 , 1 , 5 , 34 , 2 };		
		Bulle b =new Bulle();
		b.trier(tableau);
	}
}