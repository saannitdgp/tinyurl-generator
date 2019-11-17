package com.sandeep.dao;

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
}
