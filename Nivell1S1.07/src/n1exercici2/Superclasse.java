package n1exercici2;

public class Superclasse{
	
//ATRIBUTS
	public int a;
	public int b;

//CONSTRUCTOR
	public Superclasse() {
		a = 1;
		b = 2;
	}
	
	public Superclasse(int a, int b) {
		this.a = a;
		this.b = b;
	}
		
//METODES
		
	public void sumar(int a, int b) {
		int c = a + b;
		System.out.println("The reult is " + c);
			
	}
	
	public void sumar() {
		int c = a + b;
		System.out.println("The reult is " + c);
			
	}
}
