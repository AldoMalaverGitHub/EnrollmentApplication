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
 * Courseclassdetail generated by hbm2java
 */
@Entity
@Table(name = "courseclassdetail", catalog = "db_enrollment")
public class Courseclassdetail implements java.io.Serializable {

	private Long idCourseClassDetail;
	private Courseclass courseclass;
	private String topicName;
	private String topicDetail;
	private String goal;
	private String userCreated;
	private Date dateCreated;
	private Byte status;

	public Courseclassdetail() {
	}

	public Courseclassdetail(Courseclass courseclass, String topicName, String topicDetail, String goal,
			String userCreated, Date dateCreated, Byte status) {
		this.courseclass = courseclass;
		this.topicName = topicName;
		this.topicDetail = topicDetail;
		this.goal = goal;
		this.userCreated = userCreated;
		this.dateCreated = dateCreated;
		this.status = status;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idCourseClassDetail", unique = true, nullable = false)
	public Long getIdCourseClassDetail() {
		return this.idCourseClassDetail;
	}

	public void setIdCourseClassDetail(Long idCourseClassDetail) {
		this.idCourseClassDetail = idCourseClassDetail;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idCourseClass")
	public Courseclass getCourseclass() {
		return this.courseclass;
	}

	public void setCourseclass(Courseclass courseclass) {
		this.courseclass = courseclass;
	}

	@Column(name = "topicName", length = 100)
	public String getTopicName() {
		return this.topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	@Column(name = "topicDetail", length = 65535)
	public String getTopicDetail() {
		return this.topicDetail;
	}

	public void setTopicDetail(String topicDetail) {
		this.topicDetail = topicDetail;
	}

	@Column(name = "goal", length = 65535)
	public String getGoal() {
		return this.goal;
	}

	public void setGoal(String goal) {
		this.goal = goal;
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
