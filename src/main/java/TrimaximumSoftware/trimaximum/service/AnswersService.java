package TrimaximumSoftware.trimaximum.service;

import java.util.List;

import TrimaximumSoftware.trimaximum.model.Answers;

public interface AnswersService {
	
	public boolean persistAllAnswersOfList(List<Answers> answersList);
	
	public boolean persistAnswersObject(Answers answersObj);

}
