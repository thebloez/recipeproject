package guru.springframework.controllers;

import guru.springframework.domain.Category;
import guru.springframework.domain.UnitOfMeasure;
import guru.springframework.repository.CategoryRepos;
import guru.springframework.repository.UnitOfMeasureRepos;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * Created by jt on 6/1/17.
 */
@Controller
public class IndexController {

    private CategoryRepos categoryRepos;
    private UnitOfMeasureRepos unitOfMeasureRepos;

    public IndexController(CategoryRepos categoryRepos, UnitOfMeasureRepos unitOfMeasureRepos) {
        this.categoryRepos = categoryRepos;
        this.unitOfMeasureRepos = unitOfMeasureRepos;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(){
        Optional<Category> cats = categoryRepos.findCategoryByDescription("American");
        Optional<UnitOfMeasure> uom = unitOfMeasureRepos.findUnitOfMeasureByDescription("Cup");

        System.out.println("Id category is : " + cats.get().getId());
        System.out.println("Id uom is : " + uom.get().getId());

        return "index";
    }
}
