package study.spring.selection.service;

import java.util.List;

import study.spring.selection.model.Myheart;

public interface MyheartService {
	/**
	 * Myheart 데이터 상세 조회
	 * @param Myheart 조회할 상품의 일련번호를 담고 있는 Beans
	 * @return 조회된 데이터가 저장된 Beans
	 * @throws Exception
	 */
	public Myheart getMyheartItem(Myheart input) throws Exception;
	
	/**
	 * Myheart 데이터 목록 조회
	 * @return 조회 결과에 대한 컬렉션
	 * @throws Exception
	 */
	public List<Myheart> getMyheartList(Myheart input) throws Exception;
	
	/**
	 * Myheart 데이터가 저장되어 있는 갯수 조회
	 * @return int
	 * @throws Exception
	 */
	public int getMyheartCount(Myheart input) throws Exception;
	
	/**
	 * Myheart 데이터 등록하기
	 * @param Myheart 저장할 정보를 담고 있는 Beans
	 * @return int
	 * @throws Exception
	 */
	public int addMyheart(Myheart input) throws Exception;
	
	/**
	 * Myheart 데이터 수정하기
	 * @param Myheart 수정할 정보를 담고 있는 Beans
	 * @return int
	 * @throws Exception
	 */
	public int editMyheart(Myheart input) throws Exception;
	
	/**
	 * Myheart 데이터 삭제하기
	 * @param Myheart 삭제할 정보를 담고 있는 Beans
	 * @return int
	 * @throws Exception
	 */
	public int deleteMyheart(Myheart input) throws Exception;
}
