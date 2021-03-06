package study.spring.selection.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import study.spring.selection.dao.ProductDao;
import lombok.extern.slf4j.Slf4j;
import study.spring.selection.model.Product;
import study.spring.selection.service.ProductService;

@Slf4j
@Service
public class ProductServiceImpl implements ProductService {	
	@Autowired
	SqlSession sqlSession;
	ProductDao dao;
	
	/** 상품 목록 */
	@Override
	public List<Product> productList() {
		return dao.productList();
	}
	
	/** 상품 상세 */
	@Override
	public Product productDetail(int product_no) {
		return dao.productDetail(product_no);
	}
//	/**
//	 * 상품 데이터 상세 조회
//	 * @param Product 조회할 상품의 일련번호를 담고 있는 Beans
//	 * @return 조회된 데이터가 저장된 Beans
//	 * @throws Exception
//	 */
//	@Override
//	public Product getProductItem(Product input) throws Exception {
//		Product result = null;
//		
//		try {
//			result = sqlSession.selectOne("ProductMapper.selectItem", input);
//			
//			if (result == null) {
//				throw new NullPointerException("result=null");
//			}
//		} catch (NullPointerException e) {
//			log.error(e.getLocalizedMessage());
//			throw new Exception("조회된 데이터가 없습니다.");
//		} catch (Exception e) {
//			log.error(e.getLocalizedMessage());
//			throw new Exception("데이터 조회에 실패했습니다.");
//		}
//		return result;
//	}
//
//	/**
//	 * 상품 데이터 목록 조회
//	 * @return 조회 결과에 대한 컬렉션
//	 * @throws Exception
//	 */
//	@Override
//	public List<Product> getProductList(Product input) throws Exception {
//		List<Product> result = null;
//		
//		try {
//			result = sqlSession.selectList("ProductMapper.selectList", input);
//			
//			if (result == null) {
//				throw new NullPointerException("result=null");
//			}
//		} catch (NullPointerException e) {
//			log.error(e.getLocalizedMessage());
//			throw new Exception("조회된 데이터가 없습니다.");
//		} catch (Exception e) {
//			log.error(e.getLocalizedMessage());
//			throw new Exception("데이터 조회에 실패했습니다.");
//		}
//		
//		return result;
//	}
//
//	/**
//	 * 상품 데이터가 저장되어 있는 갯수 조회
//	 * @return int
//	 * @throws Exception
//	 */
//	@Override
//	public int getProductCount(Product input) throws Exception {
//		int result = 0;
//		
//		try {
//			result = sqlSession.selectOne("ProductMapper.selectCountAll", input);
//		} catch (Exception e) {
//			log.error(e.getLocalizedMessage());
//			throw new Exception("데이터 조회에 실패했습니다.");
//		}
//		
//		return result;
//	}
//
//	/**
//	 * 상품 데이터 등록하기
//	 * @param Product 저장할 정보를 담고 있는 Beans
//	 * @return int
//	 * @throws Exception
//	 */
//	@Override
//	public int addProduct(Product input) throws Exception {
//		int result = 0;
//		
//		try {
//			result = sqlSession.insert("ProductMapper.insertItem", input);
//			
//			if (result == 0) {
//				throw new NullPointerException("result=0");
//			}
//		} catch (NullPointerException e) {
//			log.error(e.getLocalizedMessage());
//			throw new Exception("저장된 데이터가 없습니다.");
//		} catch (Exception e) {
//			log.error(e.getLocalizedMessage());
//			throw new Exception("데이터 저장에 실패했습니다.");
//		}
//		return result;
//	}
//
//	/**
//	 * 상품 데이터 수정하기
//	 * @param Product 수정할 정보를 담고 있는 Beans
//	 * @return int
//	 * @throws Exception
//	 */
//	@Override
//	public int editProduct(Product input) throws Exception {
//		int result = 0;
//		
//		try {
//			result = sqlSession.update("ProductMapper.updateItem", input);
//			
//			if (result == 0) {
//				throw new NullPointerException("result=0");
//			}
//		} catch (NullPointerException e) {
//			log.error(e.getLocalizedMessage());
//			throw new Exception("수정된 데이터가 없습니다.");
//		} catch (Exception e) {
//			log.error(e.getLocalizedMessage());
//			throw new Exception("데이터 수정에 실패했습니다.");
//		}
//		
//		return result;
//	}
//
//	/**
//	 * 상품 데이터 삭제하기
//	 * @param Product 삭제할 정보를 담고 있는 Beans
//	 * @return int
//	 * @throws Exception
//	 */
//	@Override
//	public int deleteProduct(Product input) throws Exception {
//		int result = 0;
//		
//		try {
//			result = sqlSession.delete("ProductMapper.deleteItem", input);
//			
//			if (result == 0) {
//				throw new NullPointerException("result=0");
//			}
//		} catch (NullPointerException e) {
//			log.error(e.getLocalizedMessage());
//			throw new Exception("삭제된 데이터가 없습니다.");
//		} catch (Exception e) {
//			log.error(e.getLocalizedMessage());
//			throw new Exception("데이터 삭제에 실패했습니다.");
//		}
//		
//		return result;
//	}
}