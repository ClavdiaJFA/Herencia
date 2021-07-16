
public class perro extends animal {
	
	String raza = "";
	String color = "";
	float peso = 0;
	
	public perro(String nombre, int edad) {
		super(nombre,edad);
	}
	
	public String ladrar() {
		return "¡Guaf!";
	}
	
	@Override
	public String comer() {
		return "comiendo croquetas";
	}

}
