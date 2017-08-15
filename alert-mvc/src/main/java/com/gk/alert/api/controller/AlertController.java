package com.gk.alert.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gk.alert.api.entity.Alert;
import com.gk.alert.api.service.AlertService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Controller
@ResponseBody
@RequestMapping("alert-mvc")
@Api(tags="alert-mvc")
public class AlertController {

	@Autowired
	AlertService alertService;
	
	@RequestMapping(method=RequestMethod.GET)
	@ApiOperation(value="Get alert data",notes = "Gets alert data")
	@ApiResponses(value={@ApiResponse(code=200,message="Success"),@ApiResponse(code=500,message="Internal Server error")})
	public List<Alert> getMockData(){
		return alertService.getAlert();
	}
}
