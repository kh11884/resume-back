package TestTasks.resumeback.dao;

import TestTasks.resumeback.model.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class CourceDao {
    private List<Course> coursesList = new ArrayList<>();
    private AtomicInteger idSequence = new AtomicInteger(0);

    public CourceDao() {
        Course course1 = new Course();
        course1.setDate("январь - март 2020");
        course1.setUniversity("Academ IT School");
        course1.setChapter("Серверная веб-разработка на JAVA");
        course1.setId(getNewId());

        Course course2 = new Course();
        course2.setDate("октябрь - декабрь 2019");
        course2.setUniversity("Academ IT School");
        course2.setChapter("Клиентская веб-разработка (HTML, CSS, JAVASCRIPT)");
        course2.setId(getNewId());

        Course course3 = new Course();
        course3.setDate("июль - сентябрь 2019");
        course3.setUniversity("Academ IT School");
        course3.setChapter("Объектно-ориентированное программирование на JAVA");
        course3.setId(getNewId());

        Course course4 = new Course();
        course4.setDate("апрель - июнь 2019");
        course4.setUniversity("Academ IT School");
        course4.setChapter("Тестирование программного обеспечения");
        course4.setId(getNewId());

        Course course5 = new Course();
        course5.setDate("апрель - июнь 2019");
        course5.setUniversity("Academ IT School");
        course5.setChapter("Основы баз данных и язык SQL");
        course5.setId(getNewId());

        Course course6 = new Course();
        course6.setDate("январь - март 2019");
        course6.setUniversity("Academ IT School");
        course6.setChapter("Основы программирования JAVA");
        course6.setId(getNewId());

        Course course7 = new Course();
        course7.setDate("сентябрь 2009");
        course7.setUniversity("Сибирский центр развития авиационного бизнеса");
        course7.setChapter("Перевозка опасных грузов воздушным транспортом");
        course7.setId(getNewId());

        Course course8 = new Course();
        course8.setDate("февраль-апрель 2008");
        course8.setUniversity("НП \"ЦК ОСТО СФО\"");
        course8.setChapter("Курсы по подготовке специалистов по таможенному оформлению");
        course8.setId(getNewId());

        Course course9 = new Course();
        course9.setDate("октябрь 2005");
        course9.setUniversity("IATA Training & Development Institute");
        course9.setChapter("Навыки и процедуры грузовых перевозок воздушным транспортом");
        course9.setId(getNewId());

        coursesList.add(course1);
        coursesList.add(course2);
        coursesList.add(course3);
        coursesList.add(course4);
        coursesList.add(course5);
        coursesList.add(course6);
        coursesList.add(course7);
        coursesList.add(course8);
        coursesList.add(course9);
    }

    private int getNewId() {
        return idSequence.addAndGet(1);
    }

    public List<Course> getCourses() {
        return coursesList;
    }
}
