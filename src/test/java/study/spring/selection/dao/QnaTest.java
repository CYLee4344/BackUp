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
import study.spring.selection.model.Qna;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*-context.xml"})
@WebAppConfiguration
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class QnaTest {
	@Autowired
	private SqlSession sqlSession;
	
//	/** 단일행 조회 */
//	@Test
//	public void testA() {
//		Qna input = new Qna();
//		input.setQna_no(1);
//		sqlSession.selectOne("QnaMapper.selectItem", input);
//	}
//	
//	/** 다중행 조회 */
//	@Test
//	public void testB() {
//		Qna input = new Qna();
//		input.setQna_title("문의");
//		sqlSession.selectList("QnaMapper.selectList", input);
//	}
//	
	/** 데이터 저장 */
	@Test
	public void testC() {
		Qna input = new Qna();
		input.setQna_title("문의사항입니다.");
		input.setQna_content("문의내용입니다.");
		input.setQna_type("Y");
		input.setUser_no(1);
		
		sqlSession.insert("QnaMapper.insertItem", input);
	}
//	
//	/** 데이터 삭제 */
//	@Test
//	public void testD() {
//		Qna input = new Qna();
//		input.setQna_no(2);
//		sqlSession.delete("QnaMapper.deleteItem", input);
//	}
//	
//	/** 데이터 수정 */
//	@Test
//	public void testE() {
//		Qna input = new Qna();
//		input.setQna_no(1);
//		input.setQna_content("문의내용입니다.");
//		sqlSession.update("QnaMapper.updateItem", input);
//	}
//	
//	/** 전체 데이터 수 조회 */
//	@Test
//	public void testF() {
//		int count = sqlSession.selectOne("QnaMapper.selectCountAll", null);
//		log.debug("전체 데이터 수: " + count);
//	}
//	
//	/** 조건에 따른 데이터 수 조회 */
//	@Test
//	public void testG() {
//		Qna input = new Qna();
//		input.setQna_title("문의");
//		int count = sqlSession.selectOne("QnaMapper.selectCountAll", input);
//		log.debug("문의을 포함하는 Qna_tilte을 갖는 데이터 수: " + count);
//	}
}