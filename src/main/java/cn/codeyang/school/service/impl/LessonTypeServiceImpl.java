package cn.codeyang.school.service.impl;

import cn.codeyang.school.entity.LessonType;
import cn.codeyang.school.repository.LessonTypeRepository;
import cn.codeyang.school.service.LessonTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LessonTypeServiceImpl implements LessonTypeService {
    private final LessonTypeRepository lessonTypeRepository;

    @Override
    public void save(LessonType lessonFeeSetting) {
        lessonTypeRepository.save(lessonFeeSetting);
    }

    @Override
    public LessonType findByType(Integer type) {
        return lessonTypeRepository.findByType(type);
    }
}
