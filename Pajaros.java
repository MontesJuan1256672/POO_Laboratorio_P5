public class Pajaros{//clase padre
	private String nombre;
	private String color;
	private String forma;
	
	public Pajaros(String nombre, String color, String forma){
		this.nombre = nombre;
		this.color = color;
		this.forma = forma;
	}
	
	public void habilidadEspecial(){
		System.out.println("utilizar habilidad especial.");
	}
	
	//setters
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	public void setForma(String forma){
		this.forma = forma;
	}
	
	//getters
	public String getNombre(){
		return nombre;
	}
	
	public String getColor(){
		return color;
	}
	
	public String getForma(){
		return forma;
	}
}