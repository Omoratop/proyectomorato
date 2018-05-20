//Version suma 1

public class Suma {

	private int sumandoA;
	private int sumandoB;
	private int total;
	
	public Suma(int a, int b){
		
		sumandoA = a;
		sumandoB = b;
		
		System.out.println("Total: " + suma(a,b));

	}
	
	public int suma(int a, int b){
		return a + b;
		
	}

}
