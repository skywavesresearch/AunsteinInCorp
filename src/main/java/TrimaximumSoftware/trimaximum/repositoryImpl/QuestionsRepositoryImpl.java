package TrimaximumSoftware.trimaximum.repositoryImpl;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import TrimaximumSoftware.trimaximum.model.Questions;
import TrimaximumSoftware.trimaximum.repository.QuestionsRepository;


@Repository
public class QuestionsRepositoryImpl implements QuestionsRepository {
	
	protected EntityManager entityManager;
	
	private static final Logger logger = LoggerFactory.getLogger(QuestionsRepositoryImpl.class);
	
    public EntityManager getEntityManager() {
        return entityManager;
    }
    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
	
    @Transactional
	@Override
	public boolean save(Questions questionForm) throws DataAccessException {
		boolean result = false;
		if(questionForm != null) {
			try {
				getEntityManager().persist(questionForm);
				logger.info("Question saved successfully, Question Details="+questionForm.getQuestion());
				result = true;
				return result;
			}catch(Exception e) {
				logger.info("Inside Catch ="+questionForm.getQuestion()+"  <><> "+new Date(System.currentTimeMillis()).toString());
				result = false;
			}finally {
				logger.info("Inside Finally  ="+questionForm.getQuestion()+"  <><> "+new Date(System.currentTimeMillis()).toString());
			}
		}
		return result;
	}
	

}

