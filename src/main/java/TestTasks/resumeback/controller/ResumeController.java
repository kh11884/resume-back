package TestTasks.resumeback.controller;

import TestTasks.resumeback.model.Experience;
import TestTasks.resumeback.service.ResumeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/resume/rpc/api/v1")
public class ResumeController {
    private static final Logger logger = LoggerFactory.getLogger(ResumeController.class);
    private final ResumeService resumeService;

    public ResumeController(ResumeService resumeService) {
        this.resumeService = resumeService;
    }


    @RequestMapping(value = "getExperience", method = RequestMethod.GET)
    @ResponseBody
    public List<Experience> getExperiences() {
        logger.info("getExperience");
        return resumeService.getExperiences();
    }
}
