package cn.codeyang.school.service.impl;

import cn.codeyang.school.entity.LessonPlanSolution;
import cn.codeyang.school.repository.*;
import cn.codeyang.school.service.LessonPlanSolutionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
        lessonPlanSolution.setClassInfoList(classInfoRepository.findAll());
        lessonPlanSolution.setLessonTypeList(lessonTypeRepository.findAll());
        lessonPlanSolution.setTeacherList(teacherRepository.findAll());
        lessonPlanSolution.setSubjectList(subjectRepository.findAll());

        return lessonPlanSolution;
    }
}
