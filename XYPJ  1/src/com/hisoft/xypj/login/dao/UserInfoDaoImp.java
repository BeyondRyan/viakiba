package com.hisoft.xypj.login.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.hisoft.xypj.login.bean.UserInfo;

public class UserInfoDaoImp extends SqlSessionDaoSupport implements UserInfoDao {



	@Override
	public UserInfo getUserInfo(UserInfo user) {

		// ��ѯ�û���
		return super.getSqlSession().selectOne("User.getUserInfo", user);
	}

	@Override
	public List<UserInfo> getUserInfoList(UserInfo user) {
		return super.getSqlSession().selectList("User.getUserInfoList", user);
	}

	
}
