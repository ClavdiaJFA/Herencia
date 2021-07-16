
public abstract class animal {
	
	String nombre = "";
	int edad = 0;
	
	public animal(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public abstract String comer();
	
	public String dormir() {
		return "zzzzzzzz";
	}

}
