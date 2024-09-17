package Controller;

import Service.ImovelService;
import entity.Imovel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ImovelController {

    @Autowired
    private ImovelService imovelService;

    @PostMapping("/imovel")
    public Imovel saveimovel(@RequestBody Imovel imovel) {
        return imovelService.saveImovel(imovel);
    }

    @GetMapping("/imovel")
    public List<Imovel> getAllImovel() {
        return imovelService.findAllImovel();
    }

    @GetMapping("/imovel/{id}")
    public Imovel getImovelById(@PathVariable("id") Long id) {
        return imovelService.getImovelById(id);
    }

    @PutMapping("/imovel/{id}")
    public Imovel updateImovel(@PathVariable("id") Long id, @RequestBody Imovel imovel) {
        return imovelService.updateImovelById(id, imovel);
    }

    @DeleteMapping("/imovel/{id}")
    public String deleteImovel(@PathVariable("id") Long id) {
        return imovelService.deleteImovelById(id);
    }

}
