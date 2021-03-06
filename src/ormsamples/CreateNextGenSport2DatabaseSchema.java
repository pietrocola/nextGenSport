/**
 * Licensee: Universita degli Studi dell'Aquila
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateNextGenSport2DatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(peristentmodel.NextGenSport2PersistentManager.instance());
			peristentmodel.NextGenSport2PersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
