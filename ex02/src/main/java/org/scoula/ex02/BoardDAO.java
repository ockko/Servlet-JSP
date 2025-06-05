package org.scoula.ex02;

import java.util.ArrayList;
import java.util.List;

public class BoardDAO {
    // db에서 board테이블의 모든 row를 가지고 왔다고 가정함.
    public List<BoardVO> getList() {
        List<BoardVO> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            // row 하나당 vo 하나
            BoardVO vo = new BoardVO(i, "title" + i, "content" + i, "writer" + i);
            list.add(vo);
        }
        return list;
    }
}
