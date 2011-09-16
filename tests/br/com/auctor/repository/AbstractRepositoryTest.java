package br.com.auctor.repository;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import junit.framework.Assert;

import org.apache.log4j.BasicConfigurator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.auctor.edocsmanager.model.Folder;
import br.com.auctor.edocsmanager.model.Visibility;
import br.com.auctor.edocsmanager.repository.FolderRepository;
import br.com.auctor.edocsmanager.repository.Repository;

public class AbstractRepositoryTest {

	@Before
	public void setUp() {
		BasicConfigurator.configure();
	}	

	@Test
	public void Test_Insert_Folder() {
		Repository<Folder> repository = mock(FolderRepository.class);

		Folder actual = new Folder();
		actual.setName("Home");
		actual.setVisibility(Visibility.PUBLIC);
		actual.setVisibilityInCascade(true);
		
		when(repository.insert(actual)).thenReturn(actual);

		Assert.assertEquals("Home", actual.getName());
		Assert.assertEquals(Visibility.PUBLIC, actual.getVisibility());
		Assert.assertTrue(actual.getVisibilityInCascade());
	}

	
	@After
	public void tearDown() {
		// TODO: Implementar limpeza do banco
	}
}
