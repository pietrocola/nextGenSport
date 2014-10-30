/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Universita degli Studi dell'Aquila
 * License Type: Academic
 */
package model;

public class ElencoDescrizioniCorso {
	public ElencoDescrizioniCorso() {
	}
	
	private int ID;
	
	private java.util.Set elencocorsi = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setElencocorsi(java.util.Set value) {
		this.elencocorsi = value;
	}
	
	public java.util.Set getElencocorsi() {
		return elencocorsi;
	}
	
	
	public void configuraCorso(String nomeCorso, model.TipologiaCorso tip, boolean prenot) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void addDescrizione(model.DescrizioneCorso dc) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
