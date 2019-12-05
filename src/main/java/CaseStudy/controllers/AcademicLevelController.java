package CaseStudy.controllers;

import CaseStudy.models.AcademicLevel;
import CaseStudy.services.AcademicLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AcademicLevelController {

    @Autowired
    private AcademicLevelService academicLevelService;

    @GetMapping("/admin/levels")
    public ModelAndView showLevel(Pageable pageable) {
        Page<AcademicLevel> academicLevels = academicLevelService.findAll(pageable);
        ModelAndView modelAndView = new ModelAndView("/admin/academiclevel/list");
    }
}
