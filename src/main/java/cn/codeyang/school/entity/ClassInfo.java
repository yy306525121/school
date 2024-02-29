package cn.codeyang.school.entity;

import cn.codeyang.school.common.core.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.List;
import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "t_class_info")
@EntityListeners(value = AuditingEntityListener.class)
public class ClassInfo extends BaseEntity {
    private String name;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private ClassInfo parent;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private Set<ClassInfo> children;

    @OneToMany(mappedBy = "classInfo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<LessonPlan> lessonPlanList;
}
