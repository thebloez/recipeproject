package guru.springframework.repository;

import guru.springframework.domain.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeRepos extends JpaRepository<Recipe, Integer> {

    @Override
    List<Recipe> findAll();

}
