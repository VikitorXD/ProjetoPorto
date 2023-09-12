package org.example.Repositories;

import org.example.Model.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RepositoryCliente extends BaseRpository implements IRepository<Cliente> {
    @Override
    public void save(Cliente cliente) throws Exception {
        try(Connection connection = getConnection()){
            String sql = "INSERT INTO NOVO_CLIENTE_CADASTRO(ID, NOME, CPF, NUMERO_CNH) VALUES(?, ?, ?, ?)";

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setLong(1,cliente.getId());
            ps.setString(2,cliente.getNome());
            ps.setLong(3,cliente.getCpf());
            ps.setLong(4,cliente.getNumCNH());
            ps.executeUpdate();
        }
    }

    @Override
    public void update(Cliente object) throws Exception {

    }

    @Override
    public void delete(Long id) throws Exception {
        try (Connection connection = getConnection()) {
            String sql = "DELETE FROM NOVO_CLIENTE_CADASTRO WHERE ID = ?";

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setLong(1, id);
            int rowsAffected = ps.executeUpdate();

            if (rowsAffected == 0) {
                throw new SQLException("Nenhum cliente com o ID fornecido foi encontrado para exclusão.");
            }
        }
    }
}
