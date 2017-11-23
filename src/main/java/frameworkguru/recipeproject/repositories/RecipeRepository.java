package frameworkguru.recipeproject.repositories;

import frameworkguru.recipeproject.domain.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Ryan on 22/11/17.
 */
@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
