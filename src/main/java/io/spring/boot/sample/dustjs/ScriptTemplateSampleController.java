package io.spring.boot.sample.dustjs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chanwook
 */
@Controller
public class ScriptTemplateSampleController {

    @RequestMapping("/dust/hello")
    public String hello(ModelMap model) {
        model.put("title", "Greeting!!");
        return "hello";
    }

    @RequestMapping("/dust/partial")
    public String partial() {
        return "template3";
    }

}
