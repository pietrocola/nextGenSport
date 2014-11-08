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

public class ElencoDescrizioniCorsoDAO {
	public static ElencoDescrizioniCorso loadElencoDescrizioniCorsoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = peristentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadElencoDescrizioniCorsoByORMID(session, ID);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static ElencoDescrizioniCorso getElencoDescrizioniCorsoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = peristentmodel.NextGenSport2PersistentManager.instance().getSession();
			return getElencoDescrizioniCorsoByORMID(session, ID);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static ElencoDescrizioniCorso loadElencoDescrizioniCorsoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = peristentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadElencoDescrizioniCorsoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static ElencoDescrizioniCorso getElencoDescrizioniCorsoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = peristentmodel.NextGenSport2PersistentManager.instance().getSession();
			return getElencoDescrizioniCorsoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static ElencoDescrizioniCorso loadElencoDescrizioniCorsoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (ElencoDescrizioniCorso) session.load(peristentmodel.ElencoDescrizioniCorso.class, new Integer(ID));
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static ElencoDescrizioniCorso getElencoDescrizioniCorsoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (ElencoDescrizioniCorso) session.get(peristentmodel.ElencoDescrizioniCorso.class, new Integer(ID));
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static ElencoDescrizioniCorso loadElencoDescrizioniCorsoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ElencoDescrizioniCorso) session.load(peristentmodel.ElencoDescrizioniCorso.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static ElencoDescrizioniCorso getElencoDescrizioniCorsoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ElencoDescrizioniCorso) session.get(peristentmodel.ElencoDescrizioniCorso.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static List queryElencoDescrizioniCorso(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = peristentmodel.NextGenSport2PersistentManager.instance().getSession();
			return queryElencoDescrizioniCorso(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static List queryElencoDescrizioniCorso(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = peristentmodel.NextGenSport2PersistentManager.instance().getSession();
			return queryElencoDescrizioniCorso(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static ElencoDescrizioniCorso[] listElencoDescrizioniCorsoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = peristentmodel.NextGenSport2PersistentManager.instance().getSession();
			return listElencoDescrizioniCorsoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static ElencoDescrizioniCorso[] listElencoDescrizioniCorsoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = peristentmodel.NextGenSport2PersistentManager.instance().getSession();
			return listElencoDescrizioniCorsoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static List queryElencoDescrizioniCorso(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From peristentmodel.ElencoDescrizioniCorso as ElencoDescrizioniCorso");
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
	
	public static List queryElencoDescrizioniCorso(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From peristentmodel.ElencoDescrizioniCorso as ElencoDescrizioniCorso");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("ElencoDescrizioniCorso", lockMode);
			return query.list();
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static ElencoDescrizioniCorso[] listElencoDescrizioniCorsoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryElencoDescrizioniCorso(session, condition, orderBy);
			return (ElencoDescrizioniCorso[]) list.toArray(new ElencoDescrizioniCorso[list.size()]);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static ElencoDescrizioniCorso[] listElencoDescrizioniCorsoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryElencoDescrizioniCorso(session, condition, orderBy, lockMode);
			return (ElencoDescrizioniCorso[]) list.toArray(new ElencoDescrizioniCorso[list.size()]);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static ElencoDescrizioniCorso loadElencoDescrizioniCorsoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = peristentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadElencoDescrizioniCorsoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static ElencoDescrizioniCorso loadElencoDescrizioniCorsoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = peristentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadElencoDescrizioniCorsoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static ElencoDescrizioniCorso loadElencoDescrizioniCorsoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		ElencoDescrizioniCorso[] elencoDescrizioniCorsos = listElencoDescrizioniCorsoByQuery(session, condition, orderBy);
		if (elencoDescrizioniCorsos != null && elencoDescrizioniCorsos.length > 0)
			return elencoDescrizioniCorsos[0];
		else
			return null;
	}
	
	public static ElencoDescrizioniCorso loadElencoDescrizioniCorsoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		ElencoDescrizioniCorso[] elencoDescrizioniCorsos = listElencoDescrizioniCorsoByQuery(session, condition, orderBy, lockMode);
		if (elencoDescrizioniCorsos != null && elencoDescrizioniCorsos.length > 0)
			return elencoDescrizioniCorsos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateElencoDescrizioniCorsoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = peristentmodel.NextGenSport2PersistentManager.instance().getSession();
			return iterateElencoDescrizioniCorsoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateElencoDescrizioniCorsoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = peristentmodel.NextGenSport2PersistentManager.instance().getSession();
			return iterateElencoDescrizioniCorsoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateElencoDescrizioniCorsoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From peristentmodel.ElencoDescrizioniCorso as ElencoDescrizioniCorso");
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
	
	public static java.util.Iterator iterateElencoDescrizioniCorsoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From peristentmodel.ElencoDescrizioniCorso as ElencoDescrizioniCorso");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("ElencoDescrizioniCorso", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static ElencoDescrizioniCorso createElencoDescrizioniCorso() {
		return new peristentmodel.ElencoDescrizioniCorso();
	}
	
	public static boolean save(peristentmodel.ElencoDescrizioniCorso elencoDescrizioniCorso) throws PersistentException {
		try {
			peristentmodel.NextGenSport2PersistentManager.instance().saveObject(elencoDescrizioniCorso);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(peristentmodel.ElencoDescrizioniCorso elencoDescrizioniCorso) throws PersistentException {
		try {
			peristentmodel.NextGenSport2PersistentManager.instance().deleteObject(elencoDescrizioniCorso);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(peristentmodel.ElencoDescrizioniCorso elencoDescrizioniCorso) throws PersistentException {
		try {
			peristentmodel.NextGenSport2PersistentManager.instance().getSession().refresh(elencoDescrizioniCorso);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(peristentmodel.ElencoDescrizioniCorso elencoDescrizioniCorso) throws PersistentException {
		try {
			peristentmodel.NextGenSport2PersistentManager.instance().getSession().evict(elencoDescrizioniCorso);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static ElencoDescrizioniCorso loadElencoDescrizioniCorsoByCriteria(ElencoDescrizioniCorsoCriteria elencoDescrizioniCorsoCriteria) {
		ElencoDescrizioniCorso[] elencoDescrizioniCorsos = listElencoDescrizioniCorsoByCriteria(elencoDescrizioniCorsoCriteria);
		if(elencoDescrizioniCorsos == null || elencoDescrizioniCorsos.length == 0) {
			return null;
		}
		return elencoDescrizioniCorsos[0];
	}
	
	public static ElencoDescrizioniCorso[] listElencoDescrizioniCorsoByCriteria(ElencoDescrizioniCorsoCriteria elencoDescrizioniCorsoCriteria) {
		return elencoDescrizioniCorsoCriteria.listElencoDescrizioniCorso();
	}
}
