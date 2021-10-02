public class Pajaro1 extends Pajaros{//clase hijo
	private String debilidad;

	public Pajaro1(String nombre, String color, String forma, String debilidad){
		super(nombre, color, forma);//red; rojo; redondo;
		this.debilidad = debilidad;
	}
	
	public void protagonista(){
		System.out.println("Soy el protagonista");
	}
	
	//setters
	public void setDebilidad(String debilidad){
		this.debilidad = debilidad;
	}
	
	//getters
	public String getDebilidad(){
		return debilidad;
	}
	
}