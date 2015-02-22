package com.population.wyan2011.client.bean;

public class DataHolder extends ItemData {
	protected String cityName;
	protected String stateName;
	protected String population;
	
	
	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

	
	public String buildUri()
	{
		return "http://localhost:8080/gwtRESTTutorial/rrh/employees/"  + id;
		
	}
}
