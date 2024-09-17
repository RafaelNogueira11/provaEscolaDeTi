package Service;

import entity.Comodo;
import java.util.List;

public interface ComodoService {

    Comodo saveComodo(Comodo comodo);

    List<Comodo> findAllComodo();

    Comodo getComodoById(Long id);

    Comodo updateComodoById(Long id, Comodo comodo);

    String deleteComodoById(Long id);

}
