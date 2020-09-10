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
import study.spring.selection.model.Delivery;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*-context.xml"})
@WebAppConfiguration
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DeliveryTest {
	@Autowired
	private SqlSession sqlSession;
	
//	/** 단일행 조회 */
//	@Test
//	public void testA() {
//		Delivery input = new Delivery();
//		input.setDelivery_no(1);
//		sqlSession.selectOne("DeliveryMapper.selectItem", input);
//	}
//	
//	/** 다중행 조회 */
//	@Test
//	public void testB() {
//		Delivery input = new Delivery();
//		input.setDelivery_qty(1);
//		sqlSession.selectList("DeliveryMapper.selectList", input);
//	}
//	
//	/** 데이터 저장 */
//	@Test
//	public void testC() {
//		Delivery input = new Delivery();
//		input.setUser_name("정영재");
//		input.setDelivery_type("방문수령");
//		input.setDelivery_qty(1);
//		input.setDelivery_status("입금대기");
//		input.setOrder_cancel("Y");
//		input.setReceive_name("정영재");
//		input.setReceive_tel("01012345678");
//		input.setReceive_addr("13024");
//		input.setReceive_addr2("극동대로");
//		input.setReceive_addr3("13번지");
//		input.setReceive_addr4("극동아파트");
//		input.setReceive_addr5("303호");
//		input.setReg_date("2020-09-02 14:15:00");
//		input.setEdit_date("2020-09-02 14:16:00");
//		input.setPay_no(1);
//		
//		sqlSession.insert("DeliveryMapper.insertItem", input);
//	}
//	
//	/** 데이터 삭제 */
//	@Test
//	public void testD() {
//		Delivery input = new Delivery();
//		input.setDelivery_no(2);
//		sqlSession.delete("DeliveryMapper.deleteItem", input);
//	}
//	
//	/** 데이터 수정 */
//	@Test
//	public void testE() {
//		Delivery input = new Delivery();
//		input.setDelivery_no(1);
//		input.setReceive_name("김영우");
//		sqlSession.update("DeliveryMapper.updateItem", input);
//	}
//	
//	/** 전체 데이터 수 조회 */
//	@Test
//	public void testF() {
//		int count = sqlSession.selectOne("DeliveryMapper.selectCountAll", null);
//		log.debug("전체 데이터 수: " + count);
//	}
//	
//	/** 조건에 따른 데이터 수 조회 */
//	@Test
//	public void testG() {
//		Delivery input = new Delivery();
//		input.setDelivery_qty(1);
//		int count = sqlSession.selectOne("DeliveryMapper.selectCountAll", input);
//		log.debug("1개의 배송 수량을 갖는 데이터 수: " + count);
//	}
}