package com.sandeep.dao;

import com.sandeep.entity.User;
import com.sandeep.entity.WordInfo;

public interface IWordInfoDao {

	/**
	 * function for saveOrUpdate a word into table.
	 * @param object
	 */
	void save(Object object);

	/**
	 * function for fetching word with given a word id.
	 * @param id
	 * @return wordInfo
	 */
	WordInfo fetchWordInfoById(long id);

	/**
	 * function for fetching word with given a word.
	 * @param word
	 * @return wordInfo
	 */
	WordInfo fetchWordInfoByName(String word);

	/**
	 * function for fetching a user  by email
	 * @param email of user
	 */
	User fetchUserByEmail(String email);

	/**
	 * function for fetching a user  by userId
	 * @param userId
	 */
	User fetchUserByUserId(Long userId);

}
