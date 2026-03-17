package com;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class EmployeeListController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception 
	{
		String name=request.getParameter("name");
		ModelAndView m1=new ModelAndView("emp");
		m1.addObject("name",name);
		return m1;
	}

}
