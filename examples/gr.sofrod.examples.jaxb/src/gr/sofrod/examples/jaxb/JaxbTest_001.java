package gr.sofrod.examples.jaxb;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.junit.BeforeClass;
import org.junit.Test;

import gr.sofrod.examples.jaxb.beans.Family;
import gr.sofrod.examples.jaxb.beans.Person;

public class JaxbTest_001 {
	Logger logger = Logger.getLogger(JaxbTest_001.class);
	
	@BeforeClass
	public static void init() {
		ConsoleAppender ca = new ConsoleAppender(new PatternLayout("%5p: %m%n"));
		Logger.getRootLogger().addAppender(ca);
	}

	@SuppressWarnings("serial")
	@Test
	public void testCreateFamily() throws JAXBException {
		
		final Person p1  = new Person();
		p1.setName("Lalakis");
		p1.setAge(25);
		final Person p2  = new Person();
		p2.setName("Lilika");
		p2.setAge(22);
		
		ArrayList<Person> children = new ArrayList<Person>(){{
			add(p1);
			add(p2);
		}}; 
		
		Family f = new Family();
		f.setSurname("Loulaki");
		f.setChildren(children);
		
	    JAXBContext context = JAXBContext.newInstance(Person.class);
	    Marshaller m = context.createMarshaller();
	    m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

	    // Write to System.out
	    m.marshal(f, System.out);

	    // Write to File
	    m.marshal(f, new File("files/family.xml"));
	}

	@Test
	public void testCreatePerson() throws JAXBException {
		Person p  = new Person();
		p.setName("Lalakis");
		p.setAge(25);
		
		JAXBContext context = JAXBContext.newInstance(Person.class);
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		
		// Write to System.out
		m.marshal(p, System.out);
		
		// Write to File
		m.marshal(p, new File("files/person.xml"));
	}
	
	@Test
	public void testReadPerson() throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Person.class);
		Unmarshaller um = context.createUnmarshaller();
		
		Person p = (Person) um.unmarshal(new File("files/person.xml"));
		logger.info("name=" + p.getName());
		logger.info(" age=" + p.getAge());
	}
	
	@Test
	public void testReadFamily() throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Person.class);
		Unmarshaller um = context.createUnmarshaller();
		
		Family f = (Family) um.unmarshal(new File("files/family.xml"));
		logger.info("surname=" + f.getSurname());
		
		for (Person p : f.getChildren() ) {
			logger.info("Child");
			logger.info("name=" + p.getName());
			logger.info(" age=" + p.getAge());
		}
	}
	
}
