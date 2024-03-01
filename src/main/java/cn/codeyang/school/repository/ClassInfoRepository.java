package cn.codeyang.school.repository;

import cn.codeyang.school.entity.ClassInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author yangzy
 */
public interface ClassInfoRepository extends JpaRepository<ClassInfo, Long> {
}
