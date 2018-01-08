package guru.springframework.repository;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeRepos extends CrudRepository<Recipe, Long> {

    @Override
    List<Recipe> findAll();
}
