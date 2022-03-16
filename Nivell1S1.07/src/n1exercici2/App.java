package n1exercici2;

public class App {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
//ATRIBUTS
	int a = 1;
	int b = 2;
	
	
	Superclasse superclasse = new Superclasse(5,7);
	
	superclasse.sumar();
	
	Subclasse subclasse = new Subclasse();
	
	subclasse.restar(8,10);

	SubclasseDos subclasseDos = new SubclasseDos();
	
	subclasseDos.multiplicar(8,10);
		
	}

//METODES
}
