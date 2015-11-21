package gr.sofrod.examples.jaxb;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.junit.Test;

import gr.sofrod.examples.jaxb.beans.Family;
import gr.sofrod.examples.jaxb.beans.Person;

public class JaxbTest_001 {

	@SuppressWarnings("serial")
	@Test
	public void testFamily() throws JAXBException {
		
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
	public void testPerson() throws JAXBException {
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
	
}
