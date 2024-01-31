package com.sona.biz.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ReservationDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;

}
