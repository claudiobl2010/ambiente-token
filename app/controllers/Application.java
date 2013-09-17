package controllers;

import java.util.*;

import play.*;
import play.mvc.*;
import play.data.*;

import views.html.*;

import models.*;

public class Application extends Controller {
  
    public static Result index() {
    	return redirect(routes.Application.ambientes());
    }
    
    public static Result ambientes() {
        return ok(views.html.ambientes.render(Ambiente.all()));        
    }    

    public static Result detalhe(String label) {
    	
    	Ambiente ambiente = Ambiente.one(label);

    	if (ambiente == null) {
        	return redirect(routes.Application.ambientes());
    	}
    	
    	List<Time> times = Time.all();
    			
    	List<Log> logs = Log.all(ambiente.id);
    	
        return 
        	ok(
        		views.html.detalhe.render(
        			ambiente,
        			times,
        			logs
        		)
        	);
    }
    
    public static Result log(String label, Long idTime) {
    	
    	Ambiente ambiente = Ambiente.one(label);

    	Time time = Time.one(idTime);
    	
    	String acao;

    	if (ambiente.time == null) {
    		ambiente.time = time;
    		acao = "Usando";
    	}
    	else {
    		if (ambiente.time.id == idTime) {
    			ambiente.time = null;
    			acao = "Liberou";
    		}
    		else {
        		ambiente.time = time;
        		acao = "Usando";
    		}
    	}

    	ambiente.save();
    	
    	Log log = new Log();
    	log.time = time;
    	log.ambiente = ambiente;
    	log.acao = acao;
    	log.save();

        return 
        	ok("ok");
    }    
    

}
