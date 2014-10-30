/**
 * Licensee: Universita degli Studi dell'Aquila
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteNextGenSport2Data {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = model.NextGenSport2PersistentManager.instance().getSession().beginTransaction();
		try {
			model.ElencoTipologieCorso lmodelElencoTipologieCorso = model.ElencoTipologieCorsoDAO.loadElencoTipologieCorsoByQuery(null, null);
			// Delete the persistent object
			model.ElencoTipologieCorsoDAO.delete(lmodelElencoTipologieCorso);
			model.TipologiaCorso lmodelTipologiaCorso = model.TipologiaCorsoDAO.loadTipologiaCorsoByQuery(null, null);
			// Delete the persistent object
			model.TipologiaCorsoDAO.delete(lmodelTipologiaCorso);
			model.DescrizioneCorso lmodelDescrizioneCorso = model.DescrizioneCorsoDAO.loadDescrizioneCorsoByQuery(null, null);
			// Delete the persistent object
			model.DescrizioneCorsoDAO.delete(lmodelDescrizioneCorso);
			model.ElencoDescrizioniCorso lmodelElencoDescrizioniCorso = model.ElencoDescrizioniCorsoDAO.loadElencoDescrizioniCorsoByQuery(null, null);
			// Delete the persistent object
			model.ElencoDescrizioniCorsoDAO.delete(lmodelElencoDescrizioniCorso);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteNextGenSport2Data deleteNextGenSport2Data = new DeleteNextGenSport2Data();
			try {
				deleteNextGenSport2Data.deleteTestData();
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
