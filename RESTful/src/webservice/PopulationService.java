package webservice;

import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import com.google.gson.Gson;
import model.AccessManager;
import DTO.USpopulation;

@Path("/USpopulation")
public class PopulationService {
@GET
@Path("/pop/{method}/{value}")

public String JsonPop(@PathParam("method")String method, @PathParam("value")String value){
	String JsonPop = null;
	String M = method;
	String V = value;
	ArrayList<USpopulation> USpopulation = new ArrayList<USpopulation>();
	try{
		USpopulation = new AccessManager(M,V).getPopulation();
		Gson gson = new Gson();
		JsonPop = gson.toJson(USpopulation);
		
	} catch(Exception e){
		e.printStackTrace();
	}
	return JsonPop;
	
}
}

	
	

