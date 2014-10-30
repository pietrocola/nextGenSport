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

public class DescrizioneCorsoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression nome;
	public final StringExpression tipologiaCorsoId;
	public final AssociationExpression tipologiaCorso;
	public final BooleanExpression prenotazione;
	
	public DescrizioneCorsoDetachedCriteria() {
		super(model.DescrizioneCorso.class, model.DescrizioneCorsoCriteria.class);
		nome = new StringExpression("nome", this.getDetachedCriteria());
		tipologiaCorsoId = new StringExpression("tipologiaCorso.nome", this.getDetachedCriteria());
		tipologiaCorso = new AssociationExpression("tipologiaCorso", this.getDetachedCriteria());
		prenotazione = new BooleanExpression("prenotazione", this.getDetachedCriteria());
	}
	
	public DescrizioneCorsoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, model.DescrizioneCorsoCriteria.class);
		nome = new StringExpression("nome", this.getDetachedCriteria());
		tipologiaCorsoId = new StringExpression("tipologiaCorso.nome", this.getDetachedCriteria());
		tipologiaCorso = new AssociationExpression("tipologiaCorso", this.getDetachedCriteria());
		prenotazione = new BooleanExpression("prenotazione", this.getDetachedCriteria());
	}
	
	public TipologiaCorsoDetachedCriteria createTipologiaCorsoCriteria() {
		return new TipologiaCorsoDetachedCriteria(createCriteria("tipologiaCorso"));
	}
	
	public DescrizioneCorso uniqueDescrizioneCorso(PersistentSession session) {
		return (DescrizioneCorso) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public DescrizioneCorso[] listDescrizioneCorso(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (DescrizioneCorso[]) list.toArray(new DescrizioneCorso[list.size()]);
	}
}

