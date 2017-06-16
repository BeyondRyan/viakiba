package com.hisoft.xypj.login.bean;

import java.io.Serializable;
import java.util.Date;

public class EvaluationStatus implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -682496665821201136L;

	/**
	 * id
	 */
	private String id = null;
	
	/**
	 * ����ID
	 */
	private String mechanismId = null;
	
	/**
	 * ������
	 */
	private String mechanismName = null;
	
	/**
	 * ��ҵID
	 */
	private String enterpriseId = null;
	
	/**
	 * ��ҵ��
	 */
	private String enterpriseName = null;
	
	/**
	 * ������
	 */
	private String evaluationPersonId = null;

	/**
	 * ��������
	 */
	private String evaluationPersonName = null;
	
	/**
	 * ��������
	 */
	private Date evaluationDate = null;
	
	/**
	 * ����״̬
	 */
	private String evaluationStatus = null;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
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
	 * @return the enterpriseId
	 */
	public String getEnterpriseId() {
		return enterpriseId;
	}

	/**
	 * @param enterpriseId the enterpriseId to set
	 */
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	/**
	 * @return the evaluationPersonId
	 */
	public String getEvaluationPersonId() {
		return evaluationPersonId;
	}

	/**
	 * @param evaluationPersonId the evaluationPersonId to set
	 */
	public void setEvaluationPersonId(String evaluationPersonId) {
		this.evaluationPersonId = evaluationPersonId;
	}

	/**
	 * @return the evaluationDate
	 */
	public Date getEvaluationDate() {
		return evaluationDate;
	}

	/**
	 * @param evaluationDate the evaluationDate to set
	 */
	public void setEvaluationDate(Date evaluationDate) {
		this.evaluationDate = evaluationDate;
	}

	/**
	 * @return the evaluationStatus
	 */
	public String getEvaluationStatus() {
		return evaluationStatus;
	}

	/**
	 * @param evaluationStatus the evaluationStatus to set
	 */
	public void setEvaluationStatus(String evaluationStatus) {
		this.evaluationStatus = evaluationStatus;
	}

	/**
	 * @return the mechanismName
	 */
	public String getMechanismName() {
		return mechanismName;
	}

	/**
	 * @param mechanismName the mechanismName to set
	 */
	public void setMechanismName(String mechanismName) {
		this.mechanismName = mechanismName;
	}

	/**
	 * @return the enterpriseName
	 */
	public String getEnterpriseName() {
		return enterpriseName;
	}

	/**
	 * @param enterpriseName the enterpriseName to set
	 */
	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	/**
	 * @return the evaluationPersonName
	 */
	public String getEvaluationPersonName() {
		return evaluationPersonName;
	}

	/**
	 * @param evaluationPersonName the evaluationPersonName to set
	 */
	public void setEvaluationPersonName(String evaluationPersonName) {
		this.evaluationPersonName = evaluationPersonName;
	}

}
