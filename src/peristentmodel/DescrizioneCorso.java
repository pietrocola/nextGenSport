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

public class DescrizioneCorso extends peristentmodel.APersistentModel {
	public DescrizioneCorso() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof DescrizioneCorso))
			return false;
		DescrizioneCorso descrizionecorso = (DescrizioneCorso)aObj;
		if ((getNomedesc() != null && !getNomedesc().equals(descrizionecorso.getNomedesc())) || (getNomedesc() == null && descrizionecorso.getNomedesc() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getNomedesc() == null ? 0 : getNomedesc().hashCode());
		return hashcode;
	}
	
	private String nomedesc;
	
	private peristentmodel.TipologiaCorso tipologiacorso;
	
	private boolean prenotazione;
	
	public void setNomedesc(String value) {
		this.nomedesc = value;
	}
	
	public String getNomedesc() {
		return nomedesc;
	}
	
	public String getORMID() {
		return getNomedesc();
	}
	
	public void setPrenotazione(boolean value) {
		this.prenotazione = value;
	}
	
	public boolean getPrenotazione() {
		return prenotazione;
	}
	
	public void setTipologiacorso(peristentmodel.TipologiaCorso value) {
		this.tipologiacorso = value;
	}
	
	public peristentmodel.TipologiaCorso getTipologiacorso() {
		return tipologiacorso;
	}
	
	public String toString() {
		return String.valueOf(getNomedesc());
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
