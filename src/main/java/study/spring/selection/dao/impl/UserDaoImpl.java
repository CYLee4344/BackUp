package study.spring.selection.dao.impl;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import study.spring.selection.dao.UserDao;
import study.spring.selection.model.User;

@Service
public class UserDaoImpl implements UserDao {
	
	@Autowired
	SqlSession sqlSession;
	
	@Override
	public void register(User user) throws Exception {
		
		sqlSession.insert("UserMapper.register", user);
	}

	@Override
	public User login(User user) throws Exception {
	
		return sqlSession.selectOne("UserMapper.login", user);
	}

	@Override
	public void userDelete(User user) throws Exception {
		
		sqlSession.delete("UserMapper.userDelete", user);
	}

	@Override
	public void userUpdate(User user) throws Exception {
		
		sqlSession.update("UserMapper.userUpdate", user);
	}

	@Override
	public int idCheck(User user) throws Exception {
		
		int result = sqlSession.selectOne("UserMapper.idCheck", user);
		return result;
	}

	@Override
	public User findID(User user) throws Exception {

		return sqlSession.selectOne("UserMapper.findID", user);
	}

	@Override
	public int emailCheck(User user) throws Exception {
		int result = sqlSession.selectOne("UserMapper.emailCheck", user);
		return result;
	}

	@Override
	public String getPw(Map<String, Object> paramMap) {

		return sqlSession.selectOne("UserMapper.getPw", paramMap);
	}
	
	/** 탈퇴 시 비밀번호 체크 */
	@Override
	public int checkPW(User user) throws Exception {
		int result = sqlSession.selectOne("UserMapper.checkPW", user);
		return result;
	}
}