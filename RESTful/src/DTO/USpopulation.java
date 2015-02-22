package DTO;

public class USpopulation {
private int id;
private String CNAME;
private String STNAME;
private int Population;

public USpopulation(){
	
}
public USpopulation(int id, String CNAME, String STNAME, int Population){
	super();
	this.id = id;
	this.CNAME = CNAME;
	this.STNAME = STNAME;
	this.Population = Population;
}

public int getId(){
	return id;
}

public void setId(int id){
	this.id = id;
}

public String getCityName(){
	return CNAME;
}

public void setCityName(String name){
	this.CNAME = name;
}

public String getStateNAME(){
	return STNAME;
}

public void setStateNAME(String STNAME){
	this.STNAME = STNAME;
}

public int getPopulation(){
	return Population;
}

public void setPopulation(int Population){
	this.Population = Population;
}

@Override
public String toString(){
	return "Populaiton [id = "+ id +", city name ="+ CNAME +", state name = "+ STNAME+", population ="+ Population +"]";
}

}
