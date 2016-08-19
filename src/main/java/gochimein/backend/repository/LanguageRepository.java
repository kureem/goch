package gochimein.backend.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import gochimein.backend.model.Language;

public interface LanguageRepository extends PagingAndSortingRepository<Language, Long>{

}
