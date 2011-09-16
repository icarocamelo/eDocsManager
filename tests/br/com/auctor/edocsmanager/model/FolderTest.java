package br.com.auctor.edocsmanager.model;

import junit.framework.Assert;

import org.junit.Test;

/**
 * @author IcaroCamelo
 *
 */
public class FolderTest {

	@Test
	public void testConstructor(){
		Folder folder = new Folder();		
		Assert.assertNotNull(folder);
	}
	
	@Test
	public void testConstructor1(){
		Folder folder = new Folder("Home", Visibility.PUBLIC, true);
		
		Assert.assertEquals("Home", folder.getName());
		Assert.assertEquals(Visibility.PUBLIC, folder.getVisibility());
		Assert.assertTrue(folder.getVisibilityInCascade());
	}
	
	@Test
	public void testCollectionsInicialization(){
		Folder folder = new Folder("Home", Visibility.PUBLIC, true);
		Assert.assertTrue(folder.getFolders().size() == 0);
		Assert.assertTrue(folder.getDocuments().size() == 0);
	}
	
	@Test
	public void testAddFoldersWithConstructor1(){
		Folder folder = new Folder();
		folder.setName("Home");
		folder.setVisibility(Visibility.PUBLIC);
		folder.setVisibilityInCascade(true);
		
		Folder folder1 = new Folder();
		folder1.setName("Docs");
		folder1.setVisibility(Visibility.PUBLIC);
		folder1.setVisibilityInCascade(true);		
		
		folder.add(folder1);
		
		Assert.assertEquals("Docs", folder.getFolders().iterator().next().getName());
	}
	
	@Test
	public void testAddFoldersWithConstructor2(){
		Folder folder = new Folder("Home", Visibility.PUBLIC, true);
		Folder folder1 = new Folder("Docs", Visibility.PUBLIC, true);
		
		folder.add(folder1);
		
		Assert.assertEquals("Docs", folder.getFolders().iterator().next().getName());
	}
	
	@Test
	public void testAddDocumentsIntoTheFolder(){
		
		Folder folder = new Folder("Home", Visibility.PUBLIC, true);
		Document doc = new Paper();
		
		folder.addDocuments(doc);
		
		Assert.assertEquals(folder.getDocuments().iterator().next().getName(), doc.getName());
	}
}
