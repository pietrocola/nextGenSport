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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class TipologiaCorsoDAO {
	public static final String System = null;

	public static TipologiaCorso loadTipologiaCorsoByORMID(String nometip) throws PersistentException {
		try {
			PersistentSession session = peristentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadTipologiaCorsoByORMID(session, nometip);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static TipologiaCorso getTipologiaCorsoByORMID(String nometip) throws PersistentException {
		try {
			PersistentSession session = peristentmodel.NextGenSport2PersistentManager.instance().getSession();
			return getTipologiaCorsoByORMID(session, nometip);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static TipologiaCorso loadTipologiaCorsoByORMID(String nometip, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = peristentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadTipologiaCorsoByORMID(session, nometip, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static TipologiaCorso getTipologiaCorsoByORMID(String nometip, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = peristentmodel.NextGenSport2PersistentManager.instance().getSession();
			return getTipologiaCorsoByORMID(session, nometip, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static TipologiaCorso loadTipologiaCorsoByORMID(PersistentSession session, String nometip) throws PersistentException {
		try {
			return (TipologiaCorso) session.load(peristentmodel.TipologiaCorso.class, nometip);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static TipologiaCorso getTipologiaCorsoByORMID(PersistentSession session, String nometip) throws PersistentException {
		try {
			return (TipologiaCorso) session.get(peristentmodel.TipologiaCorso.class, nometip);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static TipologiaCorso loadTipologiaCorsoByORMID(PersistentSession session, String nometip, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (TipologiaCorso) session.load(peristentmodel.TipologiaCorso.class, nometip, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static TipologiaCorso getTipologiaCorsoByORMID(PersistentSession session, String nometip, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (TipologiaCorso) session.get(peristentmodel.TipologiaCorso.class, nometip, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static List queryTipologiaCorso(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = peristentmodel.NextGenSport2PersistentManager.instance().getSession();
			return queryTipologiaCorso(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static List queryTipologiaCorso(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = peristentmodel.NextGenSport2PersistentManager.instance().getSession();
			return queryTipologiaCorso(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static TipologiaCorso[] listTipologiaCorsoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = peristentmodel.NextGenSport2PersistentManager.instance().getSession();
			return listTipologiaCorsoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static TipologiaCorso[] listTipologiaCorsoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = peristentmodel.NextGenSport2PersistentManager.instance().getSession();
			return listTipologiaCorsoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static List queryTipologiaCorso(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From peristentmodel.TipologiaCorso as TipologiaCorso");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static List queryTipologiaCorso(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From peristentmodel.TipologiaCorso as TipologiaCorso");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("TipologiaCorso", lockMode);
			return query.list();
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static TipologiaCorso[] listTipologiaCorsoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTipologiaCorso(session, condition, orderBy);
			return (TipologiaCorso[]) list.toArray(new TipologiaCorso[list.size()]);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static TipologiaCorso[] listTipologiaCorsoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTipologiaCorso(session, condition, orderBy, lockMode);
			return (TipologiaCorso[]) list.toArray(new TipologiaCorso[list.size()]);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static TipologiaCorso loadTipologiaCorsoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = peristentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadTipologiaCorsoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static TipologiaCorso loadTipologiaCorsoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = peristentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadTipologiaCorsoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static TipologiaCorso loadTipologiaCorsoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		TipologiaCorso[] tipologiaCorsos = listTipologiaCorsoByQuery(session, condition, orderBy);
		if (tipologiaCorsos != null && tipologiaCorsos.length > 0)
			return tipologiaCorsos[0];
		else
			return null;
	}
	
	public static TipologiaCorso loadTipologiaCorsoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		TipologiaCorso[] tipologiaCorsos = listTipologiaCorsoByQuery(session, condition, orderBy, lockMode);
		if (tipologiaCorsos != null && tipologiaCorsos.length > 0)
			return tipologiaCorsos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTipologiaCorsoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = peristentmodel.NextGenSport2PersistentManager.instance().getSession();
			return iterateTipologiaCorsoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTipologiaCorsoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = peristentmodel.NextGenSport2PersistentManager.instance().getSession();
			return iterateTipologiaCorsoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTipologiaCorsoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From peristentmodel.TipologiaCorso as TipologiaCorso");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTipologiaCorsoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From peristentmodel.TipologiaCorso as TipologiaCorso");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("TipologiaCorso", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static TipologiaCorso createTipologiaCorso() {
		return new peristentmodel.TipologiaCorso();
	}
	
	public static boolean save(peristentmodel.TipologiaCorso tipologiaCorso) throws PersistentException {
		try {
			peristentmodel.NextGenSport2PersistentManager.instance().saveObject(tipologiaCorso);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(peristentmodel.TipologiaCorso tipologiaCorso) throws PersistentException {
		try {
			peristentmodel.NextGenSport2PersistentManager.instance().deleteObject(tipologiaCorso);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(peristentmodel.TipologiaCorso tipologiaCorso) throws PersistentException {
		try {
			peristentmodel.NextGenSport2PersistentManager.instance().getSession().refresh(tipologiaCorso);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(peristentmodel.TipologiaCorso tipologiaCorso) throws PersistentException {
		try {
			peristentmodel.NextGenSport2PersistentManager.instance().getSession().evict(tipologiaCorso);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static TipologiaCorso loadTipologiaCorsoByCriteria(TipologiaCorsoCriteria tipologiaCorsoCriteria) {
		TipologiaCorso[] tipologiaCorsos = listTipologiaCorsoByCriteria(tipologiaCorsoCriteria);
		if(tipologiaCorsos == null || tipologiaCorsos.length == 0) {
			return null;
		}
		return tipologiaCorsos[0];
	}
	
	public static TipologiaCorso[] listTipologiaCorsoByCriteria(TipologiaCorsoCriteria tipologiaCorsoCriteria) {
		return tipologiaCorsoCriteria.listTipologiaCorso();
	}
}
