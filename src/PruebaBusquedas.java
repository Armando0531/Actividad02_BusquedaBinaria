import java.util.Arrays;
import java.util.Scanner;

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

class Menu{
	static Scanner input = new Scanner(System.in);
	
	public static void impresionNumeros(int[] nums) {
		System.out.println();
		
		int max = nums[0];
	    for (int a : nums) {
	        if (a > max)
	            max = a;
	    }
	    int maxS= Integer.toString(max).length();
		
		if (nums.length<=900) {
			for (int i = 0; i < nums.length; i++) {
				
				if(i!=0 && i%((int)Math.sqrt(nums.length))==0) {
					System.out.println();
				}else if(i==0) {
					System.out.print("[");
				}
				System.out.print(nums[i]);
				for (int k = 0; k < (maxS-Integer.toString(nums[i]).length()); k++) {
					System.out.print(' ');
				}
				if(i==0) {
					System.out.print(' ');
				}else {
					System.out.print("  ");
				}
				
			}
		}else {
			System.out.println("El arreglo es demasiado largo y el menu se puede bugear, solo se van a imprimir 900 muestras");
			int salto = (int)(nums.length/900);
			int j = -1;
			for (int i = (int)(salto/2); i < nums.length; i+=salto) {
				j+=1;
				if(i!=0 && j%30==0) {
					System.out.println();
				}else if(i==salto) {
					System.out.print("[");
				}
				System.out.print(nums[i]);
				for (int k = 0; k < (maxS-Integer.toString(nums[i]).length()); k++) {
					System.out.print(' ');
				}
				if(i==0) {
					System.out.print(' ');
				}else {
					System.out.print("  ");
				}
				
			}
		}
		System.out.println("]");
	}
	
	public static int validacionNatural() {
		int ret = 0;
		boolean err = false;
		do {
			try {
				ret = input.nextInt();
			} catch (java.util.InputMismatchException e) {
				System.out.println("entrada no valida, intente de nuevo:");
				input.nextLine();
				err=true;
			}
			if (ret>0) {
				err=false;
			}else {
				System.out.println("solo n�meros naturales");
				err=true;
			}
		}while(err);
		return ret;
	}
	
	public static void mostrarMenu(String[] opciones) {
		System.out.println();
		for (int i = 0; i < opciones.length; i++) {
			System.out.println((i+1)+")"+opciones[i]);
		}
		System.out.println((opciones.length+1)+")Salir\n");
	}
}

class BusquedaBinaria {

	public boolean busquedaBin(int[] numeros, int valorBuscado) {
		int[] contador= new int[2];

		int inicio=0;
		int fin=numeros.length-1;
		int x=0;
		contador[0]++;
		while (inicio<=fin) {
			int puntero=(int)((inicio+fin)/2);
			contador[1]++;
			if (valorBuscado == numeros[puntero]) {
				x=1;
				break;
			}else if(valorBuscado>numeros[puntero]) {
				inicio=puntero+1;
			}else {
				fin=puntero-1;
			}
				
		}
		System.out.println("Numero de recorridos "+contador[0]);
		System.out.println("Numero de comparaciones "+contador[1]);
		return x==1;

	}

}

class Hash{
	
	String[] arreglo;
	int tama�o;
	int contador;
	int [] contador1=new int[2];
	public void reiniciarContador() {
		contador1[0]=0;
		contador1[1]=0;
	}
	public void mostrarContador() {
		System.out.println("Numero de recorridos "+contador1[0]);
		System.out.println("Numero de comparaciones "+contador1[1]);
		contador1[0]=0;
		contador1[1]=0;
	}
	// Constructor
	public Hash(int tam) {
		tama�o = tam;
		arreglo = new String[tam];
		Arrays.fill(arreglo, "-1");
	}
	
}
public class PruebaBusquedas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
