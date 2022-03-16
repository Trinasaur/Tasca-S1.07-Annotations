package n1exercici2;

public class SubclasseDos extends Superclasse{

//ATRIBUTS

//CONSTRUCTOR
	public SubclasseDos() {
		
	}
	
//METODES
	
	@Override
	public void sumar(int a, int b) {
		int c = a + b;
		System.out.println("El resultado es " + c);
	}
	
	@Deprecated
	public void multiplicar(int a, int b) {
		int c = a * b;
		System.out.println("El resultado es " + c);
	}


}