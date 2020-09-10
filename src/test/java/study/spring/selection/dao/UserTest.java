package study.spring.selection.dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import lombok.extern.slf4j.Slf4j;
import study.spring.selection.model.User;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*-context.xml"})
@WebAppConfiguration
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserTest {
	@Autowired
	private SqlSession sqlSession;
	
//	/** 단일행 조회 */
//	@Test
//	public void testA() {
//		User input = new User();
//		input.setUser_no(1);
//		sqlSession.selectOne("UserMapper.selectItem", input);
//	}
//	
//	/** 다중행 조회 */
//	@Test
//	public void testB() {
//		User input = new User();
//		input.setUser_name("김영우");
//		sqlSession.selectList("UserMapper.selectList", input);
//	}
//	
//	/** 데이터 저장 */
//	@Test
//	public void testC() {
//		User input = new User();
//		input.setUser_id("jyj960330");
//		input.setUser_pw("123qwe!@#");
//		input.setUser_email("jyj960330@gmail.com");
//		input.setUser_tel("01012345678");
//		input.setUser_name("정영재");
//		input.setUser_addr("06211");
//		input.setUser_addr2("강남구테헤란로");
//		input.setUser_addr3("강남구역삼동");
//		input.setUser_addr4("5층");
//		input.setIs_out("Y");
//		input.setReg_date("2020-09-02 16:09:00");
//		input.setEdit_date("2020-09-02 16:10:00");
//		
//		sqlSession.insert("UserMapper.insertItem", input);
//	}
//	
//	/** 데이터 삭제 */
//	@Test
//	public void testD() {
//		User input = new User();
//		input.setUser_no(2);
//		sqlSession.delete("UserMapper.deleteItem", input);
//	}
//	
//	/** 데이터 수정 */
//	@Test
//	public void testE() {
//		User input = new User();
//		input.setUser_no(1);
//		input.setUser_tel("01087654321");
//		sqlSession.update("UserMapper.updateItem", input);
//	}
//	
//	/** 전체 데이터 수 조회 */
//	@Test
//	public void testF() {
//		int count = sqlSession.selectOne("UserMapper.selectCountAll", null);
//		log.debug("전체 데이터 수: " + count);
//	}
//	
//	/** 조건에 따른 데이터 수 조회 */
//	@Test
//	public void testG() {
//		User input = new User();
//		input.setUser_email("gmail");
//		int count = sqlSession.selectOne("UserMapper.selectCountAll", input);
//		log.debug("gmail을 포함하는 User_email을 갖는 데이터 수: " + count);
//	}
}