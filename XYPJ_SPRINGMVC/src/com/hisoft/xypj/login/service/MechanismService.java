package com.hisoft.xypj.login.service;

import java.util.List;

import com.hisoft.xypj.common.bean.Mechanism;

public interface MechanismService {
	public List<Mechanism> selectMechanism();

	// ��ѯ������Ϣ
	public List<Mechanism> getMechanism();

	// ��ӻ�����Ϣ
	public int addMechanism(Mechanism mech);

	// ɾ��������Ϣ
	public int deleteMech(String id);
}
