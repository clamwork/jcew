package cn.com.jandar.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * 故障信息表
 */
@Table(name = "devicefault")
@Entity
public class Devicefault implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID", nullable = false, length = 18)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq_devicefault_sequence")
	@SequenceGenerator(name="seq_devicefault_sequence",sequenceName="seq_devicefault_sequence",allocationSize=1)
	private java.lang.Long id;

	@ManyToOne()
	@JoinColumn(name = "DEVICEID")
	private Device device;

	@ManyToOne()
	@JoinColumn(name = "DRIVEWAYID")
	private Driveway driveway;

	@ManyToOne()
	@JoinColumn(name = "POINTID")
	private Point point;

	@Column(name = "TYPE", length = 40)
	private java.lang.String type; // 设备故障类型

	@Column(name = "SOURCE", length = 20)
	private java.lang.String source; // 设备故障来源

	@Column(name = "HANDLER", length = 20)
	private java.lang.String khandler;

	@Column(name = "HANDLERDEPT", length = 50)
	private java.lang.String khandlerdept;

	@Column(name = "OCCURDATE")
	private java.util.Date occurdate; // 故障发生时间

	@Column(name = "FAULTEXPLAIN", length = 200)
	private java.lang.String faultexplain; // 故障详细原因

	@Column(name = "HANDLEDATE")
	private java.util.Date handlerdate; // 故障处理时间

	@Column(name = "FINISHDATE")
	private java.util.Date finishdate; // 故障解决时间

	@Column(name = "RECOVERYDATE")
	private java.util.Date recoverydate; // 设备恢复时间

	@Column(name = "REPAIREXPLAIN", length = 200)
	private java.lang.String repairexplain; // 故障详细原因

	@Column(name = "STATUS", length = 10)
	private java.lang.String status; // 状态

	@Column(name = "FAILUREDURATION")
	private java.lang.Float failureduration; // 故障处理时长

	@Column(name = "SMSSENDTIME")
	private java.util.Date smssendtime; // 短信发送时间

	@Column(name = "CAUSE", length = 1)
	private java.lang.String cause; // 故障引起（0非设备，1设备）
	
	@Column(name = "VERIFIER", length = 20)
	private java.lang.String verifier;			//故障确认人
	
	@Column(name = "CHECKTIME")
	private java.util.Date checktime;	//故障确认时间

	public java.lang.Long getId() {
		return id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public Device getDevice() {
		return device;
	}

	public void setDevice(Device device) {
		this.device = device;
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

	public java.lang.String getKhandler() {
		return khandler;
	}

	public void setKhandler(java.lang.String khandler) {
		this.khandler = khandler;
	}

	public java.lang.String getKhandlerdept() {
		return khandlerdept;
	}

	public void setKhandlerdept(java.lang.String khandlerdept) {
		this.khandlerdept = khandlerdept;
	}

	public java.util.Date getOccurdate() {
		return occurdate;
	}

	public void setOccurdate(java.util.Date occurdate) {
		this.occurdate = occurdate;
	}

	public java.lang.String getFaultexplain() {
		return faultexplain;
	}

	public void setFaultexplain(java.lang.String faultexplain) {
		this.faultexplain = faultexplain;
	}

	public java.util.Date getHandlerdate() {
		return handlerdate;
	}

	public void setHandlerdate(java.util.Date handlerdate) {
		this.handlerdate = handlerdate;
	}

	public java.util.Date getFinishdate() {
		return finishdate;
	}

	public void setFinishdate(java.util.Date finishdate) {
		this.finishdate = finishdate;
	}

	public java.util.Date getRecoverydate() {
		return recoverydate;
	}

	public void setRecoverydate(java.util.Date recoverydate) {
		this.recoverydate = recoverydate;
	}

	public java.lang.String getRepairexplain() {
		return repairexplain;
	}

	public void setRepairexplain(java.lang.String repairexplain) {
		this.repairexplain = repairexplain;
	}

	public java.lang.String getStatus() {
		return status;
	}

	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	public java.lang.Float getFailureduration() {
		return failureduration;
	}

	public void setFailureduration(java.lang.Float failureduration) {
		this.failureduration = failureduration;
	}

	public java.util.Date getSmssendtime() {
		return smssendtime;
	}

	public void setSmssendtime(java.util.Date smssendtime) {
		this.smssendtime = smssendtime;
	}

	public java.lang.String getCause() {
		return cause;
	}

	public void setCause(java.lang.String cause) {
		this.cause = cause;
	}

	public java.lang.String getVerifier() {
		return verifier;
	}

	public void setVerifier(java.lang.String verifier) {
		this.verifier = verifier;
	}

	public java.util.Date getChecktime() {
		return checktime;
	}

	public void setChecktime(java.util.Date checktime) {
		this.checktime = checktime;
	}
}
