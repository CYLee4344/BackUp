package study.spring.selection.service;

import java.util.List;

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
public class CouponServiceTest {
	@Autowired
	private CouponService couponService;
	
//	/** 단일행 조회 테스트 */
//	@Test
//	public void testA() {
//		Coupon input = new Coupon();
//		input.setCoupon_no(1);
//		
//		Coupon output = null;
//		
//		try {
//			output = couponService.getCouponItem(input);
//			log.debug(output.toString());
//		} catch (Exception e) {
//			log.error(e.getLocalizedMessage());
//			e.printStackTrace();
//		}
//	}
//	
//	/** 다중행 조회 테스트 */
//	@Test
//	public void testB() {
//		Coupon input = new Coupon();
//		input.setCoupon_name("신규");
//		
//		List<Coupon> output = null;
//		
//		try {
//			output = couponService.getCouponList(input);
//			
//			for (Coupon item : output) {
//				log.debug(item.toString());
//			}
//		} catch (Exception e) {
//			log.error(e.getLocalizedMessage());
//			e.printStackTrace();
//		}
//	}
//	
//	/** 전체 데이터 수 조회 */
//	@Test
//	public void testC() {
//		int count = 0;
//		
//		try {
//			count = couponService.getCouponCount(null);
//			log.debug("전체 데이터 수: " + count);
//		} catch (Exception e) {
//			log.error(e.getLocalizedMessage());
//			e.printStackTrace();
//		}
//	}
//	
//	/** 조건에 따른 데이터 수 조회 */
//	@Test
//	public void testD() {
//		int count = 0;
//		
//		Coupon input = new Coupon();
//		input.setCoupon_name("신규");
//		
//		try {
//			count = couponService.getCouponCount(input);
//			log.debug("신규를 포함하는 쿠폰이름을 갖는 데이터 수: " + count);
//		} catch (Exception e) {
//			log.error(e.getLocalizedMessage());
//			e.printStackTrace();
//		}
//	}
//	
//	/** 데이터 저장 테스트 */
//	@Test
//	public void testE() {
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
//		int output = 0;
//		
//		try {
//			output = couponService.addCoupon(input);
//			log.debug("저장된 데이터 수: " + output);
//			// [중요] 생성된 PK값은 MyBatis에 의해 입력 파라미터의 해당 멤버변수에 셋팅된다.
//			log.debug("생성된 PK값 : " + input.getCoupon_no());
//		} catch (Exception e) {
//			log.error(e.getLocalizedMessage());
//			e.printStackTrace();
//		}
//	}
//	
//	/** 데이터 수정 테스트 */
//	@Test
//	public void testF() {
//		Coupon input = new Coupon();
//		input.setCoupon_no(1);
//		input.setCoupon_name("신규");
//		
//		int output = 0;
//		
//		try {
//			output = couponService.editCoupon(input);
//			log.debug("수정된 데이터 수: " + output);
//		} catch (Exception e) {
//			log.error(e.getLocalizedMessage());
//			e.printStackTrace();
//		}
//	}
//	
//	/** 데이터 삭제 테스트 */
//	@Test
//	public void testG() {
//		Coupon input = new Coupon();
//		input.setCoupon_no(3);
//		
//		int output = 0;
//		
//		try {
//			output = couponService.deleteCoupon(input);
//			log.debug("삭제된 데이터 수: " + output);
//		} catch (Exception e) {
//			log.error(e.getLocalizedMessage());
//			e.printStackTrace();
//		}
//	}
}