package TestTasks.resumeback.service;

import TestTasks.resumeback.dao.ExperienceDao;
import TestTasks.resumeback.model.Experience;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResumeService {
    private final ExperienceDao experienceDao;

    public ResumeService(ExperienceDao experienceDao) {
        this.experienceDao = experienceDao;
    }

    public List<Experience> getExperiences() {
        return experienceDao.getExperiences();
    }
}
