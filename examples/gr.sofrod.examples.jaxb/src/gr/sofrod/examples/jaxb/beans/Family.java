package gr.sofrod.examples.jaxb.beans;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Family {
	
	private ArrayList<Person> children;

	private String surname;
	
	@XmlElement(name = "epitheto")
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@XmlElementWrapper(name = "all_children")
	@XmlElement(name = "child")
	public ArrayList<Person> getChildren() {
		return children;
	}

	public void setChildren(ArrayList<Person> children) {
		this.children = children;
	}
}
