package com.amalaver.enrollment.data.entities;
// Generated 30 mar. 2020 23:37:56 by Hibernate Tools 5.2.12.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Enrollmentdetailschedule generated by hbm2java
 */
@Entity
@Table(name = "enrollmentdetailschedule", catalog = "db_enrollment")
public class Enrollmentdetailschedule implements java.io.Serializable {

	private Long idEnrollmentDetailSchedule;
	private Enrollmentdetail enrollmentdetail;
	private Date scheduleDate;
	private Date startHour;
	private Date endHour;
	private Short numberOfHours;
	private String userCreated;
	private Date dateCreated;
	private Byte status;

	public Enrollmentdetailschedule() {
	}

	public Enrollmentdetailschedule(Enrollmentdetail enrollmentdetail, Date scheduleDate, Date startHour, Date endHour,
			Short numberOfHours, String userCreated, Date dateCreated, Byte status) {
		this.enrollmentdetail = enrollmentdetail;
		this.scheduleDate = scheduleDate;
		this.startHour = startHour;
		this.endHour = endHour;
		this.numberOfHours = numberOfHours;
		this.userCreated = userCreated;
		this.dateCreated = dateCreated;
		this.status = status;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idEnrollmentDetailSchedule", unique = true, nullable = false)
	public Long getIdEnrollmentDetailSchedule() {
		return this.idEnrollmentDetailSchedule;
	}

	public void setIdEnrollmentDetailSchedule(Long idEnrollmentDetailSchedule) {
		this.idEnrollmentDetailSchedule = idEnrollmentDetailSchedule;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idEnrollmentDetail")
	public Enrollmentdetail getEnrollmentdetail() {
		return this.enrollmentdetail;
	}

	public void setEnrollmentdetail(Enrollmentdetail enrollmentdetail) {
		this.enrollmentdetail = enrollmentdetail;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "scheduleDate", length = 10)
	public Date getScheduleDate() {
		return this.scheduleDate;
	}

	public void setScheduleDate(Date scheduleDate) {
		this.scheduleDate = scheduleDate;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "startHour", length = 8)
	public Date getStartHour() {
		return this.startHour;
	}

	public void setStartHour(Date startHour) {
		this.startHour = startHour;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "endHour", length = 8)
	public Date getEndHour() {
		return this.endHour;
	}

	public void setEndHour(Date endHour) {
		this.endHour = endHour;
	}

	@Column(name = "numberOfHours")
	public Short getNumberOfHours() {
		return this.numberOfHours;
	}

	public void setNumberOfHours(Short numberOfHours) {
		this.numberOfHours = numberOfHours;
	}

	@Column(name = "userCreated", length = 100)
	public String getUserCreated() {
		return this.userCreated;
	}

	public void setUserCreated(String userCreated) {
		this.userCreated = userCreated;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dateCreated", length = 19)
	public Date getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	@Column(name = "status")
	public Byte getStatus() {
		return this.status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

}
