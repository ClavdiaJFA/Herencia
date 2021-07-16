
public class gato extends animal {
	
	int num_bigotes;
	String color;
	int vidas_disponibles = 9;
	
	public gato(String nombre, int edad, String color) {
		super(nombre,edad);
		this.color = color;
		
	}
	
	@Override
	public String comer() {
		return "Comiendo atún";
		
	}


}
