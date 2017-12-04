package tri;

public class QuickSort {
	
	private  int tableau[];
	private  int length;

	public  void trier(int[] tableau) {
		if (tableau == null || tableau.length == 0) {
			return;
		}
		this.tableau = tableau;
		length = tableau.length;
		quickSort(0, length - 1);
	}
	private  void quickSort(int debut, int fin) {
		int i = debut;
		int j = fin;

		int pivot = tableau[debut+(fin-debut)/2];
		
		while (i <= j) {

			while (tableau[i] < pivot) {
				i++;
			}
			while (tableau[j] > pivot) {
				j--;
			}
			if (i <= j) {
				exchange(i, j);
				i++;
				j--;
			}
		}
		if (debut < j)
			quickSort(debut, j);
		if (i < fin)
			quickSort(i, fin);

	}
	private  void exchange(int i, int j) {
		int temp = tableau[i];
		tableau[i] = tableau[j];
		tableau[j] = temp;
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
