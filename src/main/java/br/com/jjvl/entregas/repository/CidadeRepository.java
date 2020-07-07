package br.com.jjvl.entregas.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.jjvl.entregas.repository.domain.Estado;

@Repository
public interface CidadeRepository extends PagingAndSortingRepository<Estado, Long> {

}
