package com.example.bug.entity;

import java.sql.Timestamp;

public class Detail {

	private int id,projectId,severity,search;
	private String title,reportUser;
	private Timestamp createDate;
	private User user;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public int getSeverity() {
		return severity;
	}
	public void setSeverity(int severity) {
		this.severity = severity;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getReportUser() {
		return reportUser;
	}
	public void setReportUser(String reportUser) {
		this.reportUser = reportUser;
	}
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
	
	public int getSearch() {
		return search;
	}
	public void setSearch(int search) {
		this.search = search;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Detail [id=" + id + ", projectId=" + projectId + ", severity=" + severity + ", search=" + search
				+ ", title=" + title + ", reportUser=" + reportUser + ", createDate=" + createDate + ", user=" + user
				+ "]";
	}
	
}
