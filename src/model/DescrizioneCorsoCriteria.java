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

public class DescrizioneCorsoCriteria extends AbstractORMCriteria {
	public final StringExpression nome;
	public final StringExpression tipologiaCorsoId;
	public final AssociationExpression tipologiaCorso;
	public final BooleanExpression prenotazione;
	
	public DescrizioneCorsoCriteria(Criteria criteria) {
		super(criteria);
		nome = new StringExpression("nome", this);
		tipologiaCorsoId = new StringExpression("tipologiaCorso.nome", this);
		tipologiaCorso = new AssociationExpression("tipologiaCorso", this);
		prenotazione = new BooleanExpression("prenotazione", this);
	}
	
	public DescrizioneCorsoCriteria(PersistentSession session) {
		this(session.createCriteria(DescrizioneCorso.class));
	}
	
	public DescrizioneCorsoCriteria() throws PersistentException {
		this(model.NextGenSport2PersistentManager.instance().getSession());
	}
	
	public TipologiaCorsoCriteria createTipologiaCorsoCriteria() {
		return new TipologiaCorsoCriteria(createCriteria("tipologiaCorso"));
	}
	
	public DescrizioneCorso uniqueDescrizioneCorso() {
		return (DescrizioneCorso) super.uniqueResult();
	}
	
	public DescrizioneCorso[] listDescrizioneCorso() {
		java.util.List list = super.list();
		return (DescrizioneCorso[]) list.toArray(new DescrizioneCorso[list.size()]);
	}
}

