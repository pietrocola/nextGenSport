package model;

import peristentmodel.APersistentModel;
import peristentmodel.TipologiaCorso;
import peristentmodel.TipologiaCorsoDAO;

public class M_ElencoDescrizioniCorso extends AModel {

	/**
	 * 
	 * @param nomeCorso
	 * @param tip
	 * @param prenot
	 */
	public void configuraCorso(String nomeCorso, M_TipologiaCorso tip, boolean prenot) {
		// TODO - implement M_ElencoDescrizioniCorso.configuraCorso
		throw new UnsupportedOperationException();
	}
	
	/**
	 * 
	 * @param dc
	 */
	public void addDescrizione(M_DescrizioneCorso dc) {
		// TODO - implement M_ElencoDescrizioniCorso.addDescrizione
		throw new UnsupportedOperationException();
	}

	@Override
	public APersistentModel getPersistentModel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPersistentModel(APersistentModel model) {
		// TODO Auto-generated method stub
		
	}

	

}