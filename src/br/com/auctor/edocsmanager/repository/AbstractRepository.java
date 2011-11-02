package br.com.auctor.edocsmanager.repository;



import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.auctor.edocsmanager.utils.JpaUtils;

/**
 * @author IcaroCamelo
 *
 */
public abstract class AbstractRepository<T extends Object> implements
		Repository<T> {

	final java.util.logging.Logger log = Logger.getAnonymousLogger();

	private Class<?> type;
	private EntityManager em = null;
	private EntityTransaction tx = null;

	
	public T insert(T obj) {

		Session session = null;
		Transaction tx = null;

		try {
			em = JpaUtils.getEmf();

			session = (Session) em.getDelegate();
			tx = session.beginTransaction();
			session.save(obj);
			tx.commit();
		} catch (RuntimeException re) {
			log.log(Level.SEVERE, re.getMessage());

			if (tx != null && tx.isActive()) {
				try {
					tx.rollback();
				} catch (RuntimeException rex) {
					log.log(Level.SEVERE, rex.getStackTrace().toString());
				}
			}
			throw re;
		} catch (Throwable e) {
			log.log(Level.SEVERE, e.getMessage());
			e.printStackTrace();
			throw new RuntimeException();
		}
		return obj;

	}
	
	public T update(T obj) {
		Session session = null;
		Transaction tx = null;

		try {
			em = JpaUtils.getEmf();

			session = (Session) em.getDelegate();
			tx = session.beginTransaction();
			session.update(obj);
			tx.commit();
		} catch (RuntimeException re) {
			log.log(Level.SEVERE, re.getMessage());

			if (tx != null && tx.isActive()) {
				try {
					tx.rollback();
				} catch (RuntimeException rex) {
					log.log(Level.SEVERE, rex.getStackTrace().toString());
				}
			}
			throw re;
		} catch (Throwable e) {
			log.log(Level.SEVERE, e.getMessage());
			e.printStackTrace();
			throw new RuntimeException();
		}
		return obj;

	}

	@Override
	public Boolean delete(T obj) {
		Session session = null;
		Transaction tx = null;

		try {
			em = JpaUtils.getEmf();

			session = (Session) em.getDelegate();
			tx = session.beginTransaction();
			session.delete(obj);
			tx.commit();
			return true;
		} catch (RuntimeException re) {
			log.log(Level.SEVERE, re.getMessage());

			if (tx != null && tx.isActive()) {
				try {
					tx.rollback();
				} catch (RuntimeException rex) {
					log.log(Level.SEVERE, rex.getStackTrace().toString());
				}
			}
			throw re;
		} catch (Throwable e) {
			log.log(Level.SEVERE, e.getMessage());
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<T> getAll() {
		try {
			em = JpaUtils.getEmf();

			Session session = (Session) em.getDelegate();
			Criteria crit = session.createCriteria(type);

			return crit.list();
		} catch (RuntimeException re) {
			if (tx != null && tx.isActive()) {
				try {
					tx.rollback();
				} catch (RuntimeException rex) {
					log.log(Level.SEVERE, rex.getStackTrace().toString());
				}
			}
			throw re;
		} catch (Throwable e) {
			log.log(Level.SEVERE, e.getMessage());
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public T getById(Long id) {
		try {
			em = JpaUtils.getEmf();
			Session session = (Session) em.getDelegate();

			return (T) session.load(type, id);

		} catch (RuntimeException re) {
			log.log(Level.SEVERE, re.getMessage());
			if (tx != null && tx.isActive()) {
				try {
					tx.rollback();
				} catch (RuntimeException rex) {
					log.log(Level.SEVERE, rex.getStackTrace().toString());
				}
			}
			throw re;
		} catch (Throwable e) {
			log.log(Level.SEVERE, e.getMessage());
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

}
