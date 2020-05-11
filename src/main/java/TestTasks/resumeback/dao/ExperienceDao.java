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
        experience2.setId(getNewId());
        experience2.setDate("Март 2008 — июль 2019");
        experience2.setPlace("ООО \"С7 КАРГО\"");
        experience2.setPosition("Специалист по таможенному оформлению");
        experience2.setResponsibility("таможенное оформление товаров перемещаемых в рамках внешнеторговых контрактов.");

        Experience experience3 = new Experience();
        experience3.setId(getNewId());
        experience3.setDate("Апрель 2004 — март 2008");
        experience3.setPlace("ОАО \"Авиакомпания \"Сибирь\"");
        experience3.setPosition("Эксперт по грузовым перевозкам");
        experience3.setResponsibility("Создание и поддержание агентской сети продаж грузовых авиаперевозок.");

        Experience experience4 = new Experience();
        experience4.setId(getNewId());
        experience4.setDate("Июнь 2002 — март 2004");
        experience4.setPlace("ОАО \"Сибакадембанк\"");
        experience4.setPosition("Специалист управления маркетинга и рекламы");
        experience4.setResponsibility("Анализ рынка розничных банковских услуг. Разработка, внедрение и продвижение банковских продуктов и услуг. Формирование имиджа банка. Работа с подрядчиками по производству рекламы.");

        experiencesList.add(experience1);
        experiencesList.add(experience2);
        experiencesList.add(experience3);
        experiencesList.add(experience4);
    }

    private int getNewId() {
        return idSequence.addAndGet(1);
    }

    public List<Experience> getExperiences() {
        return experiencesList;
    }
}
