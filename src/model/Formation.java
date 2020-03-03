package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Formation {
	
	@Id
	@GeneratedValue
	int id;
	String theme;
	
	
	public Formation() {
		super();
	}


	public Formation(int id, String theme) {
		super();
		this.id = id;
		this.theme = theme;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTheme() {
		return theme;
	}


	public void setTheme(String theme) {
		this.theme = theme;
	}


	@Override
	public String toString() {
		return "Formation [id=" + id + ", theme=" + theme + "]";
	}
	
	

}
