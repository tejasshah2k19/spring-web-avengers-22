package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.UserBean;
@Repository
public class UserDao {

	@Autowired
	JdbcTemplate stmt; // new

	public void insertUser(UserBean user) {
		stmt.update("insert into users (firstname,email,password) values (?,?,?)", user.getFirstName(), user.getEmail(),
				user.getPassword());// insert update delete
	}

	public List<UserBean> getAllUsers() {
		List<UserBean> users = stmt.query("select * from users", new BeanPropertyRowMapper<UserBean>(UserBean.class));
		return users;
	}

	public void deleteUser(int userId) {
		stmt.update("delete from users where userid = ?",userId);
	}
}
