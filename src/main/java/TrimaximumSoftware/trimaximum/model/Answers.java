package TrimaximumSoftware.trimaximum.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "answers")
public class Answers {

	private Long id;
	private Questions question;
	private User user;
	private int answerA;
	private int answerB;
	private int answerC;
	private int answerD;
	private Date examTakenTime;
	private Date createdDate;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "question_id")
	public Questions getQuestion() {
		return question;
	}
	public void setQuestion(Questions question) {
		this.question = question;
	}
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
	public User getUser() {
		return user;
	}
	
	
	public void setUser(User user) {
		this.user = user;
	}
	public int getAnswerA() {
		return answerA;
	}
	public void setAnswerA(int answerA) {
		this.answerA = answerA;
	}
	public int getAnswerB() {
		return answerB;
	}
	public void setAnswerB(int answerB) {
		this.answerB = answerB;
	}
	public int getAnswerC() {
		return answerC;
	}
	public void setAnswerC(int answerC) {
		this.answerC = answerC;
	}
	public int getAnswerD() {
		return answerD;
	}
	public void setAnswerD(int answerD) {
		this.answerD = answerD;
	}
	public Date getExamTakenTime() {
		return examTakenTime;
	}
	public void setExamTakenTime(Date examTakenTime) {
		this.examTakenTime = examTakenTime;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	
	
}
