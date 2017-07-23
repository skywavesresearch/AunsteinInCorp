package TrimaximumSoftware.trimaximum.repository;

import java.util.List;

import TrimaximumSoftware.trimaximum.model.Answers;

public interface AnswersRepostiory {
	
	public boolean persistAllAnswersOfList(List<Answers> answersList);
	
	public boolean persistAnswersObject(Answers answersObj);
	

}
