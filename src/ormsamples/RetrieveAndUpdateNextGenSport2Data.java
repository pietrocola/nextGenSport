/**
 * Licensee: Universita degli Studi dell'Aquila
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateNextGenSport2Data {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = peristentmodel.NextGenSport2PersistentManager.instance().getSession().beginTransaction();
		try {
			peristentmodel.ElencoTipologieCorso lperistentmodelElencoTipologieCorso = peristentmodel.ElencoTipologieCorsoDAO.loadElencoTipologieCorsoByQuery(null, null);
			// Update the properties of the persistent object
			peristentmodel.ElencoTipologieCorsoDAO.save(lperistentmodelElencoTipologieCorso);
			peristentmodel.TipologiaCorso lperistentmodelTipologiaCorso = peristentmodel.TipologiaCorsoDAO.loadTipologiaCorsoByQuery(null, null);
			// Update the properties of the persistent object
			peristentmodel.TipologiaCorsoDAO.save(lperistentmodelTipologiaCorso);
			peristentmodel.DescrizioneCorso lperistentmodelDescrizioneCorso = peristentmodel.DescrizioneCorsoDAO.loadDescrizioneCorsoByQuery(null, null);
			// Update the properties of the persistent object
			peristentmodel.DescrizioneCorsoDAO.save(lperistentmodelDescrizioneCorso);
			peristentmodel.ElencoDescrizioniCorso lperistentmodelElencoDescrizioniCorso = peristentmodel.ElencoDescrizioniCorsoDAO.loadElencoDescrizioniCorsoByQuery(null, null);
			// Update the properties of the persistent object
			peristentmodel.ElencoDescrizioniCorsoDAO.save(lperistentmodelElencoDescrizioniCorso);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving ElencoTipologieCorso by ElencoTipologieCorsoCriteria");
		peristentmodel.ElencoTipologieCorsoCriteria lperistentmodelElencoTipologieCorsoCriteria = new peristentmodel.ElencoTipologieCorsoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lperistentmodelElencoTipologieCorsoCriteria.ID.eq();
		System.out.println(lperistentmodelElencoTipologieCorsoCriteria.uniqueElencoTipologieCorso());
		
		System.out.println("Retrieving TipologiaCorso by TipologiaCorsoCriteria");
		peristentmodel.TipologiaCorsoCriteria lperistentmodelTipologiaCorsoCriteria = new peristentmodel.TipologiaCorsoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lperistentmodelTipologiaCorsoCriteria.nometip.eq();
		System.out.println(lperistentmodelTipologiaCorsoCriteria.uniqueTipologiaCorso());
		
		System.out.println("Retrieving DescrizioneCorso by DescrizioneCorsoCriteria");
		peristentmodel.DescrizioneCorsoCriteria lperistentmodelDescrizioneCorsoCriteria = new peristentmodel.DescrizioneCorsoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lperistentmodelDescrizioneCorsoCriteria.nomedesc.eq();
		System.out.println(lperistentmodelDescrizioneCorsoCriteria.uniqueDescrizioneCorso());
		
		System.out.println("Retrieving ElencoDescrizioniCorso by ElencoDescrizioniCorsoCriteria");
		peristentmodel.ElencoDescrizioniCorsoCriteria lperistentmodelElencoDescrizioniCorsoCriteria = new peristentmodel.ElencoDescrizioniCorsoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lperistentmodelElencoDescrizioniCorsoCriteria.ID.eq();
		System.out.println(lperistentmodelElencoDescrizioniCorsoCriteria.uniqueElencoDescrizioniCorso());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateNextGenSport2Data retrieveAndUpdateNextGenSport2Data = new RetrieveAndUpdateNextGenSport2Data();
			try {
				retrieveAndUpdateNextGenSport2Data.retrieveAndUpdateTestData();
				//retrieveAndUpdateNextGenSport2Data.retrieveByCriteria();
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
