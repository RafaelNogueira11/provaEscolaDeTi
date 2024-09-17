package Controller;

import Service.ImovelService;
import Service.ImovelServiceImplementacao;
import entity.Imovel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ImovelController {

    @Autowired
    private ImovelServiceImplementacao imovelServiceImplementacao;

    @PostMapping("/imovel")
    public Imovel saveimovel(@RequestBody Imovel imovel) {
        return imovelServiceImplementacao.saveImovel(imovel);
    }

    @GetMapping("/imovel")
    public List<Imovel> getAllImovel() {
        return imovelServiceImplementacao.findAllImovel();
    }

    @GetMapping("/imovel/{id}")
    public Imovel getImovelById(@PathVariable("id") Long id) {
        return imovelServiceImplementacao.getImovelById(id);
    }

    @PutMapping("/imovel/{id}")
    public Imovel updateImovel(@PathVariable("id") Long id, @RequestBody Imovel imovel) {
        return imovelServiceImplementacao.updateImovelById(id, imovel);
    }

    @DeleteMapping("/imovel/{id}")
    public String deleteImovel(@PathVariable("id") Long id) {
        return imovelServiceImplementacao.deleteImovelById(id);
    }

}
