package cn.com.jandar.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "APP_CODETBL")
@Entity
public class Appcode implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID", nullable = false, length = 18)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq_appcode_sequence")
	@SequenceGenerator(name="seq_appcode_sequence",sequenceName="seq_appcode_sequence",allocationSize=1)
	private java.lang.Long id;
	
	@Column(name="CODETYPE",length = 30)
	private String codetype ;
	
	@Column(name="CODE",length = 30)
	private String code ;
	
	@Column(name="CODENAME",length = 30)
	private String codename ;
	
	@Column(name="SEQNO",length = 3)
	private Long seqno ;
	
	@Column(name="FLAG" ,length = 1)
	private Long flag ;
	
	@Column(name = "CODETYPENAME" , length = 100)
	private String codetypename;

	public java.lang.Long getId() {
		return id;
	}

	public void setId(java.lang.Long  id) {
		this.id = id;
	}

	public String getCodetype() {
		return codetype;
	}

	public void setCodetype(String codetype) {
		this.codetype = codetype;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCodename() {
		return codename;
	}

	public void setCodename(String codename) {
		this.codename = codename;
	}

	public Long getSeqno() {
		return seqno;
	}

	public void setSeqno(Long seqno) {
		this.seqno = seqno;
	}

	public Long getFlag() {
		return flag;
	}

	public void setFlag(Long flag) {
		this.flag = flag;
	}

	public String getCodetypename() {
		return codetypename;
	}

	public void setCodetypename(String codetypename) {
		this.codetypename = codetypename;
	}
	
}
