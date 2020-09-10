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
import study.spring.selection.model.Cart;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*-context.xml"})
@WebAppConfiguration
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CartTest {
	@Autowired
	private SqlSession sqlSession;
	
//	/** 단일행 조회 */
//	@Test
//	public void testA() {
//		Cart input = new Cart();
//		input.setCart_no(1);
//		sqlSession.selectOne("CartMapper.selectItem", input);
//	}
//	
//	/** 다중행 조회 */
//	@Test
//	public void testB() {
//		Cart input = new Cart();
//		input.setProduct_size("76");
//		sqlSession.selectList("CartMapper.selectList", input);
//	}
//	
//	/** 데이터 저장 */
//	@Test
//	public void testC() {
//		Cart input = new Cart();
//		input.setProduct_qty(1);
//		input.setProduct_size("76");
//		input.setProduct_price(123456);
//		input.setProduct_color("black");
//		input.setProduct_brand("O'2nd");
//		input.setProduct_name("프린팅 패널 탑");
//		input.setReg_date("2020-09-01 20:52:00");
//		input.setEdit_date("2020-09-01 20:53:00");
//		input.setMyheart_no(1);
//		input.setProduct_no(1);
//		
//		sqlSession.insert("CartMapper.insertItem", input);
//	}
//	
//	/** 데이터 삭제 */
//	@Test
//	public void testD() {
//		Cart input = new Cart();
//		input.setCart_no(2);
//		sqlSession.delete("CartMapper.deleteItem", input);
//	}
//	
//	/** 데이터 수정 */
//	@Test
//	public void testE() {
//		Cart input = new Cart();
//		input.setCart_no(1);
//		input.setProduct_color("black");
//		sqlSession.update("CartMapper.updateItem", input);
//	}
//	
//	/** 전체 데이터 수 조회 */
//	@Test
//	public void testF() {
//		int count = sqlSession.selectOne("CartMapper.selectCountAll", null);
//		log.debug("전체 데이터 수: " + count);
//	}
//	
//	/** 조건에 따른 데이터 수 조회 */
//	@Test
//	public void testG() {
//		Cart input = new Cart();
//		input.setProduct_size("76");
//		int count = sqlSession.selectOne("CartMapper.selectCountAll", input);
//		log.debug("76을 포함하는 사이즈를 갖는 데이터 수: " + count);
//	}
}