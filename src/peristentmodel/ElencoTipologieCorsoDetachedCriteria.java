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

public class ElencoTipologieCorsoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final CollectionExpression elencocorsi;
	
	public ElencoTipologieCorsoDetachedCriteria() {
		super(peristentmodel.ElencoTipologieCorso.class, peristentmodel.ElencoTipologieCorsoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		elencocorsi = new CollectionExpression("elencocorsi", this.getDetachedCriteria());
	}
	
	public ElencoTipologieCorsoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, peristentmodel.ElencoTipologieCorsoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		elencocorsi = new CollectionExpression("elencocorsi", this.getDetachedCriteria());
	}
	
	public TipologiaCorsoDetachedCriteria createElencocorsiCriteria() {
		return new TipologiaCorsoDetachedCriteria(createCriteria("elencocorsi"));
	}
	
	public ElencoTipologieCorso uniqueElencoTipologieCorso(PersistentSession session) {
		return (ElencoTipologieCorso) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public ElencoTipologieCorso[] listElencoTipologieCorso(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (ElencoTipologieCorso[]) list.toArray(new ElencoTipologieCorso[list.size()]);
	}
}

