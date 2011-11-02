package br.com.auctor.edocsmanager.repository;

import java.util.Collection;

/**
 * @author IcaroCamelo
 *
 */
public interface Repository <T extends Object> {
	T save(T obj);
	Boolean delete(T obj);
	T getById(Long id);
	Collection<T> getAll();
}
