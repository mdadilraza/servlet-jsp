package dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "s_id"  )
	private int studentId;
	@Column(name = "s_userName" ,length = 50, nullable = false,unique = true)
	private String studentUserName;
	@Column(name = "s_Email" ,length = 50, nullable = false,unique = true)
	private String studentEmail;
	@Column(name = "s_Phone" ,length = 10, nullable = false,unique = true)
	private long studentPhone;
	@Column(name = "s_password" ,length = 50, nullable = false,unique = true)
	private String studentPassword;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentUserName() {
		return studentUserName;
	}

	public void setStudentUserName(String studentUserName) {
		this.studentUserName = studentUserName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public long getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(long studentPhone) {
		this.studentPhone = studentPhone;
	}

	public String getStudentPassword() {
		return studentPassword;
	}

	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentUserName=" + studentUserName + ", studentEmail="
				+ studentEmail + ", studentPhone=" + studentPhone + ", studentPassword=" + studentPassword + "]";
	}
	
	

}
