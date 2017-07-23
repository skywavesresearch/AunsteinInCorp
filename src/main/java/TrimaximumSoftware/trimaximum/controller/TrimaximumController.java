package TrimaximumSoftware.trimaximum.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import TrimaximumSoftware.trimaximum.model.Questions;
import TrimaximumSoftware.trimaximum.service.InterviewExaminationService;

@Controller
public class TrimaximumController {

	@Autowired
    private InterviewExaminationService interviewExaminationService;
	
	/*@RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model, String error) {
        return "index";
    }
    
    @RequestMapping(value = "/elements", method = RequestMethod.GET)
    public String elements(Model model, String error) {
        return "elements";
    }
	*/
    @RequestMapping(value = "/chooseExamination", method = RequestMethod.GET)
    public String chooseExamination(Model model, String error) {
        
    	return "chooseExamination";
    }
    
    @RequestMapping(value = "/takeExamination", method = RequestMethod.POST)
    public String takeExamination(Model model, String error, HttpServletRequest request,
			HttpServletResponse response) {
        
    	String level = request.getParameter("level");
    	String technology = request.getParameter("technology");
    	
    	if(level == null || technology == null || level.equals("") || technology.equals("")) {
    		return "chooseExamination";
    	}
    	List<Questions> questList = interviewExaminationService.getAllQuestionsForLevelAndTechnology(level, technology);
    	
    	model.addAttribute("questList", questList);
    	
    	model.addAttribute("level", level);
    	model.addAttribute("technology", technology);
    	
    	return "takeExamination";
    }
    
}
