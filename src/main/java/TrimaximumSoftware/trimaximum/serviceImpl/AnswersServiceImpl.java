package TrimaximumSoftware.trimaximum.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import TrimaximumSoftware.trimaximum.model.Answers;
import TrimaximumSoftware.trimaximum.repository.AnswersRepostiory;
import TrimaximumSoftware.trimaximum.service.AnswersService;

@Service
public class AnswersServiceImpl implements AnswersService {

	private AnswersRepostiory answersRepository;

	public AnswersRepostiory getAnswersRepository() {
		return answersRepository;
	}

	public void setAnswersRepository(AnswersRepostiory answersRepository) {
		this.answersRepository = answersRepository;
	}
	
	@Override
	public boolean persistAllAnswersOfList(List<Answers> answersList) {
		boolean result = false;
		result = answersRepository.persistAllAnswersOfList(answersList);
		
		return result;
	}
	
	@Override
	public boolean persistAnswersObject(Answers answersObj) {
		
		boolean result = false;
		
		result = answersRepository.persistAnswersObject(answersObj);
		
		return result;
	}
	
}
