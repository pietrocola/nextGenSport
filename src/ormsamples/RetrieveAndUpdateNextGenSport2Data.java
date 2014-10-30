/**
 * Licensee: Universita degli Studi dell'Aquila
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateNextGenSport2Data {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = model.NextGenSport2PersistentManager.instance().getSession().beginTransaction();
		try {
			model.ElencoTipologieCorso lmodelElencoTipologieCorso = model.ElencoTipologieCorsoDAO.loadElencoTipologieCorsoByQuery(null, null);
			// Update the properties of the persistent object
			model.ElencoTipologieCorsoDAO.save(lmodelElencoTipologieCorso);
			model.TipologiaCorso lmodelTipologiaCorso = model.TipologiaCorsoDAO.loadTipologiaCorsoByQuery(null, null);
			// Update the properties of the persistent object
			model.TipologiaCorsoDAO.save(lmodelTipologiaCorso);
			model.DescrizioneCorso lmodelDescrizioneCorso = model.DescrizioneCorsoDAO.loadDescrizioneCorsoByQuery(null, null);
			// Update the properties of the persistent object
			model.DescrizioneCorsoDAO.save(lmodelDescrizioneCorso);
			model.ElencoDescrizioniCorso lmodelElencoDescrizioniCorso = model.ElencoDescrizioniCorsoDAO.loadElencoDescrizioniCorsoByQuery(null, null);
			// Update the properties of the persistent object
			model.ElencoDescrizioniCorsoDAO.save(lmodelElencoDescrizioniCorso);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving ElencoTipologieCorso by ElencoTipologieCorsoCriteria");
		model.ElencoTipologieCorsoCriteria lmodelElencoTipologieCorsoCriteria = new model.ElencoTipologieCorsoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lmodelElencoTipologieCorsoCriteria.ID.eq();
		System.out.println(lmodelElencoTipologieCorsoCriteria.uniqueElencoTipologieCorso());
		
		System.out.println("Retrieving TipologiaCorso by TipologiaCorsoCriteria");
		model.TipologiaCorsoCriteria lmodelTipologiaCorsoCriteria = new model.TipologiaCorsoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lmodelTipologiaCorsoCriteria.nome.eq();
		System.out.println(lmodelTipologiaCorsoCriteria.uniqueTipologiaCorso());
		
		System.out.println("Retrieving DescrizioneCorso by DescrizioneCorsoCriteria");
		model.DescrizioneCorsoCriteria lmodelDescrizioneCorsoCriteria = new model.DescrizioneCorsoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lmodelDescrizioneCorsoCriteria.nome.eq();
		System.out.println(lmodelDescrizioneCorsoCriteria.uniqueDescrizioneCorso());
		
		System.out.println("Retrieving ElencoDescrizioniCorso by ElencoDescrizioniCorsoCriteria");
		model.ElencoDescrizioniCorsoCriteria lmodelElencoDescrizioniCorsoCriteria = new model.ElencoDescrizioniCorsoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lmodelElencoDescrizioniCorsoCriteria.ID.eq();
		System.out.println(lmodelElencoDescrizioniCorsoCriteria.uniqueElencoDescrizioniCorso());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateNextGenSport2Data retrieveAndUpdateNextGenSport2Data = new RetrieveAndUpdateNextGenSport2Data();
			try {
				retrieveAndUpdateNextGenSport2Data.retrieveAndUpdateTestData();
				//retrieveAndUpdateNextGenSport2Data.retrieveByCriteria();
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
