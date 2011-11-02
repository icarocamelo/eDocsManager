package br.com.auctor.edocsmanager.repository;

import java.util.Collection;

/**
 * @author IcaroCamelo
 *
 */
public interface Repository <T extends Object> {
	T insert(T obj);
	T update(T obj);
	Boolean delete(T obj);
	T getById(Long id);
	Collection<T> getAll();
}
