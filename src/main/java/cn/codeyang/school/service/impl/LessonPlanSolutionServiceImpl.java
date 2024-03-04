package cn.codeyang.school.service.impl;

import cn.codeyang.school.entity.LessonPlanOpta;
import cn.codeyang.school.entity.LessonPlanSolution;
import cn.codeyang.school.repository.*;
import cn.codeyang.school.service.LessonPlanSolutionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangzy
 */
@Service
@Transactional
@RequiredArgsConstructor
public class LessonPlanSolutionServiceImpl implements LessonPlanSolutionService {
    private final TimeSlotRepository timeSlotRepository;
    private final ClassInfoRepository classInfoRepository;
    private final LessonTypeRepository lessonTypeRepository;
    private final TeacherRepository teacherRepository;
    private final SubjectRepository subjectRepository;

    @Override
    public LessonPlanSolution findById(Long id) {
        LessonPlanSolution lessonPlanSolution = new LessonPlanSolution();
        lessonPlanSolution.setTimeSlotList(timeSlotRepository.findAll());


        List<LessonPlanOpta> lessonPlanList = new ArrayList<>();

        Long lessonPlanId = 1L;

        LessonPlanOpta lessonPlan1 = new LessonPlanOpta();
        lessonPlan1.setId(++lessonPlanId);
        lessonPlan1.setTeacherId(1L);
        lessonPlan1.setSubjectId(1L);
        lessonPlan1.setClassInfoId(1L);
        lessonPlan1.setLessonType(1);

        LessonPlanOpta lessonPlan2 = new LessonPlanOpta();
        lessonPlan2.setId(++lessonPlanId);
        lessonPlan2.setTeacherId(1L);
        lessonPlan2.setSubjectId(1L);
        lessonPlan2.setClassInfoId(1L);
        lessonPlan2.setLessonType(1);

        lessonPlanList.add(lessonPlan1);
        lessonPlanList.add(lessonPlan2);

        lessonPlanSolution.setLessonPlanList(lessonPlanList);

        return lessonPlanSolution;
    }

    @Override
    public void save(LessonPlanSolution lessonPlanSolution) {
        List<LessonPlanOpta> lessonPlanList = lessonPlanSolution.getLessonPlanList();

        for (LessonPlanOpta lessonPlanOpta : lessonPlanList) {
            System.out.println(lessonPlanOpta);
        }
    }
}
