package TrimaximumSoftware.trimaximum.model;

import javax.persistence.*;

@Entity
@Table(name = "questions")
public class Questions {
	
	
    private Long id;
    private String question;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private String technology;
    private int ans1;
    private int ans2;
    private int ans3;
    private int ans4;;
    private int technologyCode;
    private String comments;
    private String level;
    private int levelCode;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer1() {
		return answer1;
	}
	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}
	public String getAnswer2() {
		return answer2;
	}
	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}
	public String getAnswer3() {
		return answer3;
	}
	public void setAnswer3(String answer3) {
		this.answer3 = answer3;
	}
	public String getAnswer4() {
		return answer4;
	}
	public void setAnswer4(String answer4) {
		this.answer4 = answer4;
	}
	
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public int getAns1() {
		return ans1;
	}
	public void setAns1(int ans1) {
		this.ans1 = ans1;
	}
	public int getAns2() {
		return ans2;
	}
	public void setAns2(int ans2) {
		this.ans2 = ans2;
	}
	public int getAns3() {
		return ans3;
	}
	public void setAns3(int ans3) {
		this.ans3 = ans3;
	}
	public int getAns4() {
		return ans4;
	}
	public void setAns4(int ans4) {
		this.ans4 = ans4;
	}
	public int getTechnologyCode() {
		return technologyCode;
	}
	public void setTechnologyCode(int technologyCode) {
		this.technologyCode = technologyCode;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public int getLevelCode() {
		return levelCode;
	}
	public void setLevelCode(int levelCode) {
		this.levelCode = levelCode;
	}
    
    
}
