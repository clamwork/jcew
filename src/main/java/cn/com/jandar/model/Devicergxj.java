package cn.com.jandar.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "device_rgxj")
public class Devicergxj implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID", nullable = false, length = 18)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq_devicergxj_sequence")
	@SequenceGenerator(name="seq_devicergxj_sequence",sequenceName="seq_devicergxj_sequence",allocationSize=1)
	private java.lang.Long id;
	
	@Column(name = "GCTP", length = 255)
	private String gctp;		//过车图片

	@Column(name = "GCSJ_DATE")
	private Date gcsj_date;		//过车时间
	
	@Column(name = "OCCURDATE")
	private Date occurdate;		//过车时间

	@Column(name = "CQSJ_DATE")
	private Date cqsj_date;		//抽取时间
	
	@Column(name = "CZR", length = 20)
	private String czr;			//操作人
	
	@Column(name = "HASREPORT", length = 1)
	private String hasreport;	//车道是否报修
	
	@Column(name = "POINT_CODE", length = 20)
	private String pointcode;
	
	@Column(name = "CONTROL_CODE", length = 30)
	private String controlcode;
	
	@Column(name = "POINT_NAME", length = 40)
	private String pointname;
	
	@Column(name = "CONTROL_DIRECTION", length = 20)
	private String controldirection;
	
	@Column(name = "VEHICLE_ID", length = 19)
	private Long vehicleid;
	
	@Column(name = "FAULTTYPE", length = 40)
	private String faulttype;		//故障类型
	
	@Column(name = "FAULTEXPLAIN", length = 200)
	private String faultexplain;	//故障详细原因
	
	@Column(name = "ISAMEDEVICE", length = 1)//同设备
	private String isamedevice;
	
	@Column(name = "ISAMEPOINT", length = 1)//同点位
	private String isamepoint;
	
	@Column(name = "ISFAULT")
	private String isfault;
	
	@Column(name = "FAULTHOURS")
	private Integer faultHours;
	
	@ManyToOne()
	@JoinColumn(name="SSCD_ID")
	private Driveway driveway;
	
	@ManyToOne()
	@JoinColumn(name="POINTID")
	private Point point;

	public java.lang.Long getId() {
		return id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public String getGctp() {
		return gctp;
	}

	public void setGctp(String gctp) {
		this.gctp = gctp;
	}

	public Date getGcsj_date() {
		return gcsj_date;
	}

	public void setGcsj_date(Date gcsj_date) {
		this.gcsj_date = gcsj_date;
	}

	public Date getOccurdate() {
		return occurdate;
	}

	public void setOccurdate(Date occurdate) {
		this.occurdate = occurdate;
	}

	public Date getCqsj_date() {
		return cqsj_date;
	}

	public void setCqsj_date(Date cqsj_date) {
		this.cqsj_date = cqsj_date;
	}

	public String getCzr() {
		return czr;
	}

	public void setCzr(String czr) {
		this.czr = czr;
	}

	public String getHasreport() {
		return hasreport;
	}

	public void setHasreport(String hasreport) {
		this.hasreport = hasreport;
	}

	public String getPointcode() {
		return pointcode;
	}

	public void setPointcode(String pointcode) {
		this.pointcode = pointcode;
	}

	public String getControlcode() {
		return controlcode;
	}

	public void setControlcode(String controlcode) {
		this.controlcode = controlcode;
	}

	public String getPointname() {
		return pointname;
	}

	public void setPointname(String pointname) {
		this.pointname = pointname;
	}

	public String getControldirection() {
		return controldirection;
	}

	public void setControldirection(String controldirection) {
		this.controldirection = controldirection;
	}

	public Long getVehicleid() {
		return vehicleid;
	}

	public void setVehicleid(Long vehicleid) {
		this.vehicleid = vehicleid;
	}

	public String getFaulttype() {
		return faulttype;
	}

	public void setFaulttype(String faulttype) {
		this.faulttype = faulttype;
	}

	public String getFaultexplain() {
		return faultexplain;
	}

	public void setFaultexplain(String faultexplain) {
		this.faultexplain = faultexplain;
	}

	public String getIsamedevice() {
		return isamedevice;
	}

	public void setIsamedevice(String isamedevice) {
		this.isamedevice = isamedevice;
	}

	public String getIsamepoint() {
		return isamepoint;
	}

	public void setIsamepoint(String isamepoint) {
		this.isamepoint = isamepoint;
	}

	public String getIsfault() {
		return isfault;
	}

	public void setIsfault(String isfault) {
		this.isfault = isfault;
	}

	public Integer getFaultHours() {
		return faultHours;
	}

	public void setFaultHours(Integer faultHours) {
		this.faultHours = faultHours;
	}

	public Driveway getDriveway() {
		return driveway;
	}

	public void setDriveway(Driveway driveway) {
		this.driveway = driveway;
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}
}
