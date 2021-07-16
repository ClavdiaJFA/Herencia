
public class Principal {

	public static void main(String[]args) {
		
		//animal Animal = new animal();
		//System.out.println(Animal.comer());
		
		perro canelo = new perro("canelo", 3);
		System.out.println(canelo.ladrar());
		System.out.println(canelo.comer());
		System.out.println(canelo.nombre);
		System.out.println(canelo.edad);
		
		
		gato pulgas = new gato("bigotes", 2, "negro");
		System.out.println(pulgas.comer());
	}
}
