package modello_dominio;

import modello_dominio.*;
import java.util.ArrayList;

public class ElencoDescrizioniCorso {

	private DescrizioneCorso[] descrizioni;

	public ElencoDescrizioniCorso()
	{
		ArrayList<DescrizioneCorso> descrizioni = new ArrayList<DescrizioneCorso>();
	}
	
	/**
	 * 
	 * @param nomeCorso
	 * @param tip
	 * @param prenot
	 */
	public void configuraCorso(String nomeCorso, TipologiaCorso tip, boolean prenot) 
	{
		
	}

	/**
	 * 
	 * @param dc
	 */
	public void addDescrizione(DescrizioneCorso dc) {
		// TODO - implement ElencoDescrizioniCorso.addDescrizione
		throw new UnsupportedOperationException();
	}

}