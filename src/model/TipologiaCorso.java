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

public class TipologiaCorso {
	public TipologiaCorso() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof TipologiaCorso))
			return false;
		TipologiaCorso tipologiacorso = (TipologiaCorso)aObj;
		if ((getNome() != null && !getNome().equals(tipologiacorso.getNome())) || (getNome() == null && tipologiacorso.getNome() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getNome() == null ? 0 : getNome().hashCode());
		return hashcode;
	}
	
	private String nome;
	
	public void setNome(String value) {
		this.nome = value;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getORMID() {
		return getNome();
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
