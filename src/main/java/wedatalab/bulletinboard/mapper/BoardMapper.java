package wedatalab.bulletinboard.mapper;

import org.springframework.stereotype.Repository;
import wedatalab.bulletinboard.domain.Board;

import java.util.List;

@Repository
public interface BoardMapper {
    int boardCount();

    List<Board> getList();
}
