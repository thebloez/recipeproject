package guru.springframework.restcontrollers;

import guru.springframework.RestResponse.SuccessRestResponse;
import guru.springframework.domain.Category;
import guru.springframework.domain.UnitOfMeasure;
import guru.springframework.repository.CategoryRepos;
import guru.springframework.repository.UnitOfMeasureRepos;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Created by thebloez on 09/01/18.
 */
@RestController
@RequestMapping("/rest")
public class Rest {

    private CategoryRepos categoryRepos;
    private UnitOfMeasureRepos unitOfMeasureRepos;

    public Rest(CategoryRepos categoryRepos, UnitOfMeasureRepos unitOfMeasureRepos) {
        this.categoryRepos = categoryRepos;
        this.unitOfMeasureRepos = unitOfMeasureRepos;
    }

    @GetMapping("/category/{cats}")
    public SuccessRestResponse<Category> getCategory(@PathVariable(value = "cats") String cats){

        Optional<Category> result = categoryRepos.findCategoryByDescription(cats);

        return new SuccessRestResponse<>(result);
    }

    @GetMapping("/category-all")
    public SuccessRestResponse<Category> getAllCategoryByDesc(@RequestParam(value = "desc") String cats){

        List<Category> result = categoryRepos.findAllByDescriptionContains(cats);

        return new SuccessRestResponse<>(result);
    }

    @GetMapping("/uom/{uomdesc}")
    public SuccessRestResponse<UnitOfMeasure> getUom(@PathVariable(value = "uomdesc") String desc){

        Optional<UnitOfMeasure> uom = unitOfMeasureRepos.findUnitOfMeasureByDescription(desc);

        return new SuccessRestResponse<>(uom);
    }
}
