package controllers;

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
        return 
        	ok(
        		views.html.detalhe.render(
        			Ambiente.one(label),
        			Time.all(),
        			Log.all()
        		)
        	);
    }    

}
