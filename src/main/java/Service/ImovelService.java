package Service;

import entity.Imovel;
import java.util.List;

public interface ImovelService {

    Imovel saveImovel(Imovel imovel);

    List<Imovel> findAllImovel();

    Imovel getImovelById(Long id);

    Imovel updateImovelById(Long id, Imovel imovel);

    String deleteImovelById(Long id);

}
