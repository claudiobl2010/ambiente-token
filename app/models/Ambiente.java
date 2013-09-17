package models;

import java.util.*;

import play.db.ebean.*;
import play.data.validation.Constraints.*;

import javax.persistence.*;

@Entity
public class Ambiente extends Model {

	@Id
	public Long id;
	
	@ManyToOne
	public Time time;

	@OneToMany
	public Log logs;

	public String label;

	public static Finder<Long, Ambiente> find = new Finder(Long.class, Ambiente.class);

	public static List<Ambiente> all() {
		return find.all();
	}
	
	public static Ambiente one(String label) {
		return find.where()
					.eq("label", label.trim().toUpperCase())
					.findUnique();
	}
	
}
