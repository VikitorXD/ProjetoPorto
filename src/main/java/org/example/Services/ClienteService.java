package org.example.Services;

import org.example.Model.Cliente;
import org.example.Repositories.RepositoryCliente;

public class ClienteService {

    public final RepositoryCliente repository;


    public ClienteService() {
        this.repository = new RepositoryCliente();
    }

        public boolean save(Cliente cliente) throws Exception{
        if (cliente == null)
            throw new IllegalArgumentException("Usuário fornecida é nulo");
        if (cliente.getNome() == null || cliente.getNome().trim().isEmpty())
            throw new IllegalArgumentException("Nome do Usuário é inválido");

        repository.save(cliente);
        return true;
    }

    public boolean delete(Long id) throws Exception {
        if (id == null || id == 0)
            throw new IllegalArgumentException("Id do artista fornecida é nulo");
        repository.delete(id);
        return true;
    }
}
