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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class TipologiaCorsoCriteria extends AbstractORMCriteria {
	public final StringExpression nome;
	
	public TipologiaCorsoCriteria(Criteria criteria) {
		super(criteria);
		nome = new StringExpression("nome", this);
	}
	
	public TipologiaCorsoCriteria(PersistentSession session) {
		this(session.createCriteria(TipologiaCorso.class));
	}
	
	public TipologiaCorsoCriteria() throws PersistentException {
		this(model.NextGenSport2PersistentManager.instance().getSession());
	}
	
	public TipologiaCorso uniqueTipologiaCorso() {
		return (TipologiaCorso) super.uniqueResult();
	}
	
	public TipologiaCorso[] listTipologiaCorso() {
		java.util.List list = super.list();
		return (TipologiaCorso[]) list.toArray(new TipologiaCorso[list.size()]);
	}
}

