/**
 * Licensee: Universita degli Studi dell'Aquila
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateNextGenSport2Data {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = model.NextGenSport2PersistentManager.instance().getSession().beginTransaction();
		try {
			model.ElencoTipologieCorso lmodelElencoTipologieCorso = model.ElencoTipologieCorsoDAO.createElencoTipologieCorso();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : elencocorsi
			model.ElencoTipologieCorsoDAO.save(lmodelElencoTipologieCorso);
			model.TipologiaCorso lmodelTipologiaCorso = model.TipologiaCorsoDAO.createTipologiaCorso();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : nome
			model.TipologiaCorsoDAO.save(lmodelTipologiaCorso);
			model.DescrizioneCorso lmodelDescrizioneCorso = model.DescrizioneCorsoDAO.createDescrizioneCorso();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : prenotazione, tipologiaCorso, nome
			model.DescrizioneCorsoDAO.save(lmodelDescrizioneCorso);
			model.ElencoDescrizioniCorso lmodelElencoDescrizioniCorso = model.ElencoDescrizioniCorsoDAO.createElencoDescrizioniCorso();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : elencocorsi
			model.ElencoDescrizioniCorsoDAO.save(lmodelElencoDescrizioniCorso);
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
				model.NextGenSport2PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
