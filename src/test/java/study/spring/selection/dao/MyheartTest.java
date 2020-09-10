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
import study.spring.selection.model.Myheart;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*-context.xml"})
@WebAppConfiguration
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MyheartTest {
	@Autowired
	private SqlSession sqlSession;
	
//	/** 단일행 조회 */
//	@Test
//	public void testA() {
//		Myheart input = new Myheart();
//		input.setMyheart_no(1);
//		sqlSession.selectOne("MyheartMapper.selectItem", input);
//	}
//	
//	/** 다중행 조회 */
//	@Test
//	public void testB() {
//		Myheart input = new Myheart();
//		input.setMyheart_no(1);
//		sqlSession.selectList("MyheartMapper.selectList", input);
//	}
//	
//	/** 데이터 저장 */
//	@Test
//	public void testC() {
//		Myheart input = new Myheart();
//		input.setUser_no(1);
//		input.setProduct_no(1);
//		
//		sqlSession.insert("MyheartMapper.insertItem", input);
//	}
//	
//	/** 데이터 삭제 */
//	@Test
//	public void testD() {
//		Myheart input = new Myheart();
//		input.setMyheart_no(2);
//		sqlSession.delete("MyheartMapper.deleteItem", input);
//	}
//	
//	/** 데이터 수정 */
//	@Test
//	public void testE() {
//		Myheart input = new Myheart();
//		input.setMyheart_no(1);
//		input.setProduct_no(1);
//		
//		sqlSession.update("MyheartMapper.updateItem", input);
//	}
//	
//	/** 전체 데이터 수 조회 */
//	@Test
//	public void testF() {
//		int count = sqlSession.selectOne("MyheartMapper.selectCountAll", null);
//		log.debug("전체 데이터 수: " + count);
//	}
//	
//	/** 조건에 따른 데이터 수 조회 */
//	@Test
//	public void testG() {
//		Myheart input = new Myheart();
//		input.setProduct_no(1);
//		int count = sqlSession.selectOne("MyheartMapper.selectCountAll", input);
//		log.debug("1을 포함하는 Product_no를 갖는 데이터 수: " + count);
//	}
}