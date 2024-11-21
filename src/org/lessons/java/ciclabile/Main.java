package org.lessons.java.ciclabile;

public class Main {

	public static void main(String[] args) {
		int[] interi = {10,20,30,40,50,100};
		
		Elenco elencoInteri = new Elenco(interi);
		System.out.println("Array in input ricevuto, inizio la lettura");
		
		while (elencoInteri.hasAncoraElementi()) {
			System.out.println("Il prossimo elemento è: " + elencoInteri.getElementoSuccessivo());
		}
		
		elencoInteri.addElemento(110);
		System.out.println("\nAggiungo un elemento all'array e ripeto la lettura");
		
		while (elencoInteri.hasAncoraElementi()) {
			System.out.println("Il prossimo elemento è: " + elencoInteri.getElementoSuccessivo());
		}
		
		elencoInteri.addElemento(120);
		System.out.println("\nAggiungo un elemento all'array e ripeto la lettura");
		
		while (elencoInteri.hasAncoraElementi()) {
			System.out.println("Il prossimo elemento è: " + elencoInteri.getElementoSuccessivo());
		}
		
		Elenco nuovoElenco = new Elenco();
		System.out.println("\nInizializzo un nuovo array e mi preparo a ricevere il nuovo contenuto");
		nuovoElenco.addElemento(15);
		nuovoElenco.addElemento(25);
		nuovoElenco.addElemento(35);
		
		System.out.println("\nValori ricevuti, inizio la lettura");
		
		while (nuovoElenco.hasAncoraElementi()) {
			System.out.println("Il prossimo elemento è: " + nuovoElenco.getElementoSuccessivo());
		}
	}

}
