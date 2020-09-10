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
import study.spring.selection.model.Delivery;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*-context.xml"})
@WebAppConfiguration
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DeliveryServiceTest {
	@Autowired
	private DeliveryService deliveryService;
	
//	/** 단일행 조회 테스트 */
//	@Test
//	public void testA() {
//		Delivery input = new Delivery();
//		input.setDelivery_no(1);
//		
//		Delivery output = null;
//		
//		try {
//			output = deliveryService.getDeliveryItem(input);
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
//		Delivery input = new Delivery();
//		input.setDelivery_qty(1);
//		
//		List<Delivery> output = null;
//		
//		try {
//			output = deliveryService.getDeliveryList(input);
//			
//			for (Delivery item : output) {
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
//			count = deliveryService.getDeliveryCount(null);
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
//		Delivery input = new Delivery();
//		input.setDelivery_qty(1);
//		
//		try {
//			count = deliveryService.getDeliveryCount(input);
//			log.debug("1개의 배송 수량을 갖는 데이터 수: " + count);
//		} catch (Exception e) {
//			log.error(e.getLocalizedMessage());
//			e.printStackTrace();
//		}
//	}
//	
//	/** 데이터 저장 테스트 */
//	@Test
//	public void testE() {
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
//		int output = 0;
//		
//		try {
//			output = deliveryService.addDelivery(input);
//			log.debug("저장된 데이터 수: " + output);
//			// [중요] 생성된 PK값은 MyBatis에 의해 입력 파라미터의 해당 멤버변수에 셋팅된다.
//			log.debug("생성된 PK값 : " + input.getDelivery_no());
//		} catch (Exception e) {
//			log.error(e.getLocalizedMessage());
//			e.printStackTrace();
//		}
//	}
//	
//	/** 데이터 수정 테스트 */
//	@Test
//	public void testF() {
//		Delivery input = new Delivery();
//		input.setDelivery_no(1);
//		input.setReceive_name("정영재");
//		
//		int output = 0;
//		
//		try {
//			output = deliveryService.editDelivery(input);
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
//		Delivery input = new Delivery();
//		input.setDelivery_no(3);
//		
//		int output = 0;
//		
//		try {
//			output = deliveryService.deleteDelivery(input);
//			log.debug("삭제된 데이터 수: " + output);
//		} catch (Exception e) {
//			log.error(e.getLocalizedMessage());
//			e.printStackTrace();
//		}
//	}
}