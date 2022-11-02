package onetomany;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Que2")
public class Question {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int qid;
	private String qname;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="qid")
	List<Answer>answers;
	public List<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	public int getQid() {
		return qid;
	}
	public String getQname() {
		return qname;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	public Question(int qid, String qname) {
		super();
		this.qid = qid;
		this.qname = qname;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Question [qid=" + qid + ", qname=" + qname + "]";
	}
	

}
