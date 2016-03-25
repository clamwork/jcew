package cn.com.jandar.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "manufacturer")
@Entity
public class Manufacturer implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID", nullable = false, length = 18)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq_manufacturer_sequence")
	@SequenceGenerator(name="seq_manufacturer_sequence",sequenceName="seq_manufacturer_sequence",allocationSize=1)
	private java.lang.Long id;

	@Column(name = "REMARK", length = 200)
	private java.lang.String remark;

	@Column(name = "INFORMATION", length = 200)
	private java.lang.String information;
	
	@Column(name = "TEL", length = 20)
	private java.lang.String tel;

	@Column(name = "MTEL3", length = 20)
	private java.lang.String mtel3;

	@Column(name = "MTEL2", length = 20)
	private java.lang.String mtel2;

	@Column(name = "AREACODE", length = 40)
	private java.lang.String areacode;

	@Column(name = "LEADERIDNUMBER", length = 20)
	private java.lang.String leaderidnumber;

	@Column(name = "CODE", length = 20)
	private java.lang.String code;

	@Column(name = "TYPE", length = 20)
	private java.lang.String type;

	@Column(name = "LEADERNAME", length = 20)
	private java.lang.String leadername;

	@Column(name = "MTEL1", length = 20)
	private java.lang.String mtel1;

	@Column(name = "AREADESC", length = 100)
	private java.lang.String areadesc;

	@Column(name = "LEADTEL", length = 20)
	private java.lang.String leadtel;

	@Column(name = "QUALIFICATION", length = 40)
	private java.lang.String qualification;

	@Column(name = "MMAN1", length = 20)
	private java.lang.String mman1;

	@Column(name = "MMAN2", length = 20)
	private java.lang.String mman2;

	@Column(name = "MMAN3", length = 20)
	private java.lang.String mman3;

	@Column(name = "NAME", length = 40)
	private java.lang.String name;

	@Column(name = "STATE")
	private String state;

	@Column(name = "MQ")
	private String mq;
	
	@Column(name = "FTP")
	private String ftp;
	
	@Column(name = "RECOVERYDATE")
	private Date recoveryDate;

	@Column(name = "NAMECODE")
	private String namecode;

	@Column(name = "NODATATEXT")
	private String noDataText;

	public java.lang.Long getId() {
		return id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getRemark() {
		return remark;
	}

	public void setRemark(java.lang.String remark) {
		this.remark = remark;
	}

	public java.lang.String getInformation() {
		return information;
	}

	public void setInformation(java.lang.String information) {
		this.information = information;
	}

	public java.lang.String getTel() {
		return tel;
	}

	public void setTel(java.lang.String tel) {
		this.tel = tel;
	}

	public java.lang.String getMtel3() {
		return mtel3;
	}

	public void setMtel3(java.lang.String mtel3) {
		this.mtel3 = mtel3;
	}

	public java.lang.String getMtel2() {
		return mtel2;
	}

	public void setMtel2(java.lang.String mtel2) {
		this.mtel2 = mtel2;
	}

	public java.lang.String getAreacode() {
		return areacode;
	}

	public void setAreacode(java.lang.String areacode) {
		this.areacode = areacode;
	}

	public java.lang.String getLeaderidnumber() {
		return leaderidnumber;
	}

	public void setLeaderidnumber(java.lang.String leaderidnumber) {
		this.leaderidnumber = leaderidnumber;
	}

	public java.lang.String getCode() {
		return code;
	}

	public void setCode(java.lang.String code) {
		this.code = code;
	}

	public java.lang.String getType() {
		return type;
	}

	public void setType(java.lang.String type) {
		this.type = type;
	}

	public java.lang.String getLeadername() {
		return leadername;
	}

	public void setLeadername(java.lang.String leadername) {
		this.leadername = leadername;
	}

	public java.lang.String getMtel1() {
		return mtel1;
	}

	public void setMtel1(java.lang.String mtel1) {
		this.mtel1 = mtel1;
	}

	public java.lang.String getAreadesc() {
		return areadesc;
	}

	public void setAreadesc(java.lang.String areadesc) {
		this.areadesc = areadesc;
	}

	public java.lang.String getLeadtel() {
		return leadtel;
	}

	public void setLeadtel(java.lang.String leadtel) {
		this.leadtel = leadtel;
	}

	public java.lang.String getQualification() {
		return qualification;
	}

	public void setQualification(java.lang.String qualification) {
		this.qualification = qualification;
	}

	public java.lang.String getMman1() {
		return mman1;
	}

	public void setMman1(java.lang.String mman1) {
		this.mman1 = mman1;
	}

	public java.lang.String getMman2() {
		return mman2;
	}

	public void setMman2(java.lang.String mman2) {
		this.mman2 = mman2;
	}

	public java.lang.String getMman3() {
		return mman3;
	}

	public void setMman3(java.lang.String mman3) {
		this.mman3 = mman3;
	}

	public java.lang.String getName() {
		return name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getMq() {
		return mq;
	}

	public void setMq(String mq) {
		this.mq = mq;
	}

	public String getFtp() {
		return ftp;
	}

	public void setFtp(String ftp) {
		this.ftp = ftp;
	}

	public Date getRecoveryDate() {
		return recoveryDate;
	}

	public void setRecoveryDate(Date recoveryDate) {
		this.recoveryDate = recoveryDate;
	}

	public String getNamecode() {
		return namecode;
	}

	public void setNamecode(String namecode) {
		this.namecode = namecode;
	}

	public String getNoDataText() {
		return noDataText;
	}

	public void setNoDataText(String noDataText) {
		this.noDataText = noDataText;
	}
}
