package cn.com.jandar.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Table(name = "device")
@Entity
public class Device implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID", nullable = false, length = 18)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq_device_sequence")
	@SequenceGenerator(name="seq_device_sequence",sequenceName="seq_device_sequence",allocationSize=1)
	private java.lang.Long id;
	
	@Column(name = "LIGHTTYPE", length = 40)
	private java.lang.String lighttype;

	@Column(name = "IS_OPEN", length = 10)
	private java.lang.String isopen;

	@Column(name = "TYPECODE", length = 20)
	private java.lang.String typecode;

	@Column(name = "REMARK", length = 200)
	private java.lang.String remark;

	@Column(name = "TOUCHTYPE", length = 40)
	private java.lang.String touchtype;

	@Column(name = "STATE", length = 20)
	private java.lang.String state;

	@Column(name = "CODE", length = 20)
	private java.lang.String code;

	@Column(name = "USEDATE")
	private java.util.Date usedate;

	@Column(name = "ZEROCAPTURE")
	private java.lang.Long zerocapture;

	@Column(name = "IP", length = 20)
	private java.lang.String ip;

	@Column(name = "RECENTSIGNINTIME")
	private java.util.Date recentsignintime;

	@Column(name = "SIGNINSTATE")
	private java.lang.String signinstate;

	@ManyToOne()
	@JoinColumn(name = "POINTID")
	private Point point;

	@Column(name = "RECOGNITIONRATE", length = 20)
	private java.lang.String recognitionrate;

	@Column(name = "NAME", length = 100)
	private java.lang.String name;

	@ManyToOne()
	@JoinColumn(name = "CONTROLID")
	private Control control;

	@OneToMany(mappedBy = "device", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Driveway> driveways = new ArrayList<Driveway>();

	@OneToMany(mappedBy = "device", fetch = FetchType.LAZY)
	// 不可级联删，原始数据不能删
	private List<Vehicle> vehicles = new ArrayList<Vehicle>();
	@Transient
	private String fualtTime;
	@Transient
	private String signinCount;
	@Transient
	private String recoRate;

	@Column(name = "HTID")
	private String htId;

	@Column(name = "HTKEY")
	private String htKey;
	
	@Column(name = "XWID")
	private String xwId;

	public java.lang.Long getId() {
		return id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getLighttype() {
		return lighttype;
	}

	public void setLighttype(java.lang.String lighttype) {
		this.lighttype = lighttype;
	}

	public java.lang.String getIsopen() {
		return isopen;
	}

	public void setIsopen(java.lang.String isopen) {
		this.isopen = isopen;
	}

	public java.lang.String getTypecode() {
		return typecode;
	}

	public void setTypecode(java.lang.String typecode) {
		this.typecode = typecode;
	}

	public java.lang.String getRemark() {
		return remark;
	}

	public void setRemark(java.lang.String remark) {
		this.remark = remark;
	}

	public java.lang.String getTouchtype() {
		return touchtype;
	}

	public void setTouchtype(java.lang.String touchtype) {
		this.touchtype = touchtype;
	}

	public java.lang.String getState() {
		return state;
	}

	public void setState(java.lang.String state) {
		this.state = state;
	}

	public java.lang.String getCode() {
		return code;
	}

	public void setCode(java.lang.String code) {
		this.code = code;
	}

	public java.util.Date getUsedate() {
		return usedate;
	}

	public void setUsedate(java.util.Date usedate) {
		this.usedate = usedate;
	}

	public java.lang.Long getZerocapture() {
		return zerocapture;
	}

	public void setZerocapture(java.lang.Long zerocapture) {
		this.zerocapture = zerocapture;
	}

	public java.lang.String getIp() {
		return ip;
	}

	public void setIp(java.lang.String ip) {
		this.ip = ip;
	}

	public java.util.Date getRecentsignintime() {
		return recentsignintime;
	}

	public void setRecentsignintime(java.util.Date recentsignintime) {
		this.recentsignintime = recentsignintime;
	}

	public java.lang.String getSigninstate() {
		return signinstate;
	}

	public void setSigninstate(java.lang.String signinstate) {
		this.signinstate = signinstate;
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	public java.lang.String getRecognitionrate() {
		return recognitionrate;
	}

	public void setRecognitionrate(java.lang.String recognitionrate) {
		this.recognitionrate = recognitionrate;
	}

	public java.lang.String getName() {
		return name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public Control getControl() {
		return control;
	}

	public void setControl(Control control) {
		this.control = control;
	}

	public List<Driveway> getDriveways() {
		return driveways;
	}

	public void setDriveways(List<Driveway> driveways) {
		this.driveways = driveways;
	}

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	public String getFualtTime() {
		return fualtTime;
	}

	public void setFualtTime(String fualtTime) {
		this.fualtTime = fualtTime;
	}

	public String getSigninCount() {
		return signinCount;
	}

	public void setSigninCount(String signinCount) {
		this.signinCount = signinCount;
	}

	public String getRecoRate() {
		return recoRate;
	}

	public void setRecoRate(String recoRate) {
		this.recoRate = recoRate;
	}

	public String getHtId() {
		return htId;
	}

	public void setHtId(String htId) {
		this.htId = htId;
	}

	public String getHtKey() {
		return htKey;
	}

	public void setHtKey(String htKey) {
		this.htKey = htKey;
	}

	public String getXwId() {
		return xwId;
	}

	public void setXwId(String xwId) {
		this.xwId = xwId;
	}
}
