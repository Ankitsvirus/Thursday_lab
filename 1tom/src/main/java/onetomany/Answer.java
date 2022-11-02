package onetomany;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Ans2")
public class Answer {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int aid;
private String answerName;


@Override

public String toString() {
	return "Answer [aid=" + aid + ", answerName=" + answerName + "]";
}
public Answer() {
	super();
	// TODO Auto-generated constructor stub
}
public Answer(int aid, String answerName) {
	super();
	this.aid = aid;
	this.answerName = answerName;
}
public int getAid() {
	return aid;
}
public String getAnswerName() {
	return answerName;
}
public void setAid(int aid) {
	this.aid = aid;
}
public void setAnswerName(String answerName) {
	this.answerName = answerName;
}
}
