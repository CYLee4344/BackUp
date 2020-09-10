package study.spring.selection.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import study.spring.selection.model.Coupon;
import study.spring.selection.service.CouponService;

@Slf4j
@Service
public class CouponServiceImpl implements CouponService {
	@Autowired
	SqlSession sqlSession;

	/**
	 * Coupon 데이터 상세 조회
	 * @param Coupon 조회할 상품의 일련번호를 담고 있는 Beans
	 * @return 조회된 데이터가 저장된 Beans
	 * @throws Exception
	 */
	@Override
	public Coupon getCouponItem(Coupon input) throws Exception {
		Coupon result = null;
		
		try {
			result = sqlSession.selectOne("CouponMapper.selectItem", input);
			
			if (result == null) {
				throw new NullPointerException("result=null");
			}
		} catch (NullPointerException e) {
			log.error(e.getLocalizedMessage());
			throw new Exception("조회된 데이터가 없습니다.");
		} catch (Exception e) {
			log.error(e.getLocalizedMessage());
			throw new Exception("데이터 조회에 실패했습니다.");
		}
		
		return result;
	}

	/**
	 * Coupon 데이터 목록 조회
	 * @return 조회 결과에 대한 컬렉션
	 * @throws Exception
	 */
	@Override
	public List<Coupon> getCouponList(Coupon input) throws Exception {
		List<Coupon> result = null;
		
		try {
			result = sqlSession.selectList("CouponMapper.selectList", input);
			
			if (result == null) {
				throw new NullPointerException("result=null");
			}
		} catch (NullPointerException e) {
			log.error(e.getLocalizedMessage());
			throw new Exception("조회된 데이터가 없습니다.");
		} catch (Exception e) {
			log.error(e.getLocalizedMessage());
			throw new Exception("데이터 조회에 실패했습니다.");
		}
		
		return result;
	}

	/**
	 * Coupon 데이터가 저장되어 있는 갯수 조회
	 * @return int
	 * @throws Exception
	 */
	@Override
	public int getCouponCount(Coupon input) throws Exception {
		int result = 0;
		
		try {
			result = sqlSession.selectOne("CouponMapper.selectCountAll", input);
		} catch (Exception e) {
			log.error(e.getLocalizedMessage());
			throw new Exception("데이터 조회에 실패했습니다.");
		}
		
		return result;
	}

	/**
	 * Coupon 데이터 등록하기
	 * @param Coupon 저장할 정보를 담고 있는 Beans
	 * @return int
	 * @throws Exception
	 */
	@Override
	public int addCoupon(Coupon input) throws Exception {
		int result = 0;
		
		try {
			result = sqlSession.insert("CouponMapper.insertItem", input);
			
			if (result == 0) {
				throw new NullPointerException("result=0");
			}
		} catch (NullPointerException e) {
			log.error(e.getLocalizedMessage());
			throw new Exception("저장된 데이터가 없습니다.");
		} catch (Exception e) {
			log.error(e.getLocalizedMessage());
			throw new Exception("데이터 저장에 실패했습니다.");
		}
		
		return result;
	}

	/**
	 * Coupon 데이터 수정하기
	 * @param Coupon 수정할 정보를 담고 있는 Beans
	 * @return int
	 * @throws Exception
	 */
	@Override
	public int editCoupon(Coupon input) throws Exception {
		int result = 0;
		
		try {
			result = sqlSession.update("CouponMapper.updateItem", input);
			
			if (result == 0) {
				throw new NullPointerException("result=0");
			}
		} catch (NullPointerException e) {
			log.error(e.getLocalizedMessage());
			throw new Exception("수정된 데이터가 없습니다.");
		} catch (Exception e) {
			log.error(e.getLocalizedMessage());
			throw new Exception("데이터 수정에 실패했습니다.");
		}
		return result;
	}

	/**
	 * Coupon 데이터 삭제하기
	 * @param Coupon 삭제할 정보를 담고 있는 Beans
	 * @return int
	 * @throws Exception
	 */
	@Override
	public int deleteCoupon(Coupon input) throws Exception {
		int result = 0;
		
		try {
			result = sqlSession.delete("CouponMapper.deleteItem", input);
			
			if (result == 0) {
				throw new NullPointerException("result=0");
			}
		} catch (NullPointerException e) {
			log.error(e.getLocalizedMessage());
			throw new Exception("삭제된 데이터가 없습니다.");
		} catch (Exception e) {
			log.error(e.getLocalizedMessage());
			throw new Exception("데이터 삭제에 실패했습니다.");
		}
		return result;
	}
}