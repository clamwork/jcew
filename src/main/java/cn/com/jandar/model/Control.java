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


@Table(name = "control")
@Entity
public class Control implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID", nullable = false, length = 18)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq_control_sequence")
	@SequenceGenerator(name="seq_control_sequence",sequenceName="seq_control_sequence",allocationSize=1)
	private java.lang.Long id;
	
	@Column(name = "NAME",length = 40)
	private java.lang.String name;

	@Column(name = "CODE",length = 30)
	private java.lang.String code;

	@Column(name = "TYPE",length = 20)
	private java.lang.String type;

	@Column(name = "CONTROL_WIDTH")
	private double controlwidth;

	@Column(name = "WIDTH")
	private double width;

	@Column(name = "DIRECTION",length = 20)
	private java.lang.String direction;

	@Column(name = "LATI",length = 30)
	private java.lang.String lati;

	@Column(name = "LONGI",length = 30)
	private java.lang.String longi;

	@Column(name = "REMARK",length = 300)
	private java.lang.String remark;
	
	@Column(name = "DRIVEWAYCOUNT")
	private java.lang.Integer drivewaycount;
	
	@Column(name = "STATE", length = 1)
	private java.lang.String state;
 	
	@ManyToOne()
	@JoinColumn(name = "POINTID")
	private Point point;
	
	@OneToMany(mappedBy="control",fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private List<Device> devices = new ArrayList<Device>();  //摄像机

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

	public double getControlwidth() {
		return controlwidth;
	}

	public void setControlwidth(double controlwidth) {
		this.controlwidth = controlwidth;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public java.lang.String getDirection() {
		return direction;
	}

	public void setDirection(java.lang.String direction) {
		this.direction = direction;
	}

	public java.lang.String getLati() {
		return lati;
	}

	public void setLati(java.lang.String lati) {
		this.lati = lati;
	}

	public java.lang.String getLongi() {
		return longi;
	}

	public void setLongi(java.lang.String longi) {
		this.longi = longi;
	}

	public java.lang.String getRemark() {
		return remark;
	}

	public void setRemark(java.lang.String remark) {
		this.remark = remark;
	}

	public java.lang.Integer getDrivewaycount() {
		return drivewaycount;
	}

	public void setDrivewaycount(java.lang.Integer drivewaycount) {
		this.drivewaycount = drivewaycount;
	}

	public java.lang.String getState() {
		return state;
	}

	public void setState(java.lang.String state) {
		this.state = state;
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	public List<Device> getDevices() {
		return devices;
	}

	public void setDevices(List<Device> devices) {
		this.devices = devices;
	}
}
