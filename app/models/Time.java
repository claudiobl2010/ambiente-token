package models;

import java.util.*;

import play.db.ebean.*;
import play.data.validation.Constraints.*;

import javax.persistence.*;

@Entity
public class Time extends Model {

	@Id
	public Long id;
	
	@OneToMany
	public Ambiente ambientes;

	@OneToMany
	public Log logs;

	public String nome;

	public static Finder<Long, Time> find = new Finder(Long.class, Time.class);

	public static List<Time> all() {
		return find.all();
	}
}
