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
package model;

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ElencoDescrizioniCorsoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final CollectionExpression elencocorsi;
	
	public ElencoDescrizioniCorsoDetachedCriteria() {
		super(model.ElencoDescrizioniCorso.class, model.ElencoDescrizioniCorsoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		elencocorsi = new CollectionExpression("elencocorsi", this.getDetachedCriteria());
	}
	
	public ElencoDescrizioniCorsoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, model.ElencoDescrizioniCorsoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		elencocorsi = new CollectionExpression("elencocorsi", this.getDetachedCriteria());
	}
	
	public DescrizioneCorsoDetachedCriteria createElencocorsiCriteria() {
		return new DescrizioneCorsoDetachedCriteria(createCriteria("elencocorsi"));
	}
	
	public ElencoDescrizioniCorso uniqueElencoDescrizioniCorso(PersistentSession session) {
		return (ElencoDescrizioniCorso) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public ElencoDescrizioniCorso[] listElencoDescrizioniCorso(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (ElencoDescrizioniCorso[]) list.toArray(new ElencoDescrizioniCorso[list.size()]);
	}
}

