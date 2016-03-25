package cn.com.jandar.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Table(name = "vehicle")
@Entity
public class Vehicle implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID", nullable = false, length = 18)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_vehicle_sequence")
	@SequenceGenerator(name = "seq_vehicle_sequence", sequenceName = "seq_vehicle_sequence", allocationSize = 1)
	private java.lang.Long id;

	@Column(name = "VEHICLECODE", length = 255)
	private java.lang.String vehiclecode;

	@Column(name = "DEVICETYPE", length = 255)
	private java.lang.String devicetype;

	@Column(name = "LICENSE", length = 255)
	private java.lang.String license;

	@Column(name = "LICENSE1", length = 255)
	private java.lang.String license1;

	@Column(name = "LICENSE2", length = 255)
	private java.lang.String license2;

	@Column(name = "CARTYPE", length = 255)
	private java.lang.String cartype;

	@Column(name = "LICENSETYPE", length = 255)
	private java.lang.String licensetype;

	@Column(name = "LICENSECOLOR", length = 255)
	private java.lang.String licensecolor;

	@Column(name = "LICENSEBGCOLOR", length = 255)
	private java.lang.String licensebgcolor;

	@Column(name = "CARBRAND", length = 255)
	private java.lang.String carbrand;

	@Column(name = "CARMODEL", length = 255)
	private java.lang.String carmodel;

	@Column(name = "CARCOLOR", length = 255)
	private java.lang.String carcolor;

	@Column(name = "CARLENGTH", length = 255)
	private java.lang.String carlength;

	@Column(name = "SPEED", length = 255)
	private java.lang.String speed;

	@Column(name = "DIRECTION", length = 255)
	private java.lang.String direction;

	@Column(name = "PASSDATETIME")
	private java.util.Date passdatetime;

	@Column(name = "ISVIOLATION", length = 255)
	private java.lang.String isviolation;

	@Column(name = "VIOLATIONTYPE", length = 255)
	private java.lang.String violationtype;

	@Column(name = "VIOLATIONTYPE2", length = 255)
	private java.lang.String violationtype2;

	@Column(name = "PIC1", length = 255)
	private java.lang.String pic1;

	@Column(name = "PIC2", length = 255)
	private java.lang.String pic2;

	@Column(name = "PIC3", length = 255)
	private java.lang.String pic3;

	@Column(name = "PIC4", length = 255)
	private java.lang.String pic4;

	@Column(name = "PIC5", length = 255)
	private java.lang.String pic5;

	@Column(name = "PIC6", length = 255)
	private java.lang.String pic6;

	@Column(name = "PIC7", length = 255)
	private java.lang.String pic7;

	@Column(name = "PIC8", length = 255)
	private java.lang.String pic8;

	@Column(name = "PIC9", length = 255)
	private java.lang.String pic9;

	@Column(name = "VIDEO1", length = 255)
	private java.lang.String video1;

	@Column(name = "VIDEO2", length = 255)
	private java.lang.String video2;

	@Column(name = "REMARK", length = 255)
	private java.lang.String remark;

	@Column(name = "ISSYN", length = 255)
	private java.lang.String issyn;

	@Column(name = "HASLICENSE", length = 1)
	private java.lang.String haslicense;

	@Column(name = "ISMOTORVEHICLE", length = 1)
	private java.lang.String ismotorvehicle;

	@Column(name = "SPIC1", length = 255)
	private java.lang.String spic1;

	@Column(name = "SPIC2", length = 255)
	private java.lang.String spic2;

	@Column(name = "SPIC3", length = 255)
	private java.lang.String spic3;

	@Column(name = "SPIC4", length = 255)
	private java.lang.String spic4;

	@Column(name = "SPIC5", length = 255)
	private java.lang.String spic5;

	@Column(name = "SPIC6", length = 255)
	private java.lang.String spic6;

	@Column(name = "SPIC7", length = 255)
	private java.lang.String spic7;

	@Column(name = "SPIC8", length = 255)
	private java.lang.String spic8;

	@Column(name = "OPIC8", length = 255)
	private java.lang.String opic8;

	@Column(name = "ISSMALLIMAGE", length = 10)
	private java.lang.String issmallimage;

	@Column(name = "SAVEDATETIME")
	private java.util.Date saveDateTime;

	@Column(name = "ISTIMERIGHT", length = 10)
	private java.lang.String istimeright;

	@Column(name = "ISCONTROLCAR", length = 10)
	private java.lang.String iscontrolcar;

	@Column(name = "ISDOWNLOAD", length = 1)
	private java.lang.String isdownload;

	@Column(name = "DOWNLOADDATE")
	private java.util.Date downloaddate;

	@Column(name = "ISHANDLE", length = 1)
	private java.lang.String ishandle;

	@Column(name = "ISSEND", length = 1)
	private java.lang.String issend;

	@Column(name = "ISMONGO", length = 1)
	private java.lang.String ismongo;

	// 页面参数
	@Transient
	private String town;// 镇

	@Transient
	private String areatypevalue;// 区域类型

	@Transient
	private String areaidvalue;// 区域名称--id

	// 案发地点时间与逃离地点时间差
	@Transient
	private java.lang.Long timeDiff;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DRIVEID", referencedColumnName = "CODE")
	private Driveway driveway;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DEVICEID", referencedColumnName = "CODE")
	private Device device;

	public java.lang.Long getId() {
		return id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getVehiclecode() {
		return vehiclecode;
	}

	public void setVehiclecode(java.lang.String vehiclecode) {
		this.vehiclecode = vehiclecode;
	}

	public java.lang.String getDevicetype() {
		return devicetype;
	}

	public void setDevicetype(java.lang.String devicetype) {
		this.devicetype = devicetype;
	}

	public java.lang.String getLicense() {
		return license;
	}

	public void setLicense(java.lang.String license) {
		this.license = license;
	}

	public java.lang.String getLicense1() {
		return license1;
	}

	public void setLicense1(java.lang.String license1) {
		this.license1 = license1;
	}

	public java.lang.String getLicense2() {
		return license2;
	}

	public void setLicense2(java.lang.String license2) {
		this.license2 = license2;
	}

	public java.lang.String getCartype() {
		return cartype;
	}

	public void setCartype(java.lang.String cartype) {
		this.cartype = cartype;
	}

	public java.lang.String getLicensetype() {
		return licensetype;
	}

	public void setLicensetype(java.lang.String licensetype) {
		this.licensetype = licensetype;
	}

	public java.lang.String getLicensecolor() {
		return licensecolor;
	}

	public void setLicensecolor(java.lang.String licensecolor) {
		this.licensecolor = licensecolor;
	}

	public java.lang.String getLicensebgcolor() {
		return licensebgcolor;
	}

	public void setLicensebgcolor(java.lang.String licensebgcolor) {
		this.licensebgcolor = licensebgcolor;
	}

	public java.lang.String getCarbrand() {
		return carbrand;
	}

	public void setCarbrand(java.lang.String carbrand) {
		this.carbrand = carbrand;
	}

	public java.lang.String getCarmodel() {
		return carmodel;
	}

	public void setCarmodel(java.lang.String carmodel) {
		this.carmodel = carmodel;
	}

	public java.lang.String getCarcolor() {
		return carcolor;
	}

	public void setCarcolor(java.lang.String carcolor) {
		this.carcolor = carcolor;
	}

	public java.lang.String getCarlength() {
		return carlength;
	}

	public void setCarlength(java.lang.String carlength) {
		this.carlength = carlength;
	}

	public java.lang.String getSpeed() {
		return speed;
	}

	public void setSpeed(java.lang.String speed) {
		this.speed = speed;
	}

	public java.lang.String getDirection() {
		return direction;
	}

	public void setDirection(java.lang.String direction) {
		this.direction = direction;
	}

	public java.util.Date getPassdatetime() {
		return passdatetime;
	}

	public void setPassdatetime(java.util.Date passdatetime) {
		this.passdatetime = passdatetime;
	}

	public java.lang.String getIsviolation() {
		return isviolation;
	}

	public void setIsviolation(java.lang.String isviolation) {
		this.isviolation = isviolation;
	}

	public java.lang.String getViolationtype() {
		return violationtype;
	}

	public void setViolationtype(java.lang.String violationtype) {
		this.violationtype = violationtype;
	}

	public java.lang.String getViolationtype2() {
		return violationtype2;
	}

	public void setViolationtype2(java.lang.String violationtype2) {
		this.violationtype2 = violationtype2;
	}

	public java.lang.String getPic1() {
		return pic1;
	}

	public void setPic1(java.lang.String pic1) {
		this.pic1 = pic1;
	}

	public java.lang.String getPic2() {
		return pic2;
	}

	public void setPic2(java.lang.String pic2) {
		this.pic2 = pic2;
	}

	public java.lang.String getPic3() {
		return pic3;
	}

	public void setPic3(java.lang.String pic3) {
		this.pic3 = pic3;
	}

	public java.lang.String getPic4() {
		return pic4;
	}

	public void setPic4(java.lang.String pic4) {
		this.pic4 = pic4;
	}

	public java.lang.String getPic5() {
		return pic5;
	}

	public void setPic5(java.lang.String pic5) {
		this.pic5 = pic5;
	}

	public java.lang.String getPic6() {
		return pic6;
	}

	public void setPic6(java.lang.String pic6) {
		this.pic6 = pic6;
	}

	public java.lang.String getPic7() {
		return pic7;
	}

	public void setPic7(java.lang.String pic7) {
		this.pic7 = pic7;
	}

	public java.lang.String getPic8() {
		return pic8;
	}

	public void setPic8(java.lang.String pic8) {
		this.pic8 = pic8;
	}

	public java.lang.String getPic9() {
		return pic9;
	}

	public void setPic9(java.lang.String pic9) {
		this.pic9 = pic9;
	}

	public java.lang.String getVideo1() {
		return video1;
	}

	public void setVideo1(java.lang.String video1) {
		this.video1 = video1;
	}

	public java.lang.String getVideo2() {
		return video2;
	}

	public void setVideo2(java.lang.String video2) {
		this.video2 = video2;
	}

	public java.lang.String getRemark() {
		return remark;
	}

	public void setRemark(java.lang.String remark) {
		this.remark = remark;
	}

	public java.lang.String getIssyn() {
		return issyn;
	}

	public void setIssyn(java.lang.String issyn) {
		this.issyn = issyn;
	}

	public java.lang.String getHaslicense() {
		return haslicense;
	}

	public void setHaslicense(java.lang.String haslicense) {
		this.haslicense = haslicense;
	}

	public java.lang.String getIsmotorvehicle() {
		return ismotorvehicle;
	}

	public void setIsmotorvehicle(java.lang.String ismotorvehicle) {
		this.ismotorvehicle = ismotorvehicle;
	}

	public java.lang.String getSpic1() {
		return spic1;
	}

	public void setSpic1(java.lang.String spic1) {
		this.spic1 = spic1;
	}

	public java.lang.String getSpic2() {
		return spic2;
	}

	public void setSpic2(java.lang.String spic2) {
		this.spic2 = spic2;
	}

	public java.lang.String getSpic3() {
		return spic3;
	}

	public void setSpic3(java.lang.String spic3) {
		this.spic3 = spic3;
	}

	public java.lang.String getSpic4() {
		return spic4;
	}

	public void setSpic4(java.lang.String spic4) {
		this.spic4 = spic4;
	}

	public java.lang.String getSpic5() {
		return spic5;
	}

	public void setSpic5(java.lang.String spic5) {
		this.spic5 = spic5;
	}

	public java.lang.String getSpic6() {
		return spic6;
	}

	public void setSpic6(java.lang.String spic6) {
		this.spic6 = spic6;
	}

	public java.lang.String getSpic7() {
		return spic7;
	}

	public void setSpic7(java.lang.String spic7) {
		this.spic7 = spic7;
	}

	public java.lang.String getSpic8() {
		return spic8;
	}

	public void setSpic8(java.lang.String spic8) {
		this.spic8 = spic8;
	}

	public java.lang.String getOpic8() {
		return opic8;
	}

	public void setOpic8(java.lang.String opic8) {
		this.opic8 = opic8;
	}

	public java.lang.String getIssmallimage() {
		return issmallimage;
	}

	public void setIssmallimage(java.lang.String issmallimage) {
		this.issmallimage = issmallimage;
	}

	public java.util.Date getSaveDateTime() {
		return saveDateTime;
	}

	public void setSaveDateTime(java.util.Date saveDateTime) {
		this.saveDateTime = saveDateTime;
	}

	public java.lang.String getIstimeright() {
		return istimeright;
	}

	public void setIstimeright(java.lang.String istimeright) {
		this.istimeright = istimeright;
	}

	public java.lang.String getIscontrolcar() {
		return iscontrolcar;
	}

	public void setIscontrolcar(java.lang.String iscontrolcar) {
		this.iscontrolcar = iscontrolcar;
	}

	public java.lang.String getIsdownload() {
		return isdownload;
	}

	public void setIsdownload(java.lang.String isdownload) {
		this.isdownload = isdownload;
	}

	public java.util.Date getDownloaddate() {
		return downloaddate;
	}

	public void setDownloaddate(java.util.Date downloaddate) {
		this.downloaddate = downloaddate;
	}

	public java.lang.String getIshandle() {
		return ishandle;
	}

	public void setIshandle(java.lang.String ishandle) {
		this.ishandle = ishandle;
	}

	public java.lang.String getIssend() {
		return issend;
	}

	public void setIssend(java.lang.String issend) {
		this.issend = issend;
	}

	public java.lang.String getIsmongo() {
		return ismongo;
	}

	public void setIsmongo(java.lang.String ismongo) {
		this.ismongo = ismongo;
	}

	public java.lang.Long getTimeDiff() {
		return timeDiff;
	}

	public void setTimeDiff(java.lang.Long timeDiff) {
		this.timeDiff = timeDiff;
	}

	public Driveway getDriveway() {
		return driveway;
	}

	public void setDriveway(Driveway driveway) {
		this.driveway = driveway;
	}

	public Device getDevice() {
		return device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getAreatypevalue() {
		return areatypevalue;
	}

	public void setAreatypevalue(String areatypevalue) {
		this.areatypevalue = areatypevalue;
	}

	public String getAreaidvalue() {
		return areaidvalue;
	}

	public void setAreaidvalue(String areaidvalue) {
		this.areaidvalue = areaidvalue;
	}
}
