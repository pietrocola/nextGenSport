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

public class TipologiaCorsoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression nome;
	
	public TipologiaCorsoDetachedCriteria() {
		super(model.TipologiaCorso.class, model.TipologiaCorsoCriteria.class);
		nome = new StringExpression("nome", this.getDetachedCriteria());
	}
	
	public TipologiaCorsoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, model.TipologiaCorsoCriteria.class);
		nome = new StringExpression("nome", this.getDetachedCriteria());
	}
	
	public TipologiaCorso uniqueTipologiaCorso(PersistentSession session) {
		return (TipologiaCorso) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public TipologiaCorso[] listTipologiaCorso(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (TipologiaCorso[]) list.toArray(new TipologiaCorso[list.size()]);
	}
}

