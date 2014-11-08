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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ElencoTipologieCorsoCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final CollectionExpression elencocorsi;
	
	public ElencoTipologieCorsoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		elencocorsi = new CollectionExpression("elencocorsi", this);
	}
	
	public ElencoTipologieCorsoCriteria(PersistentSession session) {
		this(session.createCriteria(ElencoTipologieCorso.class));
	}
	
	public ElencoTipologieCorsoCriteria() throws PersistentException {
		this(peristentmodel.NextGenSport2PersistentManager.instance().getSession());
	}
	
	public TipologiaCorsoCriteria createElencocorsiCriteria() {
		return new TipologiaCorsoCriteria(createCriteria("elencocorsi"));
	}
	
	public ElencoTipologieCorso uniqueElencoTipologieCorso() {
		return (ElencoTipologieCorso) super.uniqueResult();
	}
	
	public ElencoTipologieCorso[] listElencoTipologieCorso() {
		java.util.List list = super.list();
		return (ElencoTipologieCorso[]) list.toArray(new ElencoTipologieCorso[list.size()]);
	}
}

