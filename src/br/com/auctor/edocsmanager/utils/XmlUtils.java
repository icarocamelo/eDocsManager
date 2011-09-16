package br.com.auctor.edocsmanager.utils;


import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class XmlUtils {

	public static String objectToXml(Object obj) throws JAXBException{
		
		JAXBContext context = JAXBContext.newInstance(obj.getClass());
		Marshaller marshaller = context.createMarshaller();
		StringWriter sw = new StringWriter();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		marshaller.marshal(obj, sw);
		
		return sw.toString();
	}
	
	@SuppressWarnings("unchecked")
	public static <T> Object xmlToObject(String xmlContent, Class<T> clazz) throws JAXBException {		
		
		ByteArrayInputStream xmlContentBytes = new ByteArrayInputStream (xmlContent.getBytes());
		JAXBContext context = JAXBContext.newInstance(clazz);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		unmarshaller.setSchema(null); //note: setting schema to null will turn validator off
		Object unmarshalledObj = unmarshaller.unmarshal(xmlContentBytes);
		Object xmlObject = clazz.cast(unmarshalledObj);
		
		return (T)xmlObject;
	}
	
	@SuppressWarnings("unchecked")
	public static <T> Object xmlToObject(InputStream xmlContent, Class<T> clazz) throws JAXBException {		
		
		JAXBContext context = JAXBContext.newInstance(clazz);
		Unmarshaller unmarshaller = context.createUnmarshaller();		
		unmarshaller.setSchema(null); //note: setting schema to null will turn validator off
		Object unMarshalled = unmarshaller.unmarshal(xmlContent);
		Object xmlObject = clazz.cast(unMarshalled);
		
		return (T)xmlObject;
	}
	
}
