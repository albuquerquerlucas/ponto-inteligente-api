package br.com.luke.pontointeligente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import br.com.luke.pontointeligente.api.entities.Funcionario;

@Transactional(readOnly = true)
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{
	
	public Funcionario findByCpf(String cpf);
	
	public Funcionario findByEmail(String email);
	
	public Funcionario FindByCpfOrEmail(String cpf, String email);
}
