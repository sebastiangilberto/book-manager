package com.sgilberto.bookmanager.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import springfox.documentation.annotations.ApiIgnore;

@RequestMapping("/")
@ApiIgnore
@RestController
public class SwaggerController {

	@GetMapping
	public ModelAndView redirectToSwaggerUI(ModelMap model) {
		return new ModelAndView("redirect:/swagger-ui.html", model);
	}

}
