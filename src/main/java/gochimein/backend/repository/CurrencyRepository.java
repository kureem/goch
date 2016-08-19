package gochimein.backend.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import gochimein.backend.model.Currency;

public interface CurrencyRepository extends PagingAndSortingRepository<Currency, Long>{

}
