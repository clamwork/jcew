package cn.com.jandar.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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

@Table(name = "driveway")
@Entity
public class Driveway implements Serializable {

	private static final long serialVersionUID = 1L;


	@Id
	@Column(name = "ID", nullable = false, length = 18)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq_driveway_sequence")
	@SequenceGenerator(name="seq_driveway_sequence",sequenceName="seq_driveway_sequence",allocationSize=1)
	private java.lang.Long id;
	

	@Column(name = "CODE", length = 20)
	private java.lang.String code;

	@Column(name = "SIGN", length = 50)
	private java.lang.String sign;

	@Column(name = "CONTROLCODE")
	private java.lang.String controlcode;

	@Column(name = "DIRECTIONTYPE", length = 20)
	private java.lang.String directiontype;

	@Column(name = "DIRECTIONTYPEDESC", length = 200)
	private java.lang.String directiontypedesc;

	@Column(name = "MONITORTYPE", length = 20)
	private java.lang.String monitortype;

	@Column(name = "HIGHLIMIT")
	private java.lang.Long highlimit;

	@Column(name = "LOWERLIMIT")
	private java.lang.Long lowerlimit;

	@Column(name = "SIGNSPEEDLIMIT")
	private java.lang.Long signspeedlimit;

	@Column(name = "WIDTH")
	private java.lang.Long width;

	@Column(name = "STATE", length = 40)
	private java.lang.String state;

	@Column(name = "IS_SINGLE", length = 10)
	private java.lang.String issingle;

	@Column(name = "OPENDATE")
	private java.util.Date opendate;

	@Column(name = "TURESPEEDLIMIT")
	private java.lang.Long turespeedlimit;

	@Column(name = "REMARK", length = 200)
	private java.lang.String remark;

	@Column(name = "DEVICERELATION", length = 20)
	private java.lang.String devicerelation;

	@Column(name = "CONTROLID")
	private java.lang.Long controlid;

	@Column(name = "DAYNOCARTIME")
	private java.lang.Integer daynocartime;
	
	@Column(name = "NIGHTNOCARTIME")
	private java.lang.Integer nightnocartime;
	
	@Column(name = "LONGI")
	private String longi;

	@Column(name = "LATI")
	private String lati;
	
	@ManyToOne()
	@JoinColumn(name = "POINTID")
	private Point point;
	
	@ManyToOne()
	@JoinColumn(name = "DEVICEID")
	private Device device;

	@OneToMany(mappedBy = "driveway", fetch = FetchType.LAZY )
	private List<Vehicle> vehicles = new ArrayList<Vehicle>();

	public java.lang.Long getId() {
		return id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getCode() {
		return code;
	}

	public void setCode(java.lang.String code) {
		this.code = code;
	}

	public java.lang.String getSign() {
		return sign;
	}

	public void setSign(java.lang.String sign) {
		this.sign = sign;
	}

	public java.lang.String getControlcode() {
		return controlcode;
	}

	public void setControlcode(java.lang.String controlcode) {
		this.controlcode = controlcode;
	}

	public java.lang.String getDirectiontype() {
		return directiontype;
	}

	public void setDirectiontype(java.lang.String directiontype) {
		this.directiontype = directiontype;
	}

	public java.lang.String getDirectiontypedesc() {
		return directiontypedesc;
	}

	public void setDirectiontypedesc(java.lang.String directiontypedesc) {
		this.directiontypedesc = directiontypedesc;
	}

	public java.lang.String getMonitortype() {
		return monitortype;
	}

	public void setMonitortype(java.lang.String monitortype) {
		this.monitortype = monitortype;
	}

	public java.lang.Long getHighlimit() {
		return highlimit;
	}

	public void setHighlimit(java.lang.Long highlimit) {
		this.highlimit = highlimit;
	}

	public java.lang.Long getLowerlimit() {
		return lowerlimit;
	}

	public void setLowerlimit(java.lang.Long lowerlimit) {
		this.lowerlimit = lowerlimit;
	}

	public java.lang.Long getSignspeedlimit() {
		return signspeedlimit;
	}

	public void setSignspeedlimit(java.lang.Long signspeedlimit) {
		this.signspeedlimit = signspeedlimit;
	}

	public java.lang.Long getWidth() {
		return width;
	}

	public void setWidth(java.lang.Long width) {
		this.width = width;
	}

	public java.lang.String getState() {
		return state;
	}

	public void setState(java.lang.String state) {
		this.state = state;
	}

	public java.lang.String getIssingle() {
		return issingle;
	}

	public void setIssingle(java.lang.String issingle) {
		this.issingle = issingle;
	}

	public java.util.Date getOpendate() {
		return opendate;
	}

	public void setOpendate(java.util.Date opendate) {
		this.opendate = opendate;
	}

	public java.lang.Long getTurespeedlimit() {
		return turespeedlimit;
	}

	public void setTurespeedlimit(java.lang.Long turespeedlimit) {
		this.turespeedlimit = turespeedlimit;
	}

	public java.lang.String getRemark() {
		return remark;
	}

	public void setRemark(java.lang.String remark) {
		this.remark = remark;
	}

	public java.lang.String getDevicerelation() {
		return devicerelation;
	}

	public void setDevicerelation(java.lang.String devicerelation) {
		this.devicerelation = devicerelation;
	}

	public java.lang.Long getControlid() {
		return controlid;
	}

	public void setControlid(java.lang.Long controlid) {
		this.controlid = controlid;
	}

	public java.lang.Integer getDaynocartime() {
		return daynocartime;
	}

	public void setDaynocartime(java.lang.Integer daynocartime) {
		this.daynocartime = daynocartime;
	}

	public java.lang.Integer getNightnocartime() {
		return nightnocartime;
	}

	public void setNightnocartime(java.lang.Integer nightnocartime) {
		this.nightnocartime = nightnocartime;
	}

	public String getLongi() {
		return longi;
	}

	public void setLongi(String longi) {
		this.longi = longi;
	}

	public String getLati() {
		return lati;
	}

	public void setLati(String lati) {
		this.lati = lati;
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	public Device getDevice() {
		return device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
}
