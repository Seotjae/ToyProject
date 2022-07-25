package com.toy.blog.service.users;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toy.blog.dao.users.UserRegDao;

@Service
public class UserRegService {
	@Autowired UserRegDao userRegDao;
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public String inPage() {
		logger.info("[로거] 회원가입 Service");
		
		return userRegDao.inPage();
	}
}
