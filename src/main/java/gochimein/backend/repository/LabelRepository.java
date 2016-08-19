package gochimein.backend.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import gochimein.backend.model.Label;

public interface LabelRepository extends PagingAndSortingRepository<Label, Long> {

	public List<Label> findByLanguageCode(@Param("code") String code);
}
