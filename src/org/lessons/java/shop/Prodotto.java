package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

	private int codice;
	private String nome;
	private String descrizione;
	private int prezzo;
	private int iva;
	
	//costruttore
	public Prodotto(String nome, String descrizione, int prezzo, int iva) {
		
		setCodice();
		setNome(nome);
		setDescrizione(descrizione);
		setPrezzo(prezzo);
		setIva(iva);
	}
	
	//setter e getter per il codice
	private void setCodice() {
		Random rnd = new Random();
		
		int rndCodice = rnd.nextInt(0, 10001);
		
		this.codice = rndCodice;
	}
	
	public int getCodice() {
		return codice;
	}
	
	//setter e getter per il nome
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	//setter e getter per la descrizione
	public void setDescrizione(String descrizione) {
			this.descrizione = descrizione;
		}
		
	public String getDescrizione() {
			return descrizione;
		}
	
	//setter e getter per il prezzo
	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}
	
	public int getPrezzo() {
		return prezzo;
	}
	
	//setter e getter per l'iva
	public void setIva(int iva) {
		this.iva = iva;
	}
	
	public int getIva() {
		return iva;
	}
}
