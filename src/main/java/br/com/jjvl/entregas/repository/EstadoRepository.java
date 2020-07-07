package br.com.jjvl.entregas.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.jjvl.entregas.repository.domain.Estado;

@Repository
public interface EstadoRepository extends PagingAndSortingRepository<Estado, Long> {

}
