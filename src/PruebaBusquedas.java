class Insercion {
	
	public static int[] ordenacionInsercion(int nums[]) {
		int numeros[]=nums.clone();
		int aux;
		
		for (int i = 1; i < numeros.length; i++) {
			aux=numeros[i];
			for (int j=i-1; j>=0 && numeros[j]>aux ; j--) {
				numeros[j+1]=numeros[j];
				numeros[j]=aux;
			}
			
		}
		
		return numeros;
		
	}
	
}
public class PruebaBusquedas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
