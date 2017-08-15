package com.gk.alert.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.gk.alert.api.entity.Alert;
import com.gk.alert.api.repository.AlertDAO;

@Service("alertService")
public class AlertService {

	@Autowired
	@Qualifier("alertDAO")
	AlertDAO alertDAO;
	
	public List<Alert> getAlert(){
		return alertDAO.find().asList();
	}
	
	
}
