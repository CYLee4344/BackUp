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
import study.spring.selection.model.Qna;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*-context.xml"})
@WebAppConfiguration
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class QnaServiceTest {
	@Autowired
	private QnaService qnaService;
	
//	/** 단일행 조회 테스트 */
//	@Test
//	public void testA() {
//		Qna input = new Qna();
//		input.setQna_no(1);
//		
//		Qna output = null;
//		
//		try {
//			output =qnaService.getQnaItem(input);
//			log.debug(output.toString());
//			}catch (Exception e) {
//				log.error(e.getLocalizedMessage());
//			e.printStackTrace();
//			}
//		}
//	/** 다중행 조회 테스트 */
//	@Test
//	public void testB() {
//		Qna input = new Qna();
//		input.setQna_type("답변완료");
//		
//		List<Qna> output = null;
//		
//		try {
//			output = qnaService.getQnaList(input);
//			
//			for (Qna item : output) {
//				log.debug(item.toString());
//			}
//		} catch (Exception e) {
//			log.error(e.getLocalizedMessage());
//			e.printStackTrace();
//		}
//	}
//	
//
//	/** 전체 데이터 수 조회 */
//	@Test
//	public void testC() {
//		int count = 0;
//		
//		try {
//			count = qnaService.getQnaCount(null);
//			log.debug("전체 데이터 수: " + count);
//		} catch (Exception e) {
//			log.error(e.getLocalizedMessage());
//			e.printStackTrace();
//		}
//	}
//	
//	
//	/** 조건에 따른 데이터 수 조회 */
//	@Test
//	public void testD() {
//		int count = 0;
//		
//		Qna input = new Qna();
//		input.setQna_type("답변미완료");
//		
//		List<Qna> output = null;
//		
//		try {
//			output = qnaService.getQnaList(input);
//			
//			for (Qna item : output) {
//				log.debug(item.toString());
//			}
//		} catch (Exception e) {
//			log.error(e.getLocalizedMessage());
//			e.printStackTrace();
//		}
//	}
//	/** 데이터 저장 테스트 */
//	@Test
//	public void testE() {
//		Qna input = new Qna();
//		input.setQna_no(3);
//		input.setQna_title("배송관련해서..");
//		input.setQna_content("안녕하세요 제가 일주일 전에 배송시작했다는 문자를 받았는데 아직안와서요 언제오나요");
//		input.setQna_type("Q");
//		input.setReg_date("O'2nd");
//		input.setReg_date("2020-09-01 20:52:00");
//		input.setEdit_date("2020-09-01 20:53:00");
//		input.setUser_no(1);
//		
//		int output = 0;
//		
//		try {
//			output = qnaService.addQna(input);
//			log.debug("저장된 데이터 수: " + output);
//			// [중요] 생성된 PK값은 MyBatis에 의해 입력 파라미터의 해당 멤버변수에 셋팅된다.
//			log.debug("생성된 PK값 : " + input.getQna_no());
//		} catch (Exception e) {
//			log.error(e.getLocalizedMessage());
//			e.printStackTrace();
//		}
//	}
//	
//	/** 데이터 수정 테스트 */
//	@Test
//	public void testF() {
//		Qna input = new Qna();
//		input.setQna_no(1);
//		input.setQna_type("답변미완료");
//		
//		int output = 0;
//		
//		try {
//			output = qnaService.editQna(input);
//			log.debug("수정된 데이터 수: " + output);
//		} catch (Exception e) {
//			log.error(e.getLocalizedMessage());
//			e.printStackTrace();
//		}
//	}
//	/** 데이터 삭제 테스트 */
//	@Test
//	public void testG() {
//		Qna input = new Qna();
//		input.setQna_no(3);
//		
//		int output = 0;
//		
//		try {
//			output = qnaService.deleteQna(input);
//			log.debug("삭제된 데이터 수: " + output);
//		} catch (Exception e) {
//			log.error(e.getLocalizedMessage());
//			e.printStackTrace();
//		}
//	}
//	
//	
	}
    