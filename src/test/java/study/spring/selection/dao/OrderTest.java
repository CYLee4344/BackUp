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
import study.spring.selection.model.Order;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*-context.xml"})
@WebAppConfiguration
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OrderTest {
	@Autowired
	private SqlSession sqlSession;
	
//	/** 단일행 조회 */
//	@Test
//	public void testA() {
//		Order input = new Order();
//		input.setOrder_no(1);
//		sqlSession.selectOne("OrderMapper.selectItem", input);
//	}
//	
//	/** 다중행 조회 */
//	@Test
//	public void testB() {
//		Order input = new Order();
//		input.setCart_no(1);
//		sqlSession.selectList("OrderMapper.selectList", input);
//	}
//	
//	/** 데이터 저장 */
//	@Test
//	public void testC() {
//		Order input = new Order();
//		input.setReg_date("2020-09-02 15:21:00");
//		input.setEdit_date("2020-09-02 15:22:00");
//		input.setCart_no(1);
//		input.setProduct_no(1);
//		
//		sqlSession.insert("OrderMapper.insertItem", input);
//	}
//	
//	/** 데이터 삭제 */
//	@Test
//	public void testD() {
//		Order input = new Order();
//		input.setOrder_no(2);
//		sqlSession.delete("OrderMapper.deleteItem", input);
//	}
//	
//	/** 데이터 수정 */
//	@Test
//	public void testE() {
//		Order input = new Order();
//		input.setOrder_no(1);
//		input.setEdit_date("2020-09-02 15:22:01");
//		sqlSession.update("OrderMapper.updateItem", input);
//	}
//	
//	/** 전체 데이터 수 조회 */
//	@Test
//	public void testF() {
//		int count = sqlSession.selectOne("OrderMapper.selectCountAll", null);
//		log.debug("전체 데이터 수: " + count);
//	}
//	
//	/** 조건에 따른 데이터 수 조회 */
//	@Test
//	public void testG() {
//		Order input = new Order();
//		input.setCart_no(1);
//		int count = sqlSession.selectOne("OrderMapper.selectCountAll", input);
//		log.debug("1을 포함하는 Cart_no를 갖는 데이터 수: " + count);
//	}
}