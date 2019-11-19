package com.sandeep.dao.impl;

import com.sandeep.dao.IWordInfoDao;
import com.sandeep.entity.User;
import com.sandeep.entity.WordInfo;
import com.sandeep.utils.SessionUtil;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class WordInfoDaoImpl implements IWordInfoDao {

	@Autowired
	private SessionUtil sessionUtil;

	@Override
	@Transactional
	public void save(Object object) {

		sessionUtil.getSession().saveOrUpdate(object);
	}

	@Override
	@Transactional
	public WordInfo fetchWordInfoById(long id) {

		String str = "from WordInfo where id:= id";
		Query query = sessionUtil.getSession().createQuery(str);
		query.setParameter("id", id);
		return (WordInfo)query.uniqueResult();
	}

	@Override
	@Transactional
	public WordInfo fetchWordInfoByName(String word) {
		String str = "from WordInfo where word =:word";
		Query query = sessionUtil.getSession().createQuery(str);
		query.setParameter("word", word);
		return (WordInfo)query.uniqueResult();
	}

	@Override
	public User fetchUserByEmail(String email) {
		String str = "from User where email =:email";
		Query query = sessionUtil.getSession().createQuery(str);
		query.setParameter("email", email);
		return (User) query.uniqueResult();
	}

	@Override
	public User fetchUserByUserId(Long userId) {
		String str = "from User where id =:id";
		Query query = sessionUtil.getSession().createQuery(str);
		query.setParameter("id", userId);
		return (User) query.uniqueResult();
	}
}
