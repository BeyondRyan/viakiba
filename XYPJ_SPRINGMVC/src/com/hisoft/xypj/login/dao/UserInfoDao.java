package com.hisoft.xypj.login.dao;

import java.util.List;

import com.hisoft.xypj.common.bean.DeleteUserBean;
import com.hisoft.xypj.common.bean.UserInfo;

public interface UserInfoDao {
	// ��¼
	public UserInfo getUserInfo(UserInfo u);

	// ����û�
	public int addUserInfo(UserInfo u);

	// ��ѯ�û�
	public List<DeleteUserBean> getUMR();

	// ��ѯ��������Ա
	public List<UserInfo> getPingShenList();

	// ɾ���û�
	public int deleteUser(int userId);
}
