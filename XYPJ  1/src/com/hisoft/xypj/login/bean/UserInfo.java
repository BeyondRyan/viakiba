package com.hisoft.xypj.login.bean;

import java.io.Serializable;
import java.util.Date;

public class UserInfo implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -847694750637274467L;

	/**
	 * �û�ID
	 */
	private String userId = null;

	/**
	 * �û���
	 */
	private String userName = null;

	/**
	 * ����
	 */
	private String password = null;

	/**
	 * �û�Ȩ��
	 */
	private int userRights = 3;

	/**
	 * ���ۻ���ID
	 */
	private String mechanismId = null;

	/**
	 * ������
	 */
	private String createPerson = null;

	/**
	 * ����ʱ��
	 */
	private Date createTime = null;

	/**
	 * ����ʱ��
	 */
	private Date updateTime = null;

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the userRights
	 */
	public int getUserRights() {
		return userRights;
	}

	/**
	 * @param userRights the userRights to set
	 */
	public void setUserRights(int userRights) {
		this.userRights = userRights;
	}

	/**
	 * @return the mechanismId
	 */
	public String getMechanismId() {
		return mechanismId;
	}

	/**
	 * @param mechanismId the mechanismId to set
	 */
	public void setMechanismId(String mechanismId) {
		this.mechanismId = mechanismId;
	}

	/**
	 * @return the createPerson
	 */
	public String getCreatePerson() {
		return createPerson;
	}

	/**
	 * @param createPerson the createPerson to set
	 */
	public void setCreatePerson(String createPerson) {
		this.createPerson = createPerson;
	}

	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * @return the updateTime
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * @param updateTime the updateTime to set
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
