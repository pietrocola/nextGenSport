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

public class ElencoTipologieCorso {
	public ElencoTipologieCorso() {
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
	
	
	public void impostaTipologia(String nomeTip) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void addTipologia(TipologiaCorso tc) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String[] getNomeTipologie() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public TipologiaCorso getTipologia(String nomeTip) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
