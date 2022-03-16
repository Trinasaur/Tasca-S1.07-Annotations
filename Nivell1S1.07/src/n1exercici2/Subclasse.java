package n1exercici2;

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
	
	@Deprecated
	public void restar(int a, int b) {
		int c = a - b;
		System.out.println("El resultado es " + c);
	}


}
