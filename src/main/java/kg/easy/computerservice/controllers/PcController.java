package kg.easy.computerservice.controllers;

import kg.easy.computerservice.models.entity.Pc;
import kg.easy.computerservice.services.PcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/pc")
public class PcController {

    private PcService pcService;

    @Autowired
    public PcController(PcService pcService){
        this.pcService = pcService;
    }

    @GetMapping("/ex1")
    public List<Pc> ex1 (@RequestParam double price){
        return pcService.getAllPcLessThan(price);
    }

    @GetMapping("/ex1Mapper")
    public List<Pc> getAllLess(@RequestParam double price){
        return pcService.getAllPcLessThan(price);
    }

    @GetMapping("/ex1HashMap")
    public List<Map<String,Object>> getAllPcLess(@RequestParam double price){
        return pcService.getAllLessThan(price);
    }
}
