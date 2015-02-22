package com.population.wyan2011.client;

import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PopupPanel;
import com.population.wyan2011.client.bean.DataHolder;


public class PopulationData extends PopupPanel {
	static protected PopulationData instance=null;
	protected Grid grid = new Grid(3, 2);
	protected Label cityNameLabel = new Label("City Name");
	protected Label cityNameValueLabel = new Label("City Name");
	protected Label stateNameLabel = new Label("State Name");
	protected Label stateNameValueLabel = new Label("State Name");
	protected Label populationLabel = new Label("Population");
	protected Label populationValueLabel = new Label("Population");
	

	protected PopulationData() {
		super(true);
		grid.setWidget(0, 0, cityNameLabel);
		grid.setWidget(0, 1, cityNameValueLabel);

		grid.setWidget(1, 0, stateNameLabel);
		grid.setWidget(1, 1, stateNameValueLabel);

		grid.setWidget(2, 0, populationLabel);
		grid.setWidget(2, 1, populationValueLabel);



		grid.setWidth("300px");
		// grid.setHeight("400px");
		setWidget(grid);
	}
	
    protected static PopulationData getInstance() {
    	if (instance == null)
    		instance = new PopulationData();
    	
    	return instance;
    }
    
	public void setPopualtionData(DataHolder iData) {
		String cityName = iData.getCityName();
		String stateName = iData.getStateName();
		String population = iData.getPopulation();
		

		cityNameValueLabel.setText(cityName);
		if (stateName != null && stateName.length() > 0) {
			stateNameValueLabel.setVisible(true);
			stateNameLabel.setVisible(true);
			stateNameValueLabel.setText(stateName);
		} else {
			stateNameValueLabel.setVisible(false);
			stateNameLabel.setVisible(false);
		}
		//populationValueLabel.setText(lastName);
		
	}

	public static void show(int leftOffset, int topOffset,
			DataHolder eData) {
		PopulationData popup = getInstance();
		popup.setPopualtionData(eData);
		popup.setPopupPosition(leftOffset, topOffset);
		popup.show();
	}

}
