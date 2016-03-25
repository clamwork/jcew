package cn.com.jandar.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name="department")
@Entity
public class Department implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID", nullable = false, length = 18)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq_department_sequence")
	@SequenceGenerator(name="seq_department_sequence",sequenceName="seq_department_sequence",allocationSize=1)
	private java.lang.Long id;
	
	@Column(name = "NAME",length = 40)
	private java.lang.String name;

	@Column(name = "CODE",length = 20)
	private java.lang.String code;

	@Column(name = "TEL",length = 20)
	private java.lang.String tel;

	@Column(name = "LEADERNAME",length = 20)
	private java.lang.String leadername;

	@Column(name = "LEADERTEL",length = 20)
	private java.lang.String leadertel;

	@Column(name = "REMARK",length = 200)
	private java.lang.String remark;

	public java.lang.Long getId() {
		return id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getName() {
		return name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getCode() {
		return code;
	}

	public void setCode(java.lang.String code) {
		this.code = code;
	}

	public java.lang.String getTel() {
		return tel;
	}

	public void setTel(java.lang.String tel) {
		this.tel = tel;
	}

	public java.lang.String getLeadername() {
		return leadername;
	}

	public void setLeadername(java.lang.String leadername) {
		this.leadername = leadername;
	}

	public java.lang.String getLeadertel() {
		return leadertel;
	}

	public void setLeadertel(java.lang.String leadertel) {
		this.leadertel = leadertel;
	}

	public java.lang.String getRemark() {
		return remark;
	}

	public void setRemark(java.lang.String remark) {
		this.remark = remark;
	}
}
