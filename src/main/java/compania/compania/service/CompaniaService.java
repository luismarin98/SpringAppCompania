package compania.compania.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import compania.compania.model.CompaniaModel;
import compania.compania.repository.ICompaniaRepository;

@Service
public class CompaniaService implements ICompaniaService {
    
    @Autowired
    private ICompaniaRepository _CompaniaRepository;

    @Override
    public List<CompaniaModel> findAll() {
        
        List<CompaniaModel> compania_list;
        try {
            compania_list = _CompaniaRepository.findAll();
        } catch (Exception ex) {
            throw ex;
        }

        return compania_list;
    }
}
