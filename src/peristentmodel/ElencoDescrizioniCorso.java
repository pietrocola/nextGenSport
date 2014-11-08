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
package peristentmodel;

public class ElencoDescrizioniCorso extends peristentmodel.APersistentModel {
	public ElencoDescrizioniCorso() {
	}
	
	private int ID;
	
	private java.util.Set elencodescrizioni = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setElencodescrizioni(java.util.Set value) {
		this.elencodescrizioni = value;
	}
	
	public java.util.Set getElencodescrizioni() {
		return elencodescrizioni;
	}
	
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
