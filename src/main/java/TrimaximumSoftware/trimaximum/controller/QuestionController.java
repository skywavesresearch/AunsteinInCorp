package TrimaximumSoftware.trimaximum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import TrimaximumSoftware.trimaximum.model.Questions;
import TrimaximumSoftware.trimaximum.service.QuestionsService;
import TrimaximumSoftware.trimaximum.service.SecurityService;


@Controller
public class QuestionController {
	
	@Autowired
	private QuestionsService questionsService;
	
	@Autowired
    private SecurityService securityService;
	
	@RequestMapping(value = "/persistQuestion", method = RequestMethod.POST)
    public String persistQuestion(@ModelAttribute("questionForm") Questions questionForm, BindingResult bindingResult, Model model) {
        
		boolean saveResult = questionsService.save(questionForm);
		String returnRedirectStr = "createAndPersistQuestion";
		if(!saveResult) {
			model.addAttribute("failure", "Question Creation Un-Successfull");
		}else {
			model.addAttribute("success", "Question Created and Persisted Successfully");
		}
		return returnRedirectStr;
    }
	
	@RequestMapping(value = "/createAndPersistQuestion", method = RequestMethod.GET)
    public String createQuestion(Model model) {
        
		return "createAndPersistQuestion";
    }
	
}
