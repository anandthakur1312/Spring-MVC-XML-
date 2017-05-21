package com.anand.web.controller;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Map;

import javax.imageio.IIOException;
import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.anand.web.model.User;

@Controller
public class HelloController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		binder.setDisallowedFields("userPhNo");
		//SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy**mm**dd");
		//binder.registerCustomEditor(Date.class, "userDOB", new CustomDateEditor(dateFormat,false));
		binder.registerCustomEditor(String.class, "userName", new UserNameEditor());
		
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView welcomePage()  {
		
		ModelAndView model = new ModelAndView("index");
		
		return model;

	}

	@RequestMapping(value="/admissionform", method=RequestMethod.GET)
	public ModelAndView getAdmissionForm() throws Exception {
		
		String exceptionOccured = "DontThrowException";
		
		if(exceptionOccured.equalsIgnoreCase("NULL_POINTER")){
			throw new NullPointerException("Null Pointer Excptn");
		}
		else if (exceptionOccured.equalsIgnoreCase("IO_EXCEPTION")) {
			throw new IOException("IOException");
		}
		else if (exceptionOccured.equalsIgnoreCase("ARITHEMATIC_EXCEPTION")) {
			throw new Exception("ARITHEMATIC EXCEPTION");
		}
		
		ModelAndView model = new ModelAndView("admissionForm");
		
		return model;

	}
	
	@RequestMapping(value = "/submitForm", method=RequestMethod.POST)
	public ModelAndView submitForm(@Valid @ModelAttribute("user1") User user1, BindingResult result ) {
		
		if(result.hasErrors()){
			ModelAndView model = new ModelAndView("admissionForm");
			return model;
		}
		ModelAndView model = new ModelAndView();
		model.setViewName("admissionSuccess");
		return model;
	}
	
	
	
	@ModelAttribute
	public void commonHeader(Model model){
		model.addAttribute("headerMsg", "Welcome to the coolest website ever");
	}

}