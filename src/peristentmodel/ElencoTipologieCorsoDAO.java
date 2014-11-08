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

public class ElencoTipologieCorsoDAO {
	public static ElencoTipologieCorso loadElencoTipologieCorsoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = peristentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadElencoTipologieCorsoByORMID(session, ID);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static ElencoTipologieCorso getElencoTipologieCorsoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = peristentmodel.NextGenSport2PersistentManager.instance().getSession();
			return getElencoTipologieCorsoByORMID(session, ID);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static ElencoTipologieCorso loadElencoTipologieCorsoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = peristentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadElencoTipologieCorsoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static ElencoTipologieCorso getElencoTipologieCorsoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = peristentmodel.NextGenSport2PersistentManager.instance().getSession();
			return getElencoTipologieCorsoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static ElencoTipologieCorso loadElencoTipologieCorsoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (ElencoTipologieCorso) session.load(peristentmodel.ElencoTipologieCorso.class, new Integer(ID));
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static ElencoTipologieCorso getElencoTipologieCorsoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (ElencoTipologieCorso) session.get(peristentmodel.ElencoTipologieCorso.class, new Integer(ID));
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static ElencoTipologieCorso loadElencoTipologieCorsoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ElencoTipologieCorso) session.load(peristentmodel.ElencoTipologieCorso.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static ElencoTipologieCorso getElencoTipologieCorsoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ElencoTipologieCorso) session.get(peristentmodel.ElencoTipologieCorso.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static List queryElencoTipologieCorso(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = peristentmodel.NextGenSport2PersistentManager.instance().getSession();
			return queryElencoTipologieCorso(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static List queryElencoTipologieCorso(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = peristentmodel.NextGenSport2PersistentManager.instance().getSession();
			return queryElencoTipologieCorso(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static ElencoTipologieCorso[] listElencoTipologieCorsoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = peristentmodel.NextGenSport2PersistentManager.instance().getSession();
			return listElencoTipologieCorsoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static ElencoTipologieCorso[] listElencoTipologieCorsoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = peristentmodel.NextGenSport2PersistentManager.instance().getSession();
			return listElencoTipologieCorsoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static List queryElencoTipologieCorso(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From peristentmodel.ElencoTipologieCorso as ElencoTipologieCorso");
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
	
	public static List queryElencoTipologieCorso(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From peristentmodel.ElencoTipologieCorso as ElencoTipologieCorso");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("ElencoTipologieCorso", lockMode);
			return query.list();
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static ElencoTipologieCorso[] listElencoTipologieCorsoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryElencoTipologieCorso(session, condition, orderBy);
			return (ElencoTipologieCorso[]) list.toArray(new ElencoTipologieCorso[list.size()]);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static ElencoTipologieCorso[] listElencoTipologieCorsoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryElencoTipologieCorso(session, condition, orderBy, lockMode);
			return (ElencoTipologieCorso[]) list.toArray(new ElencoTipologieCorso[list.size()]);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static ElencoTipologieCorso loadElencoTipologieCorsoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = peristentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadElencoTipologieCorsoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static ElencoTipologieCorso loadElencoTipologieCorsoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = peristentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadElencoTipologieCorsoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static ElencoTipologieCorso loadElencoTipologieCorsoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		ElencoTipologieCorso[] elencoTipologieCorsos = listElencoTipologieCorsoByQuery(session, condition, orderBy);
		if (elencoTipologieCorsos != null && elencoTipologieCorsos.length > 0)
			return elencoTipologieCorsos[0];
		else
			return null;
	}
	
	public static ElencoTipologieCorso loadElencoTipologieCorsoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		ElencoTipologieCorso[] elencoTipologieCorsos = listElencoTipologieCorsoByQuery(session, condition, orderBy, lockMode);
		if (elencoTipologieCorsos != null && elencoTipologieCorsos.length > 0)
			return elencoTipologieCorsos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateElencoTipologieCorsoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = peristentmodel.NextGenSport2PersistentManager.instance().getSession();
			return iterateElencoTipologieCorsoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateElencoTipologieCorsoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = peristentmodel.NextGenSport2PersistentManager.instance().getSession();
			return iterateElencoTipologieCorsoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateElencoTipologieCorsoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From peristentmodel.ElencoTipologieCorso as ElencoTipologieCorso");
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
	
	public static java.util.Iterator iterateElencoTipologieCorsoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From peristentmodel.ElencoTipologieCorso as ElencoTipologieCorso");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("ElencoTipologieCorso", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static ElencoTipologieCorso createElencoTipologieCorso() {
		return new peristentmodel.ElencoTipologieCorso();
	}
	
	public static boolean save(peristentmodel.ElencoTipologieCorso elencoTipologieCorso) throws PersistentException {
		try {
			peristentmodel.NextGenSport2PersistentManager.instance().saveObject(elencoTipologieCorso);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(peristentmodel.ElencoTipologieCorso elencoTipologieCorso) throws PersistentException {
		try {
			peristentmodel.NextGenSport2PersistentManager.instance().deleteObject(elencoTipologieCorso);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(peristentmodel.ElencoTipologieCorso elencoTipologieCorso) throws PersistentException {
		try {
			peristentmodel.NextGenSport2PersistentManager.instance().getSession().refresh(elencoTipologieCorso);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(peristentmodel.ElencoTipologieCorso elencoTipologieCorso) throws PersistentException {
		try {
			peristentmodel.NextGenSport2PersistentManager.instance().getSession().evict(elencoTipologieCorso);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static ElencoTipologieCorso loadElencoTipologieCorsoByCriteria(ElencoTipologieCorsoCriteria elencoTipologieCorsoCriteria) {
		ElencoTipologieCorso[] elencoTipologieCorsos = listElencoTipologieCorsoByCriteria(elencoTipologieCorsoCriteria);
		if(elencoTipologieCorsos == null || elencoTipologieCorsos.length == 0) {
			return null;
		}
		return elencoTipologieCorsos[0];
	}
	
	public static ElencoTipologieCorso[] listElencoTipologieCorsoByCriteria(ElencoTipologieCorsoCriteria elencoTipologieCorsoCriteria) {
		return elencoTipologieCorsoCriteria.listElencoTipologieCorso();
	}
}
