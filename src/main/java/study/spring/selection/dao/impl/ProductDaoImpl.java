package study.spring.selection.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import study.spring.selection.dao.ProductDao;
import study.spring.selection.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	SqlSession sqlSession;
	
	/**  */
	@Override
	public List<Product> productList() {
		return sqlSession.selectList("ProductMapper.productList");
	}
	
	/**  */
	@Override
	public Product productDetail(int product_no) {
		return sqlSession.selectOne("ProductMapper.productDetail", product_no);
	}
}
	

