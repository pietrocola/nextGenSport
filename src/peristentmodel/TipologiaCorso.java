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

public class TipologiaCorso extends peristentmodel.APersistentModel {
	public TipologiaCorso() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof TipologiaCorso))
			return false;
		TipologiaCorso tipologiacorso = (TipologiaCorso)aObj;
		if ((getNometip() != null && !getNometip().equals(tipologiacorso.getNometip())) || (getNometip() == null && tipologiacorso.getNometip() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getNometip() == null ? 0 : getNometip().hashCode());
		return hashcode;
	}
	
	private String nometip;
	
	public void setNometip(String value) {
		this.nometip = value;
	}
	
	public String getNometip() {
		return nometip;
	}
	
	public String getORMID() {
		return getNometip();
	}
	
	public String toString() {
		return String.valueOf(getNometip());
	}
	
	private boolean _saved = false;
	
	public void onSave() {
		_saved=true;
	}
	
	
	public void onLoad() {
		_saved=true;
	}
	
	
	public boolean isSaved() {
		return _saved;
	}
	
	
}
