package org.scout.education.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegimentEducationController {

    @RequestMapping("/RegimentEducation")
    public String homepage() {
        return "index";
    }
	
    
    @RequestMapping("/RegimentEducation/about")
    public String about() {
        return "about";
    }
}
