package com.braj.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.braj.vo.CustomerVO;

@Path("/json/customer")
public class Controller {
	
	@GET
	@Path("/details")
	@Produces(MediaType.APPLICATION_JSON)
	public CustomerVO getTrackInJSON() {

		CustomerVO customerVO = new CustomerVO();
		customerVO.setName("Ramesh");;
		customerVO.setDesgination("Mechanical Engineer");
		customerVO.setCity("Bangalore");
		customerVO.setSalary(800000);
     	return customerVO;

	}

	
}
