package calculadora;

class Principal
{
	public static void main(String[] args){
		Menu.imprimir();
		String opcion=Teclado.leer("Introduce una opcion");
		Menu.selecciona(opcion);
	}
}
