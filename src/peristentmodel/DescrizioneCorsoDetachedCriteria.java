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

public class DescrizioneCorsoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression nomedesc;
	public final StringExpression tipologiacorsoId;
	public final AssociationExpression tipologiacorso;
	public final BooleanExpression prenotazione;
	
	public DescrizioneCorsoDetachedCriteria() {
		super(peristentmodel.DescrizioneCorso.class, peristentmodel.DescrizioneCorsoCriteria.class);
		nomedesc = new StringExpression("nomedesc", this.getDetachedCriteria());
		tipologiacorsoId = new StringExpression("tipologiacorso.nometip", this.getDetachedCriteria());
		tipologiacorso = new AssociationExpression("tipologiacorso", this.getDetachedCriteria());
		prenotazione = new BooleanExpression("prenotazione", this.getDetachedCriteria());
	}
	
	public DescrizioneCorsoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, peristentmodel.DescrizioneCorsoCriteria.class);
		nomedesc = new StringExpression("nomedesc", this.getDetachedCriteria());
		tipologiacorsoId = new StringExpression("tipologiacorso.nometip", this.getDetachedCriteria());
		tipologiacorso = new AssociationExpression("tipologiacorso", this.getDetachedCriteria());
		prenotazione = new BooleanExpression("prenotazione", this.getDetachedCriteria());
	}
	
	public TipologiaCorsoDetachedCriteria createTipologiacorsoCriteria() {
		return new TipologiaCorsoDetachedCriteria(createCriteria("tipologiacorso"));
	}
	
	public DescrizioneCorso uniqueDescrizioneCorso(PersistentSession session) {
		return (DescrizioneCorso) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public DescrizioneCorso[] listDescrizioneCorso(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (DescrizioneCorso[]) list.toArray(new DescrizioneCorso[list.size()]);
	}
}

