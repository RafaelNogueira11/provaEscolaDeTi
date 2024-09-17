package Service;

import Repository.ComodoRepository;
import entity.Comodo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@Service
public class ComodoServiceImplementacao{
/*public class ComodoServiceImplementacao implements ComodoService{

    @Autowired
    private ComodoRepository comodoRepository;

    @Override
    public Comodo saveComodo(Comodo comodo) {
        return comodoRepository.save(comodo);
    }

    @Override
    public List<Comodo> findAllComodo() {
        List<Comodo> allComodo = comodoRepository.findAll();
        return allComodo;

    @Override
    public Comodo getComodoById(Long id) {
        Optional<Comodo> comodo = comodoRepository.findById(id);
        if (comodo.isPresent()) {
            return (List<Comodo>) comodo.get();
        }
        return null;
    }

    @Override
    public Comodo updateComodoById(Long id, Comodo comodo) {
        Optional<Comodo> comodo1 = comodoRepository.findById(id);

        if (comodo1.isPresent()) {
            Comodo originalComodo = comodo1.get();

            return comodoRepository.save(originalComodo);
        }
        return null;
    }

    @Override
    public String deleteComodoById(Long id) {
        if (comodoRepository.findById(id).isPresent()) {
            comodoRepository.deleteById(id);
            return "Comodo deletado";
        }
        return "sem comodos";
    }*/
}