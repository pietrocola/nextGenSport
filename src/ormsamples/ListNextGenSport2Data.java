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
		peristentmodel.ElencoTipologieCorso[] peristentmodelElencoTipologieCorsos = peristentmodel.ElencoTipologieCorsoDAO.listElencoTipologieCorsoByQuery(null, null);
		int length = Math.min(peristentmodelElencoTipologieCorsos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(peristentmodelElencoTipologieCorsos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing TipologiaCorso...");
		peristentmodel.TipologiaCorso[] peristentmodelTipologiaCorsos = peristentmodel.TipologiaCorsoDAO.listTipologiaCorsoByQuery(null, null);
		length = Math.min(peristentmodelTipologiaCorsos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(peristentmodelTipologiaCorsos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing DescrizioneCorso...");
		peristentmodel.DescrizioneCorso[] peristentmodelDescrizioneCorsos = peristentmodel.DescrizioneCorsoDAO.listDescrizioneCorsoByQuery(null, null);
		length = Math.min(peristentmodelDescrizioneCorsos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(peristentmodelDescrizioneCorsos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing ElencoDescrizioniCorso...");
		peristentmodel.ElencoDescrizioniCorso[] peristentmodelElencoDescrizioniCorsos = peristentmodel.ElencoDescrizioniCorsoDAO.listElencoDescrizioniCorsoByQuery(null, null);
		length = Math.min(peristentmodelElencoDescrizioniCorsos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(peristentmodelElencoDescrizioniCorsos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing ElencoTipologieCorso by Criteria...");
		peristentmodel.ElencoTipologieCorsoCriteria lperistentmodelElencoTipologieCorsoCriteria = new peristentmodel.ElencoTipologieCorsoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lperistentmodelElencoTipologieCorsoCriteria.ID.eq();
		lperistentmodelElencoTipologieCorsoCriteria.setMaxResults(ROW_COUNT);
		peristentmodel.ElencoTipologieCorso[] peristentmodelElencoTipologieCorsos = lperistentmodelElencoTipologieCorsoCriteria.listElencoTipologieCorso();
		int length =peristentmodelElencoTipologieCorsos== null ? 0 : Math.min(peristentmodelElencoTipologieCorsos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(peristentmodelElencoTipologieCorsos[i]);
		}
		System.out.println(length + " ElencoTipologieCorso record(s) retrieved."); 
		
		System.out.println("Listing TipologiaCorso by Criteria...");
		peristentmodel.TipologiaCorsoCriteria lperistentmodelTipologiaCorsoCriteria = new peristentmodel.TipologiaCorsoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lperistentmodelTipologiaCorsoCriteria.nometip.eq();
		lperistentmodelTipologiaCorsoCriteria.setMaxResults(ROW_COUNT);
		peristentmodel.TipologiaCorso[] peristentmodelTipologiaCorsos = lperistentmodelTipologiaCorsoCriteria.listTipologiaCorso();
		length =peristentmodelTipologiaCorsos== null ? 0 : Math.min(peristentmodelTipologiaCorsos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(peristentmodelTipologiaCorsos[i]);
		}
		System.out.println(length + " TipologiaCorso record(s) retrieved."); 
		
		System.out.println("Listing DescrizioneCorso by Criteria...");
		peristentmodel.DescrizioneCorsoCriteria lperistentmodelDescrizioneCorsoCriteria = new peristentmodel.DescrizioneCorsoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lperistentmodelDescrizioneCorsoCriteria.nomedesc.eq();
		lperistentmodelDescrizioneCorsoCriteria.setMaxResults(ROW_COUNT);
		peristentmodel.DescrizioneCorso[] peristentmodelDescrizioneCorsos = lperistentmodelDescrizioneCorsoCriteria.listDescrizioneCorso();
		length =peristentmodelDescrizioneCorsos== null ? 0 : Math.min(peristentmodelDescrizioneCorsos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(peristentmodelDescrizioneCorsos[i]);
		}
		System.out.println(length + " DescrizioneCorso record(s) retrieved."); 
		
		System.out.println("Listing ElencoDescrizioniCorso by Criteria...");
		peristentmodel.ElencoDescrizioniCorsoCriteria lperistentmodelElencoDescrizioniCorsoCriteria = new peristentmodel.ElencoDescrizioniCorsoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lperistentmodelElencoDescrizioniCorsoCriteria.ID.eq();
		lperistentmodelElencoDescrizioniCorsoCriteria.setMaxResults(ROW_COUNT);
		peristentmodel.ElencoDescrizioniCorso[] peristentmodelElencoDescrizioniCorsos = lperistentmodelElencoDescrizioniCorsoCriteria.listElencoDescrizioniCorso();
		length =peristentmodelElencoDescrizioniCorsos== null ? 0 : Math.min(peristentmodelElencoDescrizioniCorsos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(peristentmodelElencoDescrizioniCorsos[i]);
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
				peristentmodel.NextGenSport2PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
