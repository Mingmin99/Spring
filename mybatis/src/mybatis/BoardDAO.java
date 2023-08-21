package mybatis;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.ibatis.session.SqlSession;

public class BoardDAO {

	private SqlSession sqlSession;

	public BoardDAO() {

	}

	public BoardDAO(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public void work() {
//		insertNewPost();
//		selectAll();
//		selectbyName2("최유림");
//		selecbyNo();
//		selectbyNo2();
//		deletebyWriter("강은현");
//		updatebyWriter();
		selectDSQL();
	}

	public void insertNewPost() {
//		sqlSession.insert("mybatis.BoardDAO.insertNewPost");

		BoardVO boardVO = new BoardVO();
		boardVO.setTitle("두번째제목이요");
		boardVO.setWriter("강은현");
		boardVO.setContent("똥을 싸요");
		sqlSession.insert("mybatis.BoardDAO.insertNewPost2", boardVO);
		sqlSession.commit();
	}

	public void selectAll() {

		List<BoardVO> boardlist = sqlSession.selectList("mybatis.BoardDAO.selectAll");

		for (BoardVO boardVO : boardlist) {
			System.out.println(boardVO.toString());
		}

	}

	public void selectbyName() {

		BoardVO boardVO = new BoardVO();
		boardVO.setWriter("최유림");

//		sqlSession.selectList("mybatis.BoardDAO.selectbyName", boardVO);

		List<BoardVO> boardlist = sqlSession.selectList("mybatis.BoardDAO.selectbyName", boardVO);

		for (BoardVO boardVO1 : boardlist) {
			System.out.println(boardVO1.toString());
		}
	}

	public void selecbyNo() {
		BoardVO boardVO = sqlSession.selectOne("mybatis.BoardDAO.selectbyNo", 3);
		System.out.println(boardVO.toString());
	}

	public void selectbyName2(String name) {

		List<BoardVO> boardlist = sqlSession.selectList("mybatis.BoardDAO.selectbyName2", name);
		for (BoardVO board : boardlist) {
			System.out.println(board.toString());
		}
	}

	public void selectbyNo2() {
		Map<String, Object> map = sqlSession.selectOne("mybatis.BoardDAO.selectbyNo2", 3);
		Set<String> keyset = map.keySet();
		for (String key : keyset) {
			System.out.println(key + " : " + map.get(key));
		}
	}

	public void deletebyWriter(String writer) {
		sqlSession.delete("mybatis.BoardDAO.deletebyWriter", writer);
		sqlSession.commit();
	}

	public void updatebyWriter() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("title", "제목입니다.");
		map.put("no", 1);
		sqlSession.update("mybatis.BoardDAO.updatebyWriter", map);
		sqlSession.commit();
	}

	public void selectDSQL() {
		BoardVO inputBoardVO = new BoardVO();
		inputBoardVO.setTitle("오늘의 날씨");
		inputBoardVO.setWriter("최민영");
		List<BoardVO> boardList = sqlSession.selectList("mybatis.BoardDAO.selectDSQL", inputBoardVO);
		for (BoardVO resultBoardVO : boardList) {
			System.out.println(resultBoardVO);
		}
	}
}
