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
import study.spring.selection.model.Pay;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*-context.xml"})
@WebAppConfiguration
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PayTest {
	@Autowired
	private SqlSession sqlSession;
	
//	/** 단일행 조회 */
//	@Test
//	public void testA() {
//		Pay input = new Pay();
//		input.setPay_no(1);
//		sqlSession.selectOne("PayMapper.selectItem", input);
//	}
//	
//	/** 다중행 조회 */
//	@Test
//	public void testB() {
//		Pay input = new Pay();
//		input.setPay_type("카드");
//		sqlSession.selectList("PayMapper.selectList", input);
//	}
//	
//	/** 데이터 저장 */
//	@Test
//	public void testC() {
//		Pay input = new Pay();
//		input.setPay_type("카드");
//		input.setReg_date("2020-09-02 15:39:00");
//		input.setEdit_date("2020-09-02 15:40:00");
//		input.setCoupon_no(1);
//		input.setOrder_no(1);
//		
//		sqlSession.insert("PayMapper.insertItem", input);
//	}
//	
//	/** 데이터 삭제 */
//	@Test
//	public void testD() {
//		Pay input = new Pay();
//		input.setPay_no(2);
//		sqlSession.delete("PayMapper.deleteItem", input);
//	}
//	
//	/** 데이터 수정 */
//	@Test
//	public void testE() {
//		Pay input = new Pay();
//		input.setPay_no(1);
//		input.setPay_type("계좌이체");
//		sqlSession.update("PayMapper.updateItem", input);
//	}
//	
//	/** 전체 데이터 수 조회 */
//	@Test
//	public void testF() {
//		int count = sqlSession.selectOne("PayMapper.selectCountAll", null);
//		log.debug("전체 데이터 수: " + count);
//	}
//	
//	/** 조건에 따른 데이터 수 조회 */
//	@Test
//	public void testG() {
//		Pay input = new Pay();
//		input.setPay_type("계좌이체");
//		int count = sqlSession.selectOne("PayMapper.selectCountAll", input);
//		log.debug("계좌이체를 포함하는 Pay_type을 갖는 데이터 수: " + count);
//	}
}