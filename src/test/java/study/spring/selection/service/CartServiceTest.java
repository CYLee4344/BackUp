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
import study.spring.selection.model.Cart;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*-context.xml"})
@WebAppConfiguration
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CartServiceTest {
	@Autowired
	private CartService cartService;
	
//	/** 단일행 조회 테스트 */
//	@Test
//	public void testA() {
//		Cart input = new Cart();
//		input.setCart_no(1);
//		
//		Cart output = null;
//		
//		try {
//			output = cartService.getCartItem(input);
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
//		Cart input = new Cart();
//		input.setProduct_size("76");
//		
//		List<Cart> output = null;
//		
//		try {
//			output = cartService.getCartList(input);
//			
//			for (Cart item : output) {
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
//			count = cartService.getCartCount(null);
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
//		Cart input = new Cart();
//		input.setProduct_size("76");
//		
//		try {
//			count = cartService.getCartCount(input);
//			log.debug("76을 포함하는 사이즈를 갖는 데이터 수: " + count);
//		} catch (Exception e) {
//			log.error(e.getLocalizedMessage());
//			e.printStackTrace();
//		}
//	}
//	
//	/** 데이터 저장 테스트 */
//	@Test
//	public void testE() {
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
//		int output = 0;
//		
//		try {
//			output = cartService.addCart(input);
//			log.debug("저장된 데이터 수: " + output);
//			// [중요] 생성된 PK값은 MyBatis에 의해 입력 파라미터의 해당 멤버변수에 셋팅된다.
//			log.debug("생성된 PK값 : " + input.getCart_no());
//		} catch (Exception e) {
//			log.error(e.getLocalizedMessage());
//			e.printStackTrace();
//		}
//	}
//	
//	/** 데이터 수정 테스트 */
//	@Test
//	public void testF() {
//		Cart input = new Cart();
//		input.setCart_no(1);
//		input.setProduct_color("black");
//		
//		int output = 0;
//		
//		try {
//			output = cartService.editCart(input);
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
//		Cart input = new Cart();
//		input.setCart_no(3);
//		
//		int output = 0;
//		
//		try {
//			output = cartService.deleteCart(input);
//			log.debug("삭제된 데이터 수: " + output);
//		} catch (Exception e) {
//			log.error(e.getLocalizedMessage());
//			e.printStackTrace();
//		}
//	}
}