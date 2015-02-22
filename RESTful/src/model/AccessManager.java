package model;

import java.sql.SQLException;
import java.sql.Connection;
import java.util.ArrayList;
import DAO.Access;
import DAO.Database;
import DTO.USpopulation;

public class AccessManager {
         String value;
         String method;
	public ArrayList<USpopulation> getPopulation() throws Exception{
	ArrayList<USpopulation> USpop = new ArrayList<USpopulation>();
	Database db = new Database();
	Connection con = db.getConnection();
	Access access = new Access();
	access.setValue(value);
	access.setMethod(method);
	USpop = access.getUSpopulation(con);
	return USpop;
}
	
	public AccessManager(String method, String value )
	{
		this.value=value;
		this.method =method;

	}
	
	
}