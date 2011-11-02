package br.com.auctor.repositoryImpl;

import java.util.Collection;

import br.com.auctor.edocsmanager.model.Folder;
import br.com.auctor.edocsmanager.repository.AbstractRepository;
import br.com.auctor.edocsmanager.repository.FolderRepository;

public class FolderRepositoryImpl extends AbstractRepository<Folder> implements FolderRepository {


	@Override
	public Folder insert(Folder obj) {
		return super.insert(obj);
	}

	@Override
	public Folder update(Folder obj) {
		return super.update(obj);
	}
	
	@Override
	public Boolean delete(Folder obj) {
		return super.delete(obj);
	}

	@Override
	public Folder getById(Long id) {
		return super.getById(id);
	}

	@Override
	public Collection<Folder> getAll() {
		return super.getAll();
	}

}
