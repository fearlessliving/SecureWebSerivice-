package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import DTO.USpopulation;

public class Access {
	String value;
	String method;
	String str;
	String s=new String("selectCity");
	String s1=new String("selectState");
	public ArrayList<USpopulation> getUSpopulation(Connection con) throws SQLException{
		ArrayList<USpopulation> USpop = new ArrayList<USpopulation>();
		
		if(method.equals(s)){
			 str="SELECT * FROM test.data WHERE CNAME='"+value+"'"; 
		}else if(method.equals(s1)){
			 str = "SELECT * FROM test.data WHERE STNAME='"+value+"'"; 
		}
	 
		
		PreparedStatement stmt = con.prepareCall(str);
		ResultSet rs = stmt.executeQuery();
		try{
			while(rs.next()){
				USpopulation  PopObj = new USpopulation();
				PopObj.setId(rs.getInt("id"));
				PopObj.setCityName(rs.getString("CNAME"));
				PopObj.setStateNAME(rs.getString("STNAME"));
				PopObj.setPopulation(rs.getInt("Population"));
				USpop.add(PopObj);
			}
			
		}catch (SQLException e){
			e.printStackTrace();
		}
		
		
		return USpop;
	}
	
	
    public void setValue(String v)
    {
    	this.value=v;
    }


	public void setMethod(String method) {
         this.method=method;		
	}
   

}
