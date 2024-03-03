package cn.codeyang.school.service;

import cn.codeyang.school.entity.LessonType;

public interface LessonTypeService {
    void save(LessonType lessonFeeSetting);

    /**
     * 根据类型type查找类型描述
     * @param type
     * @return
     */
    LessonType findByType(Integer type);
}
