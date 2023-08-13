package testing;

import contenedores.ABB;

public class CharABB extends ABB{

	@Override
	public boolean iguales(Object nodoA, Object nodoB) {
		return Character.compare((Character)nodoA, (Character)nodoB) == 0;
	}

	@Override
	public boolean menor(Object nodoA, Object nodoB) {
		return Character.compare((Character)nodoA, (Character)nodoB) < 0;
	}

	@Override
	public boolean mayor(Object nodoA, Object nodoB) {
		return Character.compare((Character)nodoA, (Character)nodoB) > 0;
	}

	@Override
	public void imprimir(Object nodoInfo) {
		System.out.println("Nodo " + nodoInfo.toString());	
	}

}
