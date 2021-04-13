package com.vojislav.ISSTrackerFinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vojislav.ISSTrackerFinal.domain.IssLocator;
import com.vojislav.ISSTrackerFinal.service.LocationService;

@RestController
@RequestMapping("/api")
public class ISSController {

	@Autowired
	private LocationService locationService;
	
	@GetMapping("/issLocation")
	@CrossOrigin
	public IssLocator getISSLocation(){
		return locationService.getISSLocation();
	}
}
