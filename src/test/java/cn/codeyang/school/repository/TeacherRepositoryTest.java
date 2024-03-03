package cn.codeyang.school.repository;

import cn.codeyang.school.entity.Subject;
import cn.codeyang.school.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@ActiveProfiles("dev")
class TeacherRepositoryTest {
    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    public void testSave() {
        Teacher teacher = new Teacher();
        teacher.setName("张三");
        teacherRepository.save(teacher);
    }

    @Test
    public void testCascadeSave() {
        Subject subject1 = new Subject();
        subject1.setName("语文");

        Subject subject2 = new Subject();
        subject2.setName("英语");

        List<Subject> subjectList = new ArrayList<>();
        subjectList.add(subject1);
        subjectList.add(subject2);

        Teacher teacher = new Teacher();
        teacher.setName("李四");

        teacher.setSubjectList(subjectList);

        teacherRepository.save(teacher);
        teacherRepository.flush();
    }

    @Test
    @Transactional
    public void testSelect() {
        Teacher teacher = teacherRepository.findByName("李四");
        List<Subject> subjectList = teacher.getSubjectList();
        System.out.println(subjectList);
        System.out.println(teacher);
    }
}