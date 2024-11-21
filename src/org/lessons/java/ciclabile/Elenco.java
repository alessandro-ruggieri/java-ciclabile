package org.lessons.java.ciclabile;

public class Elenco {

	private int[] elenco;
	private int index;

	public Elenco() {
		this.elenco = new int[0];
		this.index = 0;
	}
	
	public Elenco(int[] elenco) {
		this.elenco = elenco;
		this.index = 0;
	}
	
	public int getElementoSuccessivo() {
		if (hasAncoraElementi()) {
			return elenco[index++];
		} else {
			System.out.println("Non ci sono più elementi nell'elenco");
			return 0;
		}
	}
	
	public boolean hasAncoraElementi() {
		return index < elenco.length;
	}
	
	public void addElemento(int elemento) {
		int [] newElenco = new int [elenco.length + 1];
		for(index = 0; index < elenco.length; index++) {
			newElenco[index] = elenco [index];
		}
		newElenco[index] = elemento;
		this.elenco = newElenco;
		index = 0;
		
	}
	
	
	
	
}
