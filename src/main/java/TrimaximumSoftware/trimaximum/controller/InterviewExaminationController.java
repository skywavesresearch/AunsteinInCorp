package TrimaximumSoftware.trimaximum.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import TrimaximumSoftware.trimaximum.model.Answers;
import TrimaximumSoftware.trimaximum.model.Questions;
import TrimaximumSoftware.trimaximum.model.User;
import TrimaximumSoftware.trimaximum.service.AnswersService;
import TrimaximumSoftware.trimaximum.service.InterviewExaminationService;
import TrimaximumSoftware.trimaximum.service.UserService;

@Controller
public class InterviewExaminationController {
	
		@Autowired
	    private InterviewExaminationService interviewExaminationService;
	
		@Autowired
	    private UserService userService;
		
		@Autowired
	    private AnswersService answersService;
		
	 	@RequestMapping(value = "/trimaximumExam", method = RequestMethod.GET)
	    public String trimaximumExam(Model model, String error) {
	    	
	    	List<Questions> questList = interviewExaminationService.getAllQuestion();
	    	
	    	model.addAttribute("questList", questList);
	    	
	        return "trimaximumExam";
	    }
	    
	    @RequestMapping(value = "/submitAnswers", method = RequestMethod.POST)
	    public String submitAnswers(Model model, String error, HttpServletRequest request,
	    						HttpServletResponse response) {
	    	
	    	String level = request.getParameter("level");
	    	String technology = request.getParameter("technology");
	    	String userName = request.getParameter("userName");
	    	if(level == null || technology == null || level.equals("") || technology.equals("") || userName == null || "".equals(userName)) {
	    		return "chooseExamination";
	    	}
	    	User user = userService.findByUsername(userName);
	    	List<Questions> questList = interviewExaminationService.getAllQuestionsForLevelAndTechnology(level, technology);
	    	
	    	List<Answers> answersObjectList = new ArrayList<Answers>();
	    	
	    	for(Questions quest : questList) {
	    		
	    		Answers answerBean = new Answers();
	    		
	    		answerBean.setQuestion(quest);
	    		
	    		answerBean.setUser(user);
	    		
	    		Long questId = quest.getId();
	    		
	    		if(request.getParameter(questId+"#ans1") != null && !request.getParameter(questId+"#ans1").equals("0")) {
	    			answerBean.setAnswerA(1);
				}
				if(request.getParameter(questId+"#ans2") != null && !request.getParameter(questId+"#ans2").equals("0")) {
					answerBean.setAnswerB(1);
				}
				if(request.getParameter(questId+"#ans3") != null && !request.getParameter(questId+"#ans3").equals("0")) {
					answerBean.setAnswerC(1);
				}
				if(request.getParameter(questId+"#ans4") != null && !request.getParameter(questId+"#ans4").equals("0")) {
					answerBean.setAnswerD(1);
				}
	    		
				answerBean.setExamTakenTime(new Date(System.currentTimeMillis()));
				
				answerBean.setCreatedDate(new Date(System.currentTimeMillis()));
				
				answersObjectList.add(answerBean);
				
			}
	    	
	    	boolean result = answersService.persistAllAnswersOfList(answersObjectList);
	    	
	        return "welcome";
	    }
}
