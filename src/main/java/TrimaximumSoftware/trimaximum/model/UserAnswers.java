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
@Table(name = "user_answers")
public class UserAnswers {
	
	private Long id;
	private User user;
	private Answers answer;
	private Questions question;
	private Date createdDate;
	private int skippedQuestion;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "answers_id")
	public Answers getAnswer() {
		return answer;
	}
	public void setAnswer(Answers answer) {
		this.answer = answer;
	}
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "question_id")
	public Questions getQuestion() {
		return question;
	}
	public void setQuestion(Questions question) {
		this.question = question;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public int getSkippedQuestion() {
		return skippedQuestion;
	}
	public void setSkippedQuestion(int skippedQuestion) {
		this.skippedQuestion = skippedQuestion;
	}
	
	
}
