public class Pajaro2 extends Pajaros{//clase hijo
	private String personalidad;

	public Pajaro2(String nombre, String color, String forma, String personalidad){
		super(nombre, color, forma);//jay, jake, jim; azul; tres circulos;
		this.personalidad = personalidad;//curiosos
	}
	
	public void setPersonalidad (String personalidad){
		this.personalidad = personalidad;
	}
	
	public String getPersonalidad(){
		return personalidad;
	}
}