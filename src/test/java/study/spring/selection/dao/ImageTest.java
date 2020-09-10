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
import study.spring.selection.model.Image;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*-context.xml"})
@WebAppConfiguration
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ImageTest {
	@Autowired
	private SqlSession sqlSession;
	
//	/** 단일행 조회 */
//	@Test
//	public void testA() {
//		Image input = new Image();
//		input.setImage_no(1);
//		sqlSession.selectOne("ImageMapper.selectItem", input);
//	}
//	
//	/** 다중행 조회 */
//	@Test
//	public void testB() {
//		Image input = new Image();
//		input.setImage_type("jpg");
//		sqlSession.selectList("ImageMapper.selectList", input);
//	}
//	
	/** 데이터 저장 */
	@Test
	public void testC() {
		Image input = new Image();
		input.setImage_size("360*240");
		input.setImage_type("png");
		input.setImage_path("www.google.com");
		input.setImage_name("사진이름");
		input.setProduct_no(1);
		
		sqlSession.insert("ImageMapper.insertItem", input);
	}
//	
//	/** 데이터 삭제 */
//	@Test
//	public void testD() {
//		Image input = new Image();
//		input.setImage_no(2);
//		sqlSession.delete("ImageMapper.deleteItem", input);
//	}
//	
//	/** 데이터 수정 */
//	@Test
//	public void testE() {
//		Image input = new Image();
//		input.setImage_no(1);
//		input.setImage_name("사진");
//		sqlSession.update("ImageMapper.updateItem", input);
//	}
//	
//	/** 전체 데이터 수 조회 */
//	@Test
//	public void testF() {
//		int count = sqlSession.selectOne("ImageMapper.selectCountAll", null);
//		log.debug("전체 데이터 수: " + count);
//	}
//	
//	/** 조건에 따른 데이터 수 조회 */
//	@Test
//	public void testG() {
//		Image input = new Image();
//		input.setImage_name("사진");
//		int count = sqlSession.selectOne("ImageMapper.selectCountAll", input);
//		log.debug("사진을 포함하는 ImageName을 갖는 데이터 수: " + count);
//	}
}