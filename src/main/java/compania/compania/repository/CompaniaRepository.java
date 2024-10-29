package compania.compania.repository;

import compania.compania.model.CompaniaModel;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class CompaniaRepository implements ICompaniaRepository {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<CompaniaModel> findAll() {
        String query = "SELECT * FROM Companias where status='A'";

        return jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(CompaniaModel.class));
    }
}
