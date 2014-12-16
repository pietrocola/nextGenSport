package controller;

import java.util.ArrayList;

import org.orm.PersistentException;

import peristentmodel.TipologiaCorso;
import model.*;

public class ConfAbbCorsiHandler {

	M_ElencoTipologieCorso elencotip;
	M_ElencoDescrizioniCorso elencodesc;

	
	/**
	 * inizializza la classe M_ElencoTipologieCorso	
	 * @return
	 */
	public M_ElencoTipologieCorso inizializzaElenco()
	{
		return elencotip = new M_ElencoTipologieCorso(); //in caso d'uso di avviamento
	}
	
	/**
	 * 
	 * @param nomeTip
	 * @throws PersistentException 
	 */
	public boolean impostaTipologiaCorso(String nomeTip) throws PersistentException {
				
		inizializzaElenco();
		return elencotip.memorizza(nomeTip);		
	}

	
	
	public ArrayList<TipologiaCorso> getNomeTipologie() throws PersistentException {
		inizializzaElenco();
		ArrayList<TipologiaCorso> aux = elencotip.getNomeTipologie();
		return aux;
		
		//throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nomeCorso
	 * @param i 
	 * @param prenot
	 * @param object
	 * @return 
	 * @throws PersistentException 
	 */
	public boolean configuraCorso(String nomeCorso, boolean i, TipologiaCorso string) throws PersistentException {
		//inizializzaElenco();
		//TipologiaCorso tc = elencotip.getTipologia(nomeTip);
		M_DescrizioneCorso dc = new M_DescrizioneCorso();
		return dc.memorizza(nomeCorso, i, string);
				
		//return elencodesc.configuraCorso(nomeCorso, nomeTip, prenot);
	}
	
}