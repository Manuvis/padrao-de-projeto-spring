package dio.digitalinnovation.padraodeprojetospring.service;

import dio.digitalinnovation.padraodeprojetospring.model.Cliente;

public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);


    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);

}
