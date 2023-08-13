package testing;

public class TestABB {
	public static void main(String[] args) {
		
		
		IntABB miArbol;
		
		miArbol = new IntABB();
		
		miArbol.meter(8);
		miArbol.meter(4);
		miArbol.meter(5);
		miArbol.meter(7);
		miArbol.meter(10);
		miArbol.meter(14);
		miArbol.meter(9);
		miArbol.meter(12);
		
			
		
		
		miArbol.muestraInOrder();
		System.out.println("***");
		miArbol.muestraPreOrder();
		System.out.println("***");
		miArbol.muestraPostOrder();
		System.out.println("la cantidad de hojas es " + miArbol.cuentaHojas());
		
		System.out.println("la altura es " + miArbol.altura());
		
		System.out.println("la cantidad de nodos es " + miArbol.cuentaNodos());
		
	}

}
