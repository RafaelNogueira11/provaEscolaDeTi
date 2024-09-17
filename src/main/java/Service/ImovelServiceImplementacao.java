package Service;

import Repository.ImovelRepository;
import entity.Imovel;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@Service
public class ImovelServiceImplementacao implements ImovelService{

    @Autowired
    private ImovelRepository imovelRepository;

    @Override
    public Imovel saveImovel(Imovel imovel) {
        return imovelRepository.save(imovel);
    }

    @Override
    public List<Imovel> findAllImovel() {
        List<Imovel> allImovel = imovelRepository.findAll();
        return allImovel;
    }

    @Override
    public Imovel getImovelById(Long id) {
        Optional<Imovel> imovel = imovelRepository.findById(id);
        if (imovel.isPresent()) {
            return imovel.get();
        }
        return null;
    }

    @Override
    public Imovel updateImovelById(Long id, Imovel imovel) {
        Optional<Imovel> imovel1 = imovelRepository.findById(id);

        if (imovel1.isPresent()) {
            Imovel originalImovel = imovel1.get();

            return imovelRepository.save(originalImovel);
        }
        return null;
    }

    @Override
    public String deleteImovelById(Long id) {
        if (imovelRepository.findById(id).isPresent()) {
            imovelRepository.deleteById(id);
            return "Imovel deletado";
        }
        return "sem imoveis";
    }
}