package TrimaximumSoftware.trimaximum.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import TrimaximumSoftware.trimaximum.model.Questions;
import TrimaximumSoftware.trimaximum.repository.InterviewExaminationRepository;
import TrimaximumSoftware.trimaximum.service.InterviewExaminationService;

@Service
public class InterviewExaminationServiceImpl implements InterviewExaminationService {

	private InterviewExaminationRepository interviewExaminationRepository;

	
	
	public InterviewExaminationRepository getInterviewExaminationRepository() {
		return interviewExaminationRepository;
	}	

	public void setInterviewExaminationRepository(InterviewExaminationRepository interviewExaminationRepository) {
		this.interviewExaminationRepository = interviewExaminationRepository;
	}

	@Override
    public List<Questions> getAllQuestion() {
    	List<Questions> resultList = null;
    	
    	resultList = interviewExaminationRepository.getAllQuestion();
    	return resultList;
    }
	
    @Override
	public List<Questions> getAllQuestionsForLevelCode(int levelCode) {
		List<Questions> resultList = null;
    	
    	
    	return resultList;
	}
	
	@Override
	public List<Questions> getAllQuestionsForLevel(String level) {
		List<Questions> resultList = null;
    	
    	
    	return resultList;
		
	}
	
	@Override
	public List<Questions> getAllQuestionsForTechnology(String technology) {
		List<Questions> resultList = null;
    	
    	
    	return resultList;
	}
	
	@Override
	public List<Questions> getAllQuestionsForTechnologyCode(int technologyCode) {
		List<Questions> resultList = null;
    	
    	
    	return resultList;
	}
	
	@Override
	public Questions loadQuestion(int questionCode) {
		Questions resultQuest = null;
		
		
		return resultQuest;
	}
    
	@Override
	public List<Questions> getAllQuestionsForLevelCodeAndTechnologyCode(int levelCode, int technologyCode) {
		
		List<Questions> resultList = null;
    	
    	resultList = interviewExaminationRepository.getAllQuestionsForLevelCodeAndTechnologyCode(levelCode, technologyCode);
    	return resultList;
		
	}
	
	@Override
	public List<Questions> getAllQuestionsForLevelAndTechnology(String level, String technology) {
		
		List<Questions> resultList = null;
    	
    	resultList = interviewExaminationRepository.getAllQuestionsForLevelAndTechnology(level, technology);
    	return resultList;
		
	}
}
