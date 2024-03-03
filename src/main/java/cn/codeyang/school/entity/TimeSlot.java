package cn.codeyang.school.entity;

import cn.codeyang.school.common.core.BaseEntity;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalTime;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "t_time_slot")
@EntityListeners(value = AuditingEntityListener.class)
public class TimeSlot extends BaseEntity {
    private Integer sortInDay;
    private LocalTime startTime;
    private LocalTime endTime;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST}, optional = false)
    @JoinColumn(name = "lesson_type_id")
    private LessonType lessonType;
}
