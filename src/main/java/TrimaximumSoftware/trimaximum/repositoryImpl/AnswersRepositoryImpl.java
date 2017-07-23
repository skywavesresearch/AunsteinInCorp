package TrimaximumSoftware.trimaximum.repositoryImpl;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import TrimaximumSoftware.trimaximum.model.Answers;
import TrimaximumSoftware.trimaximum.repository.AnswersRepostiory;


public class AnswersRepositoryImpl implements AnswersRepostiory {
	
	protected EntityManager entityManager;
	
	private static final Logger logger = LoggerFactory.getLogger(AnswersRepositoryImpl.class);
	
    public EntityManager getEntityManager() {
        return entityManager;
    }
    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
	
	@Override
	@Transactional
	public boolean persistAllAnswersOfList(List<Answers> answersList) {
		boolean result = false;
		if(answersList != null && !answersList.isEmpty()) {
			int k = 0;
			entityManager.getTransaction().begin();
			int size = answersList.size();
			for(Answers answersObj : answersList) {
				try {
					entityManager.persist(answersObj);
					logger.info("Question saved successfully, Question Details="+answersObj.getQuestion());
					if((k % size) == 0) {
						entityManager.flush();
						entityManager.clear();
					}
				}catch(Exception e) {
					logger.info("Inside Catch ="+answersObj.getQuestion()+"  <><> "+new Date(System.currentTimeMillis()).toString());
					result = false;
					return false;
				}finally {
					logger.info("Inside Finally  ="+answersObj.getQuestion()+"  <><> "+new Date(System.currentTimeMillis()).toString());
				}
				k++;
			}
			entityManager.getTransaction().commit();
			result = true;
		}
		return result;
	}
	
	@Override
	@Transactional
	public boolean persistAnswersObject(Answers answersObj) {
		
		boolean result = false;
		if(answersObj == null) {
			return result;
		}
		try {
			getEntityManager().persist(answersObj);
			logger.info("Question saved successfully, Question Details="+answersObj.getQuestion());
			result = true;
		}catch(Exception e) {
			logger.info("Inside Catch ="+answersObj.getQuestion()+"  <><> "+new Date(System.currentTimeMillis()).toString());
			result = false;
			return false;
		}finally {
			logger.info("Inside Finally  ="+answersObj.getQuestion()+"  <><> "+new Date(System.currentTimeMillis()).toString());
		}
		
		return result;
	}
	
}
