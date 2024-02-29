package cn.codeyang.school.repository;

import cn.codeyang.school.entity.LessonType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonTypeRepository extends JpaRepository<LessonType, Long> {
    LessonType findByType(Integer type);
}
