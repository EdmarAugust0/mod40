
/**
 * 
 */
package br.com.edmar.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.edmar.domain.Cliente;

/**
 * @author rodrigo.pires
 *
 */
@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Long>{

}
