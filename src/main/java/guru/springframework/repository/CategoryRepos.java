package guru.springframework.repository;

import guru.springframework.domain.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Created by thebloez on 09/01/18.
 */
@Repository
public interface CategoryRepos extends CrudRepository<Category, Long> {

    Optional<Category> findCategoryByDescription(String description);
    List<Category> findAllByDescriptionContains(String description);

}
