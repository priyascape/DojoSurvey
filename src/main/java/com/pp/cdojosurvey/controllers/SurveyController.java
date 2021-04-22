package com.pp.cdojosurvey.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class SurveyController {
	@RequestMapping("/")
	public String survey() {
		return "/DojoSurvey/survey.jsp";
	}
}

