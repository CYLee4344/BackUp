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
import study.spring.selection.model.Product;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*-context.xml"})
@WebAppConfiguration
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ProductTest {
	@Autowired
	private SqlSession sqlSession;
	
//	/** 단일행 조회 */
//	@Test
//	public void testA() {
//		Product input = new Product();
//		input.setProduct_no(1);
//		sqlSession.selectOne("ProductMapper.selectItem", input);
//	}
//	
//	/** 다중행 조회 */
//	@Test
//	public void testB() {
//		Product input = new Product();
//		input.setProduct_name("옷");
//		sqlSession.selectList("ProductMapper.selectList", input);
//	}
//	
//	/** 데이터 저장 */
//	@Test
//	public void testC() {
//		Product input = new Product();
//		input.setProduct_name("프린팅 패널 탑");
//		input.setProduct_price(298000);
//		input.setProduct_qty(1);
//		input.setProduct_content("여유로운 실루엣의 탑입니다. 슬리브와 이어지는 앞뒤 상단의 프릴 패널과 프런트 상단의 셔링 봉제로 한층 페미닌한 무드가 느껴집니다. 번아웃 텍스처의 전체 프린팅 디자인으로 화려하며, 슬리브를 제외하고 안감을 봉제하여 착용감이 좋습니다. 제품과 동일한 프린팅의 스커트와 셋업하여 연출할 수 있습니다.");
//		input.setProduct_brand("O'2nd");
//		input.setProduct_size("76");
//		input.setProduct_color("black");
//		input.setProduct_category("new");
//		input.setReg_date("2020-08-28 11:36:00");
//		input.setEdit_date("2020-08-28 11:36:59");
//		sqlSession.insert("ProductMapper.insertItem", input);
//	}
//	
//	/** 데이터 삭제 */
//	@Test
//	public void testD() {
//		Product input = new Product();
//		input.setProduct_no(2);
//		sqlSession.delete("ProductMapper.deleteItem", input);
//	}
//	
//	/** 데이터 수정 */
//	@Test
//	public void testE() {
//		Product input = new Product();
//		input.setProduct_no(2);
//		input.setProduct_color("white");
//		sqlSession.update("ProductMapper.updateItem", input);
//	}
//	
//	/** 전체 데이터 수 조회 */
//	@Test
//	public void testF() {
//		int count = sqlSession.selectOne("ProductMapper.selectCountAll", null);
//		log.debug("전체 데이터 수: " + count);
//	}
//	
//	/** 조건에 따른 데이터 수 조회 */
//	@Test
//	public void testG() {
//		Product input = new Product();
//		input.setProduct_name("옷");
//		int count = sqlSession.selectOne("ProductMapper.selectCountAll", input);
//		log.debug("옷을 포함하는 상품이름을 갖는 데이터 수: " + count);
//	}
}