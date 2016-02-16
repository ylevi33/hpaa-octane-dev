package com.hp.nga.integrations.dto.causes.impl;

import com.hp.nga.integrations.dto.causes.CIEventCause;
import com.hp.nga.integrations.dto.causes.CIEventCauseType;

/**
 * Created by gullery on 16/02/2016.
 */

public class CIEventCauseImpl implements CIEventCause {
	private CIEventCauseType type;
	private String user;
	private String project;
	private Integer number;
	private CIEventCause[] causes;

	public CIEventCauseType getType() {
		return type;
	}

	public CIEventCause setType(CIEventCauseType type) {
		this.type = type;
		return this;
	}

	public String getUser() {
		return user;
	}

	public CIEventCause setUser(String user) {
		this.user = user;
		return this;
	}

	public String getProject() {
		return project;
	}

	public CIEventCause setProject(String ciJobRefId) {
		this.project = ciJobRefId;
		return this;
	}

	public Integer getNumber() {
		return number;
	}

	public CIEventCause setNumber(Integer number) {
		this.number = number;
		return this;
	}

	public CIEventCause[] getCauses() {
		return causes == null ? new CIEventCause[0] : causes.clone();
	}

	public CIEventCause setCauses(CIEventCause[] causes) {
		this.causes = causes == null ? new CIEventCause[0] : causes.clone();
		return this;
	}
}
