package study.spring.selection.dao;

import java.util.Map;

import study.spring.selection.model.User;

public interface UserDao {
	
	/** 회원가입 */
	public void register(User user) throws Exception;
	
	/** 아이디 중복 체크 */
	public int idCheck(User user) throws Exception;
	
	/** 로그인 */
	public User login(User user) throws Exception;
	
	/** 탈퇴 */
	public void userDelete(User user) throws Exception;
	
	/** 탈퇴 시 비밀번호 체크 */
	public int checkPW(User user) throws Exception;
	
	/** 정보수정 */
	public void userUpdate(User user) throws Exception;
	
	/** 아이디 찾기 */
	public User findID(User user) throws Exception;
	
	/** 이메일 유무체크 */
	public int emailCheck(User user) throws Exception;
	
	/** 비밀번호 찾기 */
	public String getPw(Map<String, Object> paramMap);

}