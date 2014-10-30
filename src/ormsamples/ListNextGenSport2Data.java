/**
 * Licensee: Universita degli Studi dell'Aquila
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListNextGenSport2Data {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing ElencoTipologieCorso...");
		model.ElencoTipologieCorso[] modelElencoTipologieCorsos = model.ElencoTipologieCorsoDAO.listElencoTipologieCorsoByQuery(null, null);
		int length = Math.min(modelElencoTipologieCorsos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(modelElencoTipologieCorsos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing TipologiaCorso...");
		model.TipologiaCorso[] modelTipologiaCorsos = model.TipologiaCorsoDAO.listTipologiaCorsoByQuery(null, null);
		length = Math.min(modelTipologiaCorsos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(modelTipologiaCorsos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing DescrizioneCorso...");
		model.DescrizioneCorso[] modelDescrizioneCorsos = model.DescrizioneCorsoDAO.listDescrizioneCorsoByQuery(null, null);
		length = Math.min(modelDescrizioneCorsos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(modelDescrizioneCorsos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing ElencoDescrizioniCorso...");
		model.ElencoDescrizioniCorso[] modelElencoDescrizioniCorsos = model.ElencoDescrizioniCorsoDAO.listElencoDescrizioniCorsoByQuery(null, null);
		length = Math.min(modelElencoDescrizioniCorsos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(modelElencoDescrizioniCorsos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing ElencoTipologieCorso by Criteria...");
		model.ElencoTipologieCorsoCriteria lmodelElencoTipologieCorsoCriteria = new model.ElencoTipologieCorsoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lmodelElencoTipologieCorsoCriteria.ID.eq();
		lmodelElencoTipologieCorsoCriteria.setMaxResults(ROW_COUNT);
		model.ElencoTipologieCorso[] modelElencoTipologieCorsos = lmodelElencoTipologieCorsoCriteria.listElencoTipologieCorso();
		int length =modelElencoTipologieCorsos== null ? 0 : Math.min(modelElencoTipologieCorsos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(modelElencoTipologieCorsos[i]);
		}
		System.out.println(length + " ElencoTipologieCorso record(s) retrieved."); 
		
		System.out.println("Listing TipologiaCorso by Criteria...");
		model.TipologiaCorsoCriteria lmodelTipologiaCorsoCriteria = new model.TipologiaCorsoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lmodelTipologiaCorsoCriteria.nome.eq();
		lmodelTipologiaCorsoCriteria.setMaxResults(ROW_COUNT);
		model.TipologiaCorso[] modelTipologiaCorsos = lmodelTipologiaCorsoCriteria.listTipologiaCorso();
		length =modelTipologiaCorsos== null ? 0 : Math.min(modelTipologiaCorsos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(modelTipologiaCorsos[i]);
		}
		System.out.println(length + " TipologiaCorso record(s) retrieved."); 
		
		System.out.println("Listing DescrizioneCorso by Criteria...");
		model.DescrizioneCorsoCriteria lmodelDescrizioneCorsoCriteria = new model.DescrizioneCorsoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lmodelDescrizioneCorsoCriteria.nome.eq();
		lmodelDescrizioneCorsoCriteria.setMaxResults(ROW_COUNT);
		model.DescrizioneCorso[] modelDescrizioneCorsos = lmodelDescrizioneCorsoCriteria.listDescrizioneCorso();
		length =modelDescrizioneCorsos== null ? 0 : Math.min(modelDescrizioneCorsos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(modelDescrizioneCorsos[i]);
		}
		System.out.println(length + " DescrizioneCorso record(s) retrieved."); 
		
		System.out.println("Listing ElencoDescrizioniCorso by Criteria...");
		model.ElencoDescrizioniCorsoCriteria lmodelElencoDescrizioniCorsoCriteria = new model.ElencoDescrizioniCorsoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lmodelElencoDescrizioniCorsoCriteria.ID.eq();
		lmodelElencoDescrizioniCorsoCriteria.setMaxResults(ROW_COUNT);
		model.ElencoDescrizioniCorso[] modelElencoDescrizioniCorsos = lmodelElencoDescrizioniCorsoCriteria.listElencoDescrizioniCorso();
		length =modelElencoDescrizioniCorsos== null ? 0 : Math.min(modelElencoDescrizioniCorsos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(modelElencoDescrizioniCorsos[i]);
		}
		System.out.println(length + " ElencoDescrizioniCorso record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListNextGenSport2Data listNextGenSport2Data = new ListNextGenSport2Data();
			try {
				listNextGenSport2Data.listTestData();
				//listNextGenSport2Data.listByCriteria();
			}
			finally {
				model.NextGenSport2PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
