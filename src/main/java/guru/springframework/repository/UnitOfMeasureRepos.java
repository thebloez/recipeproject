package guru.springframework.repository;

import guru.springframework.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by thebloez on 09/01/18.
 */
@Repository
public interface UnitOfMeasureRepos extends CrudRepository<UnitOfMeasure, Long>{

    Optional<UnitOfMeasure> findUnitOfMeasureByDescription(String description);
}
