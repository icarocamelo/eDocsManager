package br.com.auctor.repository;

import junit.framework.Assert;

import org.apache.log4j.BasicConfigurator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.auctor.edocsmanager.model.Folder;
import br.com.auctor.edocsmanager.model.Visibility;
import br.com.auctor.edocsmanager.repository.FolderRepository;
import br.com.auctor.repositoryImpl.FolderRepositoryImpl;

public class AbstractRepositoryTest {

	@Before
	public void setUp() {
		BasicConfigurator.configure();
	}	

	@Test
	public void Test_Insert_Folder() {
		FolderRepository repository = new FolderRepositoryImpl();
		Folder folderFromDb = null;
		
		Folder actual = new Folder();
		actual.setName("Home");
		actual.setVisibility(Visibility.PUBLIC);
		actual.setVisibilityInCascade(true);
		
		folderFromDb = repository.insert(actual);

		Assert.assertEquals("Home", folderFromDb.getName());
		Assert.assertEquals(Visibility.PUBLIC, folderFromDb.getVisibility());
		Assert.assertTrue(folderFromDb.getVisibilityInCascade());
	}

	
	@After
	public void tearDown() {
		// TODO: Implementar limpeza do banco
	}
}
