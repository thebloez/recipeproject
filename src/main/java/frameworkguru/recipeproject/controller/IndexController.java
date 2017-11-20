package frameworkguru.recipeproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Ryan on 21/11/17.
 */
@Controller
public class IndexController {

    @RequestMapping({"","/","/index"})
    public String indexPage(){
        return "index";
    }
}
