package TestTasks.resumeback.dao;

import TestTasks.resumeback.model.Experience;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class ExperienceDao {
    private List<Experience> experiencesList = new ArrayList<>();
    private AtomicInteger idSequence = new AtomicInteger(0);

    public ExperienceDao() {
        Experience experience1 = new Experience();
        experience1.setId(getNewId());
        experience1.setDate("Июль 2019 — по настоящее время");
        experience1.setPlace("ООО \"С7 КАРГО\"");
        experience1.setPosition("Старший декларант");
        experience1.setResponsibility("Старший смены. организация работы в смене: распределение текущей работы, контроль исполнения.");

        Experience experience2 = new Experience();
        experience1.setId(getNewId());
        experience1.setDate("Март 2008 — июль 2019");
        experience1.setPlace("ООО \"С7 КАРГО\"");
        experience1.setPosition("Специалист по таможенному оформлению");
        experience1.setResponsibility("таможенное оформление товаров перемещаемых в рамках внешнеторговых контрактов.");

        Experience experience3 = new Experience();
        experience1.setId(getNewId());
        experience1.setDate("Июль 2019 — по настоящее время");
        experience1.setPlace("ООО \"С7 КАРГО\"");
        experience1.setPosition("Старший декларант");
        experience1.setResponsibility("Старший смены. организация работы в смене: распределение текущей работы, контроль исполнения.");

        Experience experience4 = new Experience();
        experience1.setId(getNewId());
        experience1.setDate("Июль 2019 — по настоящее время");
        experience1.setPlace("ООО \"С7 КАРГО\"");
        experience1.setPosition("Старший декларант");
        experience1.setResponsibility("Старший смены. организация работы в смене: распределение текущей работы, контроль исполнения.");

        experiencesList.add(experience1);
        experiencesList.add(experience2);
        experiencesList.add(experience3);
        experiencesList.add(experience4);
    }

    private int getNewId() {
        return idSequence.addAndGet(1);
    }

    public List<Experience> getExperiences(){
        return experiencesList;
    }
}
