package TrimaximumSoftware.trimaximum.serviceImpl;


import org.springframework.stereotype.Service;

import TrimaximumSoftware.trimaximum.model.Questions;
import TrimaximumSoftware.trimaximum.repository.QuestionsRepository;
import TrimaximumSoftware.trimaximum.service.QuestionsService;
import TrimaximumSoftware.trimaximum.util.TrimaximumProperties;

@Service
public class QuestionsServiceImpl implements QuestionsService {

	private QuestionsRepository questionsRepository;
	
	public QuestionsRepository getQuestionsRepository() {
		return questionsRepository;
	}

	public void setQuestionsRepository(QuestionsRepository questionsRepository) {
		this.questionsRepository = questionsRepository;
	}
	
	@Override
	public boolean save(Questions questionForm) {
		boolean result = false;
		if(questionForm != null) {
			questionForm.setLevelCode(TrimaximumProperties.levelMap.get(questionForm.getLevel()));
			questionForm.setTechnologyCode(TrimaximumProperties.technologyMap.get(questionForm.getTechnology()));
			if(questionForm.getAns1() != 0) {
				questionForm.setAns1(1);
			}
			if(questionForm.getAns2() != 0) {
				questionForm.setAns2(1);
			}
			if(questionForm.getAns3() != 0) {
				questionForm.setAns3(1);
			}
			if(questionForm.getAns4() != 0) {
				questionForm.setAns4(1);
			}
			
			try {
				result = questionsRepository.save(questionForm);
			}catch(Exception e) {
				System.out.println("Excep  "+e.getMessage());
				return false;
			}
		}
		return result;
	}
	
}
