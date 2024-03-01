package cn.codeyang.school.entity;

import cn.codeyang.school.common.core.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.optaplanner.core.api.domain.entity.PlanningEntity;
import org.optaplanner.core.api.domain.variable.PlanningVariable;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@PlanningEntity
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "t_lesson_plan")
@EntityListeners(value = AuditingEntityListener.class)
public class LessonPlan extends BaseEntity {


    @PlanningVariable
    @ManyToOne(optional = false, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "class_info_id")
    private ClassInfo classInfo;

    @PlanningVariable
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    private Integer dayOfWeek;

    @PlanningVariable
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "subject_id")
    private Subject subject;

    @PlanningVariable
    @ManyToOne(optional = false, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "time_slot_id")
    private TimeSlot timeSlot;

    @PlanningVariable
    @ManyToOne(optional = false, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "lesson_type_id")
    private LessonType lessonType;
}
