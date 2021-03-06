package study.spring.selection.service;

import java.util.List;

import study.spring.selection.model.Product;

public interface ProductService {
	

	/** 상품 목록 */
	public List<Product> productList();
	
	/** 상품 상세 */
	public Product productDetail(int product_no);
	
	
	
//	/**
//	 * 상품 데이터 상세 조회
//	 * @param Product 조회할 상품의 일련번호를 담고 있는 Beans
//	 * @return 조회된 데이터가 저장된 Beans
//	 * @throws Exception
//	 */
//	public Product getProductItem(Product input) throws Exception;
//	
//	/**
//	 * 상품 데이터 목록 조회
//	 * @return 조회 결과에 대한 컬렉션
//	 * @throws Exception
//	 */
//	public List<Product> getProductList(Product input) throws Exception;
//	
//	/**
//	 * 상품 데이터가 저장되어 있는 갯수 조회
//	 * @return int
//	 * @throws Exception
//	 */
//	public int getProductCount(Product input) throws Exception;
//	
//	/**
//	 * 상품 데이터 등록하기
//	 * @param Product 저장할 정보를 담고 있는 Beans
//	 * @return int
//	 * @throws Exception
//	 */
//	public int addProduct(Product input) throws Exception;
//	
//	/**
//	 * 상품 데이터 수정하기
//	 * @param Product 수정할 정보를 담고 있는 Beans
//	 * @return int
//	 * @throws Exception
//	 */
//	public int editProduct(Product input) throws Exception;
//	
//	/**
//	 * 상품 데이터 삭제하기
//	 * @param Product 삭제할 정보를 담고 있는 Beans
//	 * @return int
//	 * @throws Exception
//	 */
//	public int deleteProduct(Product input) throws Exception;
}