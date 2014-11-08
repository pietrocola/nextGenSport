package controller;

import java.util.ArrayList;

import model.*;

public class ConfAbbCorsiHandler {

	M_ElencoTipologieCorso elencotip;
	M_ElencoDescrizioniCorso elencodesc;

	
	
	
	/**
	 * 
	 * @param nomeTip
	 */
	public void impostaTipologiaCorso(String nomeTip) {
		// TODO - implement ConfAbbCorsiHandler.impostaTipologiaCorso
		
		elencotip.impostaTipologiaCorso(nomeTip);
		
		
		throw new UnsupportedOperationException();
	}

	
	
	public ArrayList<String> getNomeTipologie() {
		// TODO - implement ConfAbbCorsiHandler.getNomeTipologie
		ArrayList<String> aux = new ArrayList<String>();
		
		aux=elencotip.getNomeTipologie();
		return aux;
		
		//throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nomeCorso
	 * @param prenot
	 * @param nomeTip
	 */
	public void configuraCorso(String nomeCorso, boolean prenot, String nomeTip) {
		// TODO - implement ConfAbbCorsiHandler.configuraCorso
		throw new UnsupportedOperationException();
	}

}