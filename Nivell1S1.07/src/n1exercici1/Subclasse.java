package n1exercici1;

public class Subclasse extends Superclasse{

//ATRIBUTS

//CONSTRUCTOR
	public Subclasse() {
		
	}
	
//METODES
	
	@Override
	public void sumar(int a, int b) {
		int c = a + b;
		System.out.println("El resultado es " + c);
	}


}
