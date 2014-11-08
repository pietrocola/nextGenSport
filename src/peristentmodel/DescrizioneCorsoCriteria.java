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

public class DescrizioneCorsoCriteria extends AbstractORMCriteria {
	public final StringExpression nomedesc;
	public final StringExpression tipologiacorsoId;
	public final AssociationExpression tipologiacorso;
	public final BooleanExpression prenotazione;
	
	public DescrizioneCorsoCriteria(Criteria criteria) {
		super(criteria);
		nomedesc = new StringExpression("nomedesc", this);
		tipologiacorsoId = new StringExpression("tipologiacorso.nometip", this);
		tipologiacorso = new AssociationExpression("tipologiacorso", this);
		prenotazione = new BooleanExpression("prenotazione", this);
	}
	
	public DescrizioneCorsoCriteria(PersistentSession session) {
		this(session.createCriteria(DescrizioneCorso.class));
	}
	
	public DescrizioneCorsoCriteria() throws PersistentException {
		this(peristentmodel.NextGenSport2PersistentManager.instance().getSession());
	}
	
	public TipologiaCorsoCriteria createTipologiacorsoCriteria() {
		return new TipologiaCorsoCriteria(createCriteria("tipologiacorso"));
	}
	
	public DescrizioneCorso uniqueDescrizioneCorso() {
		return (DescrizioneCorso) super.uniqueResult();
	}
	
	public DescrizioneCorso[] listDescrizioneCorso() {
		java.util.List list = super.list();
		return (DescrizioneCorso[]) list.toArray(new DescrizioneCorso[list.size()]);
	}
}

