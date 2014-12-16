package model;

import java.util.ArrayList;

import org.orm.PersistentException;

import peristentmodel.APersistentModel;
import peristentmodel.TipologiaCorso;
import peristentmodel.TipologiaCorsoDAO;

public class M_TipologiaCorso extends AModel {

	
	public M_TipologiaCorso () {}
	
	public M_TipologiaCorso (TipologiaCorso t)
	{
		this.setPersistentModel(t);
		
	}
	
	
	public String getNome() {
		TipologiaCorsoDAO tp=new TipologiaCorsoDAO();
		
		return null;
	}
	
	public boolean memorizza(String nome) throws PersistentException 
	{
		TipologiaCorso tip = (TipologiaCorso)this.getPersistentModel();
		tip = new TipologiaCorso();
		//TipologiaCorso tip = new TipologiaCorso();
		tip.setNometip(nome);		
		boolean aux;
		TipologiaCorsoDAO tp=new TipologiaCorsoDAO();
		aux=tp.save(tip);
		
		
		  //List df = tp.queryTipologiaCorso("ElencoTipologieCorsoID=NULL", "ID");
		  /*System.out.print( "[" );
	        Iterator itr = df.iterator();
	        while ( itr.hasNext() ) 
	            System.out.print( "  " + itr.next() ); 
	        System.out.println( "]" ); 
		  */
		TipologiaCorso[] df = tp.listTipologiaCorsoByQuery("ElencoTipologieCorsoID=NULL", "ID");
		//for(int i=0; i< df.length; i++)
		//{ System.out.print(df[i].getNometip() + "\n");}
		 
		if(aux)  return true;
			else  return false;
	}
	
	//inserisce i dato nel db nella tabella tipologia corso
	public boolean setNome()
	{
		return (Boolean) null;
	}
	
	public ArrayList<TipologiaCorso > getElencoTipologie() throws PersistentException
	{
		//usando Array
		TipologiaCorsoDAO tp=new TipologiaCorsoDAO();
		TipologiaCorso[] arrayTip = tp.listTipologiaCorsoByQuery("ElencoTipologieCorsoID=NULL", "ID");
		
		ArrayList arrayLTip = new ArrayList(); //trasformo l'array in ArrayList
		for (int i=0; i < arrayTip.length; i++)
			arrayLTip.add(arrayTip[i]);
		
		//for(int i=0; i< arrayTip.length; i++)
		//{ System.out.print(arrayTip[i].getNometip() + "\n");}
		
		return arrayLTip;
		
		//usando List
		  //List df = tp.queryTipologiaCorso("ElencoTipologieCorsoID=NULL", "ID");
		  /*System.out.print( "[" );
	        Iterator itr = df.iterator();
	        while ( itr.hasNext() ) 
	            System.out.print( "  " + itr.next() ); 
	        System.out.println( "]" ); 
		  */
	}

	public TipologiaCorso getTipCorso(String nomeTip) {
		
		TipologiaCorsoDAO tp=new TipologiaCorsoDAO();
		//TipologiaCorso tc = tp.listTipologiaCorsoByQuery("ID="+nomeTip, "ID");
		
		return /*tc*/ null;
	}

	public APersistentModel getPersistentModel() {
		return this.model;
		}

		
	public void setPersistentModel(APersistentModel model) {
			this.model = model;
			
		}

	

	
	}

	

