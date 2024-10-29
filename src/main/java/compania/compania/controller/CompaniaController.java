package compania.compania.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import compania.compania.model.CompaniaModel;
import compania.compania.service.ICompaniaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("api/v1/compania")
@CrossOrigin("*")
public class CompaniaController {
    
    @Autowired
    private ICompaniaService _Service;

    @GetMapping("/list")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
    public ResponseEntity<List<CompaniaModel>> findAll()
    {
        List<CompaniaModel> Lista_companias = _Service.findAll();
        return new ResponseEntity<>(Lista_companias, HttpStatus.OK);
    }
}
