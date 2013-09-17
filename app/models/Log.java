package models;

import java.util.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.Constraints.*;

import javax.persistence.*;

@Entity
public class Log extends Model {

	@Id
	public Long id;
	
	@ManyToOne
	public Time time;

	@ManyToOne
	public Ambiente ambiente;

	public Date logDate = new Date();	

	public String acao;

	public static Finder<Long, Log> find = new Finder(Long.class, Log.class);

	public static List<Log> all(Long idAmbiente) {
		return find.where()
					.eq("ambiente_id", idAmbiente)
					.orderBy("log_date desc")
					.setMaxRows(20) 
					.findList();
	}
}
