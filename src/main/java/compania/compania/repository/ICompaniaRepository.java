package compania.compania.repository;

import java.util.List;
import compania.compania.model.CompaniaModel;

public interface ICompaniaRepository {
    public List<CompaniaModel> findAll();
}
