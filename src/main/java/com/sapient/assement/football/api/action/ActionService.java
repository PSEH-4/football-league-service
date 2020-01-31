package com.sapient.assement.football.api.action;

import java.util.List;

import com.sapient.assement.football.messaging.ResponseModel;

public interface ActionService {
	
	List<? extends ResponseModel> getAction(String action);

}
