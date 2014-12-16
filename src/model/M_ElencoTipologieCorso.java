package model;

import java.util.ArrayList;

import org.orm.PersistentException;







import peristentmodel.APersistentModel;
import peristentmodel.TipologiaCorso;


public class M_ElencoTipologieCorso extends AModel {
	
	

	/**
	 * 
	 * @param nomeTip
	 * @throws PersistentException 
	 * elenco crea una nuova tipoligia corso
	 */
	public boolean impostaTipologiaCorso(String nomeTip) throws PersistentException{
		
		M_TipologiaCorso t = new M_TipologiaCorso();
		//return t.memorizza(nomeTip);
		return (Boolean) null;
		}

	/**
	 * 
	 * @param tc
	 * @throws PersistentException 
	 */
	public void addTipologia(M_TipologiaCorso tc) throws PersistentException {
		
		/*ElencoTipologieCorso ele = new ElencoTipologieCorso();
		
		ElencoTipologieCorsoDAO e=new ElencoTipologieCorsoDAO();
		e.save(tc);	//con save elenco salva se stesso nella tabella elencotipologiecorso
		*/
	}

	public ArrayList<TipologiaCorso> getNomeTipologie() throws PersistentException {
		M_TipologiaCorso t = new M_TipologiaCorso();
		return t.getElencoTipologie(); 
	}

	/**
	 * 
	 * @param nomeTip
	 */
	public TipologiaCorso getTipologia(String nomeTip) {
		M_TipologiaCorso t = new M_TipologiaCorso();
		return t.getTipCorso(nomeTip); 
	}
	
	
	public boolean memorizza(String nomeTip) throws PersistentException
  
	{
		
		M_TipologiaCorso t = new M_TipologiaCorso();
		return t.memorizza(nomeTip);		
	}

	
	public APersistentModel getPersistentModel() {
		return this.model;
		}

		
	public void setPersistentModel(APersistentModel model) {
			this.model = model;
			
		}

	
}