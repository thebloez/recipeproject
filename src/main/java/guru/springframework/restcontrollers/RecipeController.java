package guru.springframework.restcontrollers;

import guru.springframework.domain.Recipe;
import guru.springframework.repository.RecipeRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by thebloez on 08/01/18.
 */
@RestController
@RequestMapping("/rest")
public class RecipeController {

    @Autowired private RecipeRepos recipeRepos;

    @GetMapping("/all-recipes")
    public List<Recipe> getAllRecipe(){
        List<Recipe> result = recipeRepos.findAll();

        return result;
    }

}
