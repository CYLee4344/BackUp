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
import study.spring.selection.model.Coupon;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*-context.xml"})
@WebAppConfiguration
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CouponTest {
	@Autowired
	private SqlSession sqlSession;
	
//	/** 단일행 조회 */
//	@Test
//	public void testA() {
//		Coupon input = new Coupon();
//		input.setCoupon_no(1);
//		sqlSession.selectOne("CouponMapper.selectItem", input);
//	}
//	
//	/** 다중행 조회 */
//	@Test
//	public void testB() {
//		Coupon input = new Coupon();
//		input.setCoupon_name("신규");
//		sqlSession.selectList("CouponMapper.selectList", input);
//	}
//	
//	/** 데이터 저장 */
//	@Test
//	public void testC() {
//		Coupon input = new Coupon();
//		input.setCoupon_code("2");
//		input.setCoupon_name("신규");
//		input.setCoupon_price(12345);
//		input.setCoupon_used("N");
//		input.setCoupon_exp("2020-09-02 13:57:00");
//		input.setReg_date("2020-09-02 13:57:00");
//		input.setEdit_date("2020-09-02 13:57:00");
//		input.setUser_no(1);
//		
//		sqlSession.insert("CouponMapper.insertItem", input);
//	}
//	
//	/** 데이터 삭제 */
//	@Test
//	public void testD() {
//		Coupon input = new Coupon();
//		input.setCoupon_no(2);
//		sqlSession.delete("CouponMapper.deleteItem", input);
//	}
//	
//	/** 데이터 수정 */
//	@Test
//	public void testE() {
//		Coupon input = new Coupon();
//		input.setCoupon_no(1);
//		input.setCoupon_name("신규");
//		sqlSession.update("CouponMapper.updateItem", input);
//	}
//	
//	/** 전체 데이터 수 조회 */
//	@Test
//	public void testF() {
//		int count = sqlSession.selectOne("CouponMapper.selectCountAll", null);
//		log.debug("전체 데이터 수: " + count);
//	}
//	
//	/** 조건에 따른 데이터 수 조회 */
//	@Test
//	public void testG() {
//		Coupon input = new Coupon();
//		input.setCoupon_name("신규");
//		int count = sqlSession.selectOne("CouponMapper.selectCountAll", input);
//		log.debug("신규를 포함하는 쿠폰이름을 갖는 데이터 수: " + count);
//	}
}