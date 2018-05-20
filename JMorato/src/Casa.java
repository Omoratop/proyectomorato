//Version 1
public class Casa {
	
	private int Npisos;
	private int Nplantas;
	
	public Casa(){
		Npisos = 5;
		Nplantas = 15;
	}

	public void mostrarPisos(){
		System.out.println("Total pisos: " + Npisos * Nplantas);
	}
}
