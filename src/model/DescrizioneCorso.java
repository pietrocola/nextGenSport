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

public class DescrizioneCorso {
	public DescrizioneCorso() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof DescrizioneCorso))
			return false;
		DescrizioneCorso descrizionecorso = (DescrizioneCorso)aObj;
		if ((getNome() != null && !getNome().equals(descrizionecorso.getNome())) || (getNome() == null && descrizionecorso.getNome() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getNome() == null ? 0 : getNome().hashCode());
		return hashcode;
	}
	
	private String nome;
	
	private model.TipologiaCorso tipologiaCorso;
	
	private boolean prenotazione;
	
	public void setNome(String value) {
		this.nome = value;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getORMID() {
		return getNome();
	}
	
	public void setPrenotazione(boolean value) {
		this.prenotazione = value;
	}
	
	public boolean getPrenotazione() {
		return prenotazione;
	}
	
	public void setTipologiaCorso(model.TipologiaCorso value) {
		this.tipologiaCorso = value;
	}
	
	public model.TipologiaCorso getTipologiaCorso() {
		return tipologiaCorso;
	}
	
	public String[] getInfoRiepilogo() {
				//TODO: Implement Method
				throw new UnsupportedOperationException();
				//commento
	}
	
	public String toString() {
		return String.valueOf(getNome());
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
