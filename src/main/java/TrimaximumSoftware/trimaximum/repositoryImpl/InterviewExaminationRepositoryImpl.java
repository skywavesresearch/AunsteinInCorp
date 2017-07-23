package TrimaximumSoftware.trimaximum.repositoryImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import TrimaximumSoftware.trimaximum.model.Questions;
import TrimaximumSoftware.trimaximum.repository.InterviewExaminationRepository;

@Repository
public class InterviewExaminationRepositoryImpl implements InterviewExaminationRepository {

	protected EntityManager entityManager;
	
	private static final Logger logger = LoggerFactory.getLogger(InterviewExaminationRepositoryImpl.class);
	
    public EntityManager getEntityManager() {
        return entityManager;
    }
    
    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
	
    @Override
    public List<Questions> getAllQuestion() {
    	List<Questions> resultList = null;
    	
    	resultList = (List<Questions>) entityManager.createQuery("SELECT quest FROM Questions quest").getResultList();
    	
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
    	
    	resultList = (List<Questions>) entityManager.createQuery("SELECT quest FROM Questions quest where quest.levelCode = :levelCode and quest.technologyCode = :technologyCode ").setParameter("levelCode", levelCode).setParameter("technologyCode", technologyCode).getResultList();
    	
    	return resultList;
		
	}
	
	@Override
	public List<Questions> getAllQuestionsForLevelAndTechnology(String level, String technology) {
		
		List<Questions> resultList = null;
    	
    	resultList = (List<Questions>) entityManager.createQuery("SELECT quest FROM Questions quest where quest.level = :level and quest.technology = :technology ").setParameter("level", level).setParameter("technology", technology).getResultList();
    	
    	return resultList;
		
	}
    
}
