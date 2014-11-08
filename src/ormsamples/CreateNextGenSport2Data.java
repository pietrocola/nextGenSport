/**
 * Licensee: Universita degli Studi dell'Aquila
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateNextGenSport2Data {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = peristentmodel.NextGenSport2PersistentManager.instance().getSession().beginTransaction();
		try {
			peristentmodel.ElencoTipologieCorso lperistentmodelElencoTipologieCorso = peristentmodel.ElencoTipologieCorsoDAO.createElencoTipologieCorso();
			// Initialize the properties of the persistent object here
			peristentmodel.ElencoTipologieCorsoDAO.save(lperistentmodelElencoTipologieCorso);
			peristentmodel.TipologiaCorso lperistentmodelTipologiaCorso = peristentmodel.TipologiaCorsoDAO.createTipologiaCorso();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : nometip
			peristentmodel.TipologiaCorsoDAO.save(lperistentmodelTipologiaCorso);
			peristentmodel.DescrizioneCorso lperistentmodelDescrizioneCorso = peristentmodel.DescrizioneCorsoDAO.createDescrizioneCorso();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : prenotazione, nomedesc
			peristentmodel.DescrizioneCorsoDAO.save(lperistentmodelDescrizioneCorso);
			peristentmodel.ElencoDescrizioniCorso lperistentmodelElencoDescrizioniCorso = peristentmodel.ElencoDescrizioniCorsoDAO.createElencoDescrizioniCorso();
			// Initialize the properties of the persistent object here
			peristentmodel.ElencoDescrizioniCorsoDAO.save(lperistentmodelElencoDescrizioniCorso);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateNextGenSport2Data createNextGenSport2Data = new CreateNextGenSport2Data();
			try {
				createNextGenSport2Data.createTestData();
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
