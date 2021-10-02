public class AngryBirds {
	public static void main(String[] args){
		int opc = 0;
		
		Pajaro1 bird1 = new Pajaro1("Red", "Rojo", "Redondo", "Piedra");
		Pajaro1 bird2 = new Pajaro1("Jake", "Azul", "tres circulos", "Hielo y cristal");
		
		Pajaro2 bird3 = new Pajaro2("Chuck", "Amarillo", "Triangulo", "Curioso");
		Pajaro2 bird4 = new Pajaro2("Matilda", "Blnco", "Huevo", "Pacifista");
		
		Pajaro1[] birds1 = {bird1, bird2};
		Pajaro2[] birds2 = {bird3, bird4};
		
		do{
			System.out.println("Elije un personaje.");
			System.out.println("1) Red.");
			System.out.println("2) Jake, Jay, Jim.");
			System.out.println("3) Chuck.");
			System.out.println("4) Matilda.");
			System.out.println("5) Salir.");
			opc = CapturaEntrada.capturarEntero(">>>");
			System.out.println("\n");
			
			switch(opc){
				case 1:	System.out.println("Nombre: " + birds1[(opc-1)].getNombre());
						System.out.println("Color: " + birds1[opc-1].getColor());
						System.out.println("Forma: " + birds1[opc-1].getForma());
						System.out.println("Debilidad: " + birds1[opc-1].getDebilidad());
						birds1[opc-1].protagonista();
						System.out.println("\n");
						break;
				case 2:	System.out.println("Nombre: " + birds1[(opc-1)].getNombre());
						System.out.println("Color: " + birds1[opc-1].getColor());
						System.out.println("Forma: " + birds1[opc-1].getForma());
						System.out.println("Debilidad: " + birds1[opc-1].getDebilidad());
						System.out.println("\n");
						break;
				case 3:	System.out.println("Nombre: " + birds2[(opc-3)].getNombre());
						System.out.println("Color: " + birds2[opc-3].getColor());
						System.out.println("Forma: " + birds2[opc-3].getForma());
						System.out.println("Personalidad: " + birds2[opc-3].getPersonalidad());
						System.out.println("\n");
						break;
				case 4:	System.out.println("Nombre: " + birds2[(opc-3)].getNombre());
						System.out.println("Color: " + birds2[opc-3].getColor());
						System.out.println("Forma: " + birds2[opc-3].getForma());
						System.out.println("Personalidad: " + birds2[opc-3].getPersonalidad());
						System.out.println("\n");
						break;
			}
		}while(opc != 5);
	}
}
