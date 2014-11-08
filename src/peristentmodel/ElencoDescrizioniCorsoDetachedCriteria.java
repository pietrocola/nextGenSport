/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Universita degli Studi dell'Aquila
 * License Type: Academic
 */
package peristentmodel;

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ElencoDescrizioniCorsoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final CollectionExpression elencodescrizioni;
	
	public ElencoDescrizioniCorsoDetachedCriteria() {
		super(peristentmodel.ElencoDescrizioniCorso.class, peristentmodel.ElencoDescrizioniCorsoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		elencodescrizioni = new CollectionExpression("elencodescrizioni", this.getDetachedCriteria());
	}
	
	public ElencoDescrizioniCorsoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, peristentmodel.ElencoDescrizioniCorsoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		elencodescrizioni = new CollectionExpression("elencodescrizioni", this.getDetachedCriteria());
	}
	
	public DescrizioneCorsoDetachedCriteria createElencodescrizioniCriteria() {
		return new DescrizioneCorsoDetachedCriteria(createCriteria("elencodescrizioni"));
	}
	
	public ElencoDescrizioniCorso uniqueElencoDescrizioniCorso(PersistentSession session) {
		return (ElencoDescrizioniCorso) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public ElencoDescrizioniCorso[] listElencoDescrizioniCorso(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (ElencoDescrizioniCorso[]) list.toArray(new ElencoDescrizioniCorso[list.size()]);
	}
}

