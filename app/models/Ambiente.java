package models;

import java.util.*;

import play.db.ebean.*;
import play.data.validation.Constraints.*;

import javax.persistence.*;

@Entity
public class Ambiente extends Model {

	@Id
	public Long id;

	@Required
	public String label;

	public static Finder<Long, Ambiente> find = new Finder(Long.class, Ambiente.class);

	public static List<Ambiente> all() {
		return find.all();
	}
}
