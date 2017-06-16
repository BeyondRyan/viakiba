package com.hisoft.xypj.login.dao;

import java.util.List;

import com.hisoft.xypj.common.bean.Mechanism;

public interface MechanismDao {
	public List<Mechanism> selectMechanism();

	// ��ӻ�����Ϣ
	public int addMechanism(Mechanism mech);

	// ��ѯ������Ϣ
	public List<Mechanism> getMechanism();

	// ɾ��������Ϣ
	public int deleteMech(String id);
}
