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

@Table(name="point")
@Entity
public class Point implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID", nullable = false, length = 18)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq_point_sequence")
	@SequenceGenerator(name="seq_point_sequence",sequenceName="seq_point_sequence",allocationSize=1)
	private java.lang.Long id;
	
	@Column(name = "NAME", length = 40)
	private java.lang.String name;

	@Column(name = "CODE", length = 20)
	private java.lang.String code;

	@Column(name = "TYPE", length = 20)
	private java.lang.String type;

	@Column(name = "SOURCE", length = 40)
	private java.lang.String source;

	@Column(name = "STATE", length = 20)
	private java.lang.String state;

	@Column(name = "LONGI", length = 30)
	private java.lang.String longi;

	@Column(name = "LATI", length = 30)
	private java.lang.String lati;

	@Column(name = "SHORTCODE", length = 4)
	private String shortCode;

	@Column(name = "OPTICALFIBER", length = 20)
	private String opticalfiber;
	
	@Column(name = "JUNCTION", length = 20)
	private String junction;
	
	@Column(name = "SNAPDEVICE", length = 20)
	private String snapdevice;
	
	@Column(name = "VEDIODEVICE", length = 20)
	private String vediodevice;
	
	@Column(name = "COVERAGE", length = 20)
	private String coverage;
	// @Column(name = "CONTRACTORSID")
	// private java.lang.Long contractorsid;

	@ManyToOne
	@JoinColumn(name = "CONTRACTORSID")
	private Manufacturer manufacturer;

	@ManyToOne
	@JoinColumn(name = "DEPTID")
	private Department department;//部门

	@Column(name = "USEDATE")
	private java.util.Date usedate;//开启时间

	@Column(name = "IMG1", length = 200)
	private java.lang.String img1;

	@Column(name = "IMG2", length = 200)
	private java.lang.String img2;

	@Column(name = "IMG3", length = 200)
	private java.lang.String img3;

	@Column(name = "IMG4", length = 200)
	private java.lang.String img4;

	@Column(name = "IMG5", length = 200)
	private java.lang.String img5;

	@Column(name = "DESCRI", length = 300)
	private java.lang.String descri;

	@Column(name = "REMARK", length = 200)
	private java.lang.String remark;

	@Column(name = "TRIGGERMODE", length = 20)
	private java.lang.String triggermode;

	@Column(name = "ADDRESS", length = 200)
	private java.lang.String address;

	@Column(name = "CONTROLCOUNT")
	private java.lang.Integer controlcount;

	@Column(name = "DRIVEWAYCOUNT")
	private java.lang.Integer drivewaycount;

	@Column(name = "DAYTIME", length = 20)
	private java.lang.String daytime;//白天时长

	@Column(name = "NIGHTTIME", length = 20)
	private java.lang.String nighttime;//夜晚时长
	
	@Column(name = "STORAGETIME", length = 20)
	private java.lang.String storagetime;

	@Column(name = "HTID")
	private String htId;

	@Column(name = "HTKEY")
	private String htKey;

	@Column(name = "ISHTSEND")
	private String isHtSend;

	@Column(name = "ISFIRSTCOME")
	private String isFirstCome;

	@Column(name = "ISREVERSE")
	private String isReverse;
	
	@Column(name = "DOWNFILENAME")
	private String downFileName;
	
	@Column(name = "ISXWSEND")
	private String isXwSend;
	
	@Column(name = "ISSECONDCHECK")
	private String isSecondCheck ;

	@OneToMany(mappedBy = "point", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Control> controls = new ArrayList<Control>(); // 方向

	@OneToMany(mappedBy = "point", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Driveway> driveways = new ArrayList<Driveway>(); // 车道


	@OneToMany(mappedBy = "point", fetch = FetchType.LAZY)
	// 去掉级联删除，因为错误可能会很多
	private List<Devicefault> devicefaults = new ArrayList<Devicefault>(); // 设备错误


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


	public java.lang.String getType() {
		return type;
	}


	public void setType(java.lang.String type) {
		this.type = type;
	}


	public java.lang.String getSource() {
		return source;
	}


	public void setSource(java.lang.String source) {
		this.source = source;
	}


	public java.lang.String getState() {
		return state;
	}


	public void setState(java.lang.String state) {
		this.state = state;
	}


	public java.lang.String getLongi() {
		return longi;
	}


	public void setLongi(java.lang.String longi) {
		this.longi = longi;
	}


	public java.lang.String getLati() {
		return lati;
	}


	public void setLati(java.lang.String lati) {
		this.lati = lati;
	}


	public String getShortCode() {
		return shortCode;
	}


	public void setShortCode(String shortCode) {
		this.shortCode = shortCode;
	}


	public String getOpticalfiber() {
		return opticalfiber;
	}


	public void setOpticalfiber(String opticalfiber) {
		this.opticalfiber = opticalfiber;
	}


	public String getJunction() {
		return junction;
	}


	public void setJunction(String junction) {
		this.junction = junction;
	}


	public String getSnapdevice() {
		return snapdevice;
	}


	public void setSnapdevice(String snapdevice) {
		this.snapdevice = snapdevice;
	}


	public String getVediodevice() {
		return vediodevice;
	}


	public void setVediodevice(String vediodevice) {
		this.vediodevice = vediodevice;
	}


	public String getCoverage() {
		return coverage;
	}


	public void setCoverage(String coverage) {
		this.coverage = coverage;
	}


	public Manufacturer getManufacturer() {
		return manufacturer;
	}


	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	public java.util.Date getUsedate() {
		return usedate;
	}


	public void setUsedate(java.util.Date usedate) {
		this.usedate = usedate;
	}


	public java.lang.String getImg1() {
		return img1;
	}


	public void setImg1(java.lang.String img1) {
		this.img1 = img1;
	}


	public java.lang.String getImg2() {
		return img2;
	}


	public void setImg2(java.lang.String img2) {
		this.img2 = img2;
	}


	public java.lang.String getImg3() {
		return img3;
	}


	public void setImg3(java.lang.String img3) {
		this.img3 = img3;
	}


	public java.lang.String getImg4() {
		return img4;
	}


	public void setImg4(java.lang.String img4) {
		this.img4 = img4;
	}


	public java.lang.String getImg5() {
		return img5;
	}


	public void setImg5(java.lang.String img5) {
		this.img5 = img5;
	}


	public java.lang.String getDescri() {
		return descri;
	}


	public void setDescri(java.lang.String descri) {
		this.descri = descri;
	}


	public java.lang.String getRemark() {
		return remark;
	}


	public void setRemark(java.lang.String remark) {
		this.remark = remark;
	}


	public java.lang.String getTriggermode() {
		return triggermode;
	}


	public void setTriggermode(java.lang.String triggermode) {
		this.triggermode = triggermode;
	}


	public java.lang.String getAddress() {
		return address;
	}


	public void setAddress(java.lang.String address) {
		this.address = address;
	}


	public java.lang.Integer getControlcount() {
		return controlcount;
	}


	public void setControlcount(java.lang.Integer controlcount) {
		this.controlcount = controlcount;
	}


	public java.lang.Integer getDrivewaycount() {
		return drivewaycount;
	}


	public void setDrivewaycount(java.lang.Integer drivewaycount) {
		this.drivewaycount = drivewaycount;
	}


	public java.lang.String getDaytime() {
		return daytime;
	}


	public void setDaytime(java.lang.String daytime) {
		this.daytime = daytime;
	}


	public java.lang.String getNighttime() {
		return nighttime;
	}


	public void setNighttime(java.lang.String nighttime) {
		this.nighttime = nighttime;
	}


	public java.lang.String getStoragetime() {
		return storagetime;
	}


	public void setStoragetime(java.lang.String storagetime) {
		this.storagetime = storagetime;
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


	public String getIsHtSend() {
		return isHtSend;
	}


	public void setIsHtSend(String isHtSend) {
		this.isHtSend = isHtSend;
	}


	public String getIsFirstCome() {
		return isFirstCome;
	}


	public void setIsFirstCome(String isFirstCome) {
		this.isFirstCome = isFirstCome;
	}


	public String getIsReverse() {
		return isReverse;
	}


	public void setIsReverse(String isReverse) {
		this.isReverse = isReverse;
	}


	public String getDownFileName() {
		return downFileName;
	}


	public void setDownFileName(String downFileName) {
		this.downFileName = downFileName;
	}


	public String getIsXwSend() {
		return isXwSend;
	}


	public void setIsXwSend(String isXwSend) {
		this.isXwSend = isXwSend;
	}


	public String getIsSecondCheck() {
		return isSecondCheck;
	}


	public void setIsSecondCheck(String isSecondCheck) {
		this.isSecondCheck = isSecondCheck;
	}


	public List<Control> getControls() {
		return controls;
	}


	public void setControls(List<Control> controls) {
		this.controls = controls;
	}


	public List<Driveway> getDriveways() {
		return driveways;
	}


	public void setDriveways(List<Driveway> driveways) {
		this.driveways = driveways;
	}


	public List<Devicefault> getDevicefaults() {
		return devicefaults;
	}


	public void setDevicefaults(List<Devicefault> devicefaults) {
		this.devicefaults = devicefaults;
	}
}
