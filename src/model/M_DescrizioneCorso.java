package model;

import org.orm.PersistentException;

import peristentmodel.APersistentModel;
import peristentmodel.DescrizioneCorso;
import peristentmodel.DescrizioneCorsoDAO;
import peristentmodel.TipologiaCorso;
import peristentmodel.TipologiaCorsoDAO;

public class M_DescrizioneCorso extends AModel {

	public M_DescrizioneCorso() throws PersistentException
	{
		
	}
	
	public boolean memorizza(String nome, boolean i, TipologiaCorso string) throws PersistentException
	{
		/*DescrizioneCorso dc = (DescrizioneCorso)this.getPersistentModel();
		dc = new DescrizioneCorso();*/
		DescrizioneCorso dc = new DescrizioneCorso();
		dc.setNomedesc(nome);	
		dc.setTipologiacorso(string);
		dc.setPrenotazione(i);
		boolean aux;
		DescrizioneCorsoDAO descC=new DescrizioneCorsoDAO();
		aux=descC.save(dc);
		
		if(aux){return true;}
		else{return false;}
	}
	public String[] getInfoRiepilogo() {
		// TODO - implement M_DescrizioneCorso.getInfoRiepilogo
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