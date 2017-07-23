package TrimaximumSoftware.trimaximum.service;

import java.util.List;

import TrimaximumSoftware.trimaximum.model.Questions;

public interface InterviewExaminationService {
	
public List<Questions> getAllQuestion();
	
	public List<Questions> getAllQuestionsForLevelCode(int levelCode);
	
	public List<Questions> getAllQuestionsForLevel(String level);
	
	public List<Questions> getAllQuestionsForTechnology(String technology);
	
	public List<Questions> getAllQuestionsForTechnologyCode(int technologyCode);
	
	public List<Questions> getAllQuestionsForLevelCodeAndTechnologyCode(int levelCode, int technologyCode);
	
	public List<Questions> getAllQuestionsForLevelAndTechnology(String level, String technology);
	
	public Questions loadQuestion(int questionCode);
	
	
}
