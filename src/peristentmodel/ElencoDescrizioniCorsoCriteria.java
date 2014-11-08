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

public class ElencoDescrizioniCorsoCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final CollectionExpression elencodescrizioni;
	
	public ElencoDescrizioniCorsoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		elencodescrizioni = new CollectionExpression("elencodescrizioni", this);
	}
	
	public ElencoDescrizioniCorsoCriteria(PersistentSession session) {
		this(session.createCriteria(ElencoDescrizioniCorso.class));
	}
	
	public ElencoDescrizioniCorsoCriteria() throws PersistentException {
		this(peristentmodel.NextGenSport2PersistentManager.instance().getSession());
	}
	
	public DescrizioneCorsoCriteria createElencodescrizioniCriteria() {
		return new DescrizioneCorsoCriteria(createCriteria("elencodescrizioni"));
	}
	
	public ElencoDescrizioniCorso uniqueElencoDescrizioniCorso() {
		return (ElencoDescrizioniCorso) super.uniqueResult();
	}
	
	public ElencoDescrizioniCorso[] listElencoDescrizioniCorso() {
		java.util.List list = super.list();
		return (ElencoDescrizioniCorso[]) list.toArray(new ElencoDescrizioniCorso[list.size()]);
	}
}

