package cn.codeyang.school.repository;

import cn.codeyang.school.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
