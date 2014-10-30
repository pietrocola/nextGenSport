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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class DescrizioneCorsoDAO {
	public static DescrizioneCorso loadDescrizioneCorsoByORMID(String nome) throws PersistentException {
		try {
			PersistentSession session = model.NextGenSport2PersistentManager.instance().getSession();
			return loadDescrizioneCorsoByORMID(session, nome);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static DescrizioneCorso getDescrizioneCorsoByORMID(String nome) throws PersistentException {
		try {
			PersistentSession session = model.NextGenSport2PersistentManager.instance().getSession();
			return getDescrizioneCorsoByORMID(session, nome);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static DescrizioneCorso loadDescrizioneCorsoByORMID(String nome, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.NextGenSport2PersistentManager.instance().getSession();
			return loadDescrizioneCorsoByORMID(session, nome, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static DescrizioneCorso getDescrizioneCorsoByORMID(String nome, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.NextGenSport2PersistentManager.instance().getSession();
			return getDescrizioneCorsoByORMID(session, nome, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static DescrizioneCorso loadDescrizioneCorsoByORMID(PersistentSession session, String nome) throws PersistentException {
		try {
			return (DescrizioneCorso) session.load(model.DescrizioneCorso.class, nome);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static DescrizioneCorso getDescrizioneCorsoByORMID(PersistentSession session, String nome) throws PersistentException {
		try {
			return (DescrizioneCorso) session.get(model.DescrizioneCorso.class, nome);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static DescrizioneCorso loadDescrizioneCorsoByORMID(PersistentSession session, String nome, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (DescrizioneCorso) session.load(model.DescrizioneCorso.class, nome, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static DescrizioneCorso getDescrizioneCorsoByORMID(PersistentSession session, String nome, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (DescrizioneCorso) session.get(model.DescrizioneCorso.class, nome, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static List queryDescrizioneCorso(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.NextGenSport2PersistentManager.instance().getSession();
			return queryDescrizioneCorso(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static List queryDescrizioneCorso(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.NextGenSport2PersistentManager.instance().getSession();
			return queryDescrizioneCorso(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static DescrizioneCorso[] listDescrizioneCorsoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.NextGenSport2PersistentManager.instance().getSession();
			return listDescrizioneCorsoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static DescrizioneCorso[] listDescrizioneCorsoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.NextGenSport2PersistentManager.instance().getSession();
			return listDescrizioneCorsoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static List queryDescrizioneCorso(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.DescrizioneCorso as DescrizioneCorso");
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
	
	public static List queryDescrizioneCorso(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.DescrizioneCorso as DescrizioneCorso");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("DescrizioneCorso", lockMode);
			return query.list();
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static DescrizioneCorso[] listDescrizioneCorsoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryDescrizioneCorso(session, condition, orderBy);
			return (DescrizioneCorso[]) list.toArray(new DescrizioneCorso[list.size()]);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static DescrizioneCorso[] listDescrizioneCorsoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryDescrizioneCorso(session, condition, orderBy, lockMode);
			return (DescrizioneCorso[]) list.toArray(new DescrizioneCorso[list.size()]);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static DescrizioneCorso loadDescrizioneCorsoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.NextGenSport2PersistentManager.instance().getSession();
			return loadDescrizioneCorsoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static DescrizioneCorso loadDescrizioneCorsoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.NextGenSport2PersistentManager.instance().getSession();
			return loadDescrizioneCorsoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static DescrizioneCorso loadDescrizioneCorsoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		DescrizioneCorso[] descrizioneCorsos = listDescrizioneCorsoByQuery(session, condition, orderBy);
		if (descrizioneCorsos != null && descrizioneCorsos.length > 0)
			return descrizioneCorsos[0];
		else
			return null;
	}
	
	public static DescrizioneCorso loadDescrizioneCorsoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		DescrizioneCorso[] descrizioneCorsos = listDescrizioneCorsoByQuery(session, condition, orderBy, lockMode);
		if (descrizioneCorsos != null && descrizioneCorsos.length > 0)
			return descrizioneCorsos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateDescrizioneCorsoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = model.NextGenSport2PersistentManager.instance().getSession();
			return iterateDescrizioneCorsoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDescrizioneCorsoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = model.NextGenSport2PersistentManager.instance().getSession();
			return iterateDescrizioneCorsoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDescrizioneCorsoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.DescrizioneCorso as DescrizioneCorso");
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
	
	public static java.util.Iterator iterateDescrizioneCorsoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.DescrizioneCorso as DescrizioneCorso");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("DescrizioneCorso", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static DescrizioneCorso createDescrizioneCorso() {
		return new model.DescrizioneCorso();
	}
	
	public static boolean save(model.DescrizioneCorso descrizioneCorso) throws PersistentException {
		try {
			model.NextGenSport2PersistentManager.instance().saveObject(descrizioneCorso);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(model.DescrizioneCorso descrizioneCorso) throws PersistentException {
		try {
			model.NextGenSport2PersistentManager.instance().deleteObject(descrizioneCorso);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(model.DescrizioneCorso descrizioneCorso) throws PersistentException {
		try {
			model.NextGenSport2PersistentManager.instance().getSession().refresh(descrizioneCorso);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(model.DescrizioneCorso descrizioneCorso) throws PersistentException {
		try {
			model.NextGenSport2PersistentManager.instance().getSession().evict(descrizioneCorso);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static DescrizioneCorso loadDescrizioneCorsoByCriteria(DescrizioneCorsoCriteria descrizioneCorsoCriteria) {
		DescrizioneCorso[] descrizioneCorsos = listDescrizioneCorsoByCriteria(descrizioneCorsoCriteria);
		if(descrizioneCorsos == null || descrizioneCorsos.length == 0) {
			return null;
		}
		return descrizioneCorsos[0];
	}
	
	public static DescrizioneCorso[] listDescrizioneCorsoByCriteria(DescrizioneCorsoCriteria descrizioneCorsoCriteria) {
		return descrizioneCorsoCriteria.listDescrizioneCorso();
	}
}
