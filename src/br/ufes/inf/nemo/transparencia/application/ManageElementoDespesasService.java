package br.ufes.inf.nemo.transparencia.application;

import javax.ejb.Local;

import br.ufes.inf.nemo.transparencia.domain.ElementoDespesa;
import br.ufes.inf.nemo.util.ejb3.application.CrudService;

/**
*
* @author Caio Barbosa (caio.barbosa@outlook.com)
* @version 1.0
*/
@Local
public interface ManageElementoDespesasService extends CrudService<ElementoDespesa> {

}
