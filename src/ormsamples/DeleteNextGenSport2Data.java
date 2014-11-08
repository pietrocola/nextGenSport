/**
 * Licensee: Universita degli Studi dell'Aquila
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteNextGenSport2Data {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = peristentmodel.NextGenSport2PersistentManager.instance().getSession().beginTransaction();
		try {
			peristentmodel.ElencoTipologieCorso lperistentmodelElencoTipologieCorso = peristentmodel.ElencoTipologieCorsoDAO.loadElencoTipologieCorsoByQuery(null, null);
			// Delete the persistent object
			peristentmodel.ElencoTipologieCorsoDAO.delete(lperistentmodelElencoTipologieCorso);
			peristentmodel.TipologiaCorso lperistentmodelTipologiaCorso = peristentmodel.TipologiaCorsoDAO.loadTipologiaCorsoByQuery(null, null);
			// Delete the persistent object
			peristentmodel.TipologiaCorsoDAO.delete(lperistentmodelTipologiaCorso);
			peristentmodel.DescrizioneCorso lperistentmodelDescrizioneCorso = peristentmodel.DescrizioneCorsoDAO.loadDescrizioneCorsoByQuery(null, null);
			// Delete the persistent object
			peristentmodel.DescrizioneCorsoDAO.delete(lperistentmodelDescrizioneCorso);
			peristentmodel.ElencoDescrizioniCorso lperistentmodelElencoDescrizioniCorso = peristentmodel.ElencoDescrizioniCorsoDAO.loadElencoDescrizioniCorsoByQuery(null, null);
			// Delete the persistent object
			peristentmodel.ElencoDescrizioniCorsoDAO.delete(lperistentmodelElencoDescrizioniCorso);
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
				peristentmodel.NextGenSport2PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
