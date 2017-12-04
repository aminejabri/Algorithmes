package tri;

public class Fusion {
	
	private int[] tableau;
	private int[] tempTab;
	private int length;


	
	public void trier(int tableau[]) {
	
		this.tableau = tableau;
		this.length = tableau.length;
		this.tempTab = new int[length];
		triFusion(0, length - 1);
	}

	private void triFusion(int debut, int fin) {
		
		if (debut < fin) {
			int milieu =debut + (fin - debut) / 2;

			triFusion(debut, milieu);

			triFusion(milieu + 1, fin);

			fusionParti(debut, milieu, fin);
		}
	}

	private void fusionParti(int debut,int milieu, int fin) {
	
			for (int i=debut;i<=fin;i++){tempTab[i]=tableau[i];}
		
			int i=debut,k = debut;
			int j=milieu+1;
			while(i<=milieu&&j<=fin){
				if (tempTab[i]<=tempTab[j]){
					tableau[k]=tempTab[i];
					i++;
				}
				else{
					tableau[k]=tempTab[j];
					j++;
				}
				k++;
			}
			while(i<=milieu)
	
			{
				tableau[k]=tempTab[i];
				k++;
				i++;
			}
		
	}


	public void affichage(int[] tableau) 
	{
		for (int i = 0; i < tableau.length; i++) {
			System.out.print(tableau[i] + ", ");
		}
		System.out.println("\n");
	}
	
	public  void main(String[] args) 
	{
		
		int[] tableau = { 4, 9 , 2 , 545 , 6,66,4,3,5,2,6,29 };		
		Fusion b =new Fusion();
		b.trier(tableau);
		b.affichage(tableau);
	}
}