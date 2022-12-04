package one.digital.innovation.gof.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import one.digital.innovation.gof.model.Cliente;
import one.digital.innovation.gof.service.ClienteService;

/**
 * Implementação da <b>Strategy</b> ClienteService, a qual pode ser
 * injetada pelo Spring (via Autowired). Com isso, como essa classe é um
 * Service, ela será tratada como um <b>Singleton</b>.
 *
 * @author falvojr
 */
@Service
public class ClienteServiceImpl implements ClienteService {

	// Singleton: Injetar os componentes do Spring com @Autowired.
	// Strategy: Implementar os métodos definidos na interface.
	// Facade: Abstrair integrações com subsistemas, provendo uma interface simples.

	@Override
	public Iterable<Cliente> buscarTodos() {
		// Buscar todos os Clientes.
		return null;
	}

	@Override
	public Cliente buscarPorId(Long id) {
		// Buscar Cliente por ID.

		return null;
	}

	@Override
	public void inserir(Cliente cliente) {

	}

	@Override
	public void atualizar(Long id, Cliente cliente) {
		// Buscar Cliente por ID, caso exista:

	}

	@Override
	public void deletar(Long id) {
		// Deletar Cliente por ID.

	}
}