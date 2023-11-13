package org.lessons.java.shop;

public class Main {

	public static void main(String[] args) {
		Prodotto palla = new Prodotto("Pallina", "tonda", 15, 22);
		
		System.out.println("palla");
		System.out.println("codice: " + palla.getCodice());
		System.out.println("nome: " + palla.getNome());
		System.out.println("descrizione: " + palla.getDescrizione());
		System.out.println("prezzo base: € " + palla.getPrezzoBase());
		System.out.println("iva: " + palla.getIva());
		System.out.println("prezzo con iva: € " + palla.getPrezzoFinale());
		System.out.println("nome esteso: " + palla.getNomeEsteso());
	}

}
