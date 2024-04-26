package calculadora;

class Menu
{
	public static String[] = opciones {
		"1- Sumar",
		"2- Restar",
		"3- Multiplicar",
		"4- Dividir",
		"5- Ecuacion segundo grado"
	};
	public static void imprimir()
	{
		for (String opcion :opciones){
			Pantalla.escribir(opcion); 
		}
	}

	public static void selecciona(String opcion){
		Pantalla.escribir(opciones[Integer.valueOf(opcion) - 1]);
	}
	
}
