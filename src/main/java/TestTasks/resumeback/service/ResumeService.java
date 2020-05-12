package TestTasks.resumeback.service;

import TestTasks.resumeback.dao.CourceDao;
import TestTasks.resumeback.dao.ExperienceDao;
import TestTasks.resumeback.model.Course;
import TestTasks.resumeback.model.Experience;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResumeService {
    private final ExperienceDao experienceDao;
    private final CourceDao courceDao;

    public ResumeService(ExperienceDao experienceDao, CourceDao courceDao) {
        this.experienceDao = experienceDao;
        this.courceDao = courceDao;
    }

    public List<Experience> getExperiences() {
        return experienceDao.getExperiences();
    }

    public List<Course> getCourses() {
        return courceDao.getCourses();
    }
}
