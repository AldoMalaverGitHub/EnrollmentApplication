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
 * Courseclassattendance generated by hbm2java
 */
@Entity
@Table(name = "courseclassattendance", catalog = "db_enrollment")
public class Courseclassattendance implements java.io.Serializable {

	private Long idCourseClassAttendance;
	private Enrollmentcourseclass enrollmentcourseclass;
	private Short attendanceType;
	private String userCreated;
	private Date dateCreated;
	private Byte status;

	public Courseclassattendance() {
	}

	public Courseclassattendance(Enrollmentcourseclass enrollmentcourseclass, Short attendanceType, String userCreated,
			Date dateCreated, Byte status) {
		this.enrollmentcourseclass = enrollmentcourseclass;
		this.attendanceType = attendanceType;
		this.userCreated = userCreated;
		this.dateCreated = dateCreated;
		this.status = status;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idCourseClassAttendance", unique = true, nullable = false)
	public Long getIdCourseClassAttendance() {
		return this.idCourseClassAttendance;
	}

	public void setIdCourseClassAttendance(Long idCourseClassAttendance) {
		this.idCourseClassAttendance = idCourseClassAttendance;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idEnrollmentCourseClass")
	public Enrollmentcourseclass getEnrollmentcourseclass() {
		return this.enrollmentcourseclass;
	}

	public void setEnrollmentcourseclass(Enrollmentcourseclass enrollmentcourseclass) {
		this.enrollmentcourseclass = enrollmentcourseclass;
	}

	@Column(name = "attendanceType")
	public Short getAttendanceType() {
		return this.attendanceType;
	}

	public void setAttendanceType(Short attendanceType) {
		this.attendanceType = attendanceType;
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