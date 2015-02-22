package com.population.wyan2011.client.callback;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONParser;
import com.google.gwt.json.client.JSONValue;
import com.population.wyan2011.client.PopulationData;
import com.population.wyan2011.client.bean.DataHolder;
import com.population.wyan2011.client.bean.ItemData;

//import edu.ucar.cisl.gwtRESTTutorialView.client.EmployeePopup;
//import edu.ucar.cisl.gwtRESTTutorialView.client.bean.EmployeeItemData;
//import edu.ucar.cisl.gwtRESTTutorialView.client.bean.ItemData;

public class PopulaitonRpcCallback extends RestServiceRpcCallback {

	protected void processResponse(String response) {
		JSONValue jsonValue = JSONParser.parse(response);
		ItemData iData = (ItemData) treeItem.getUserObject();
		JSONObject jobj = jsonValue.isObject();
		DataHolder eItemData = (DataHolder) iData;
		eItemData.setId((int) jobj.get("id").isNumber().doubleValue());
		eItemData.setCityName(jobj.get("firstName").isString().stringValue());
		eItemData.setStateName(jobj.get("nickName").isString().stringValue());
		eItemData.setPopulation(jobj.get("lastName").isString().stringValue());
		
		iData.setDataReady(true);
		int left = treeItem.getAbsoluteLeft() + 50;
		int top = treeItem.getAbsoluteTop() + 30;
		PopulationData.show(left, top, (DataHolder) eItemData);
	}
}
