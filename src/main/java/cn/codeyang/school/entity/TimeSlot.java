package cn.codeyang.school.entity;

import cn.codeyang.school.common.core.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalTime;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "t_time_slot")
@EntityListeners(value = AuditingEntityListener.class)
public class TimeSlot extends BaseEntity {
    private Integer sortInDay;
    private LocalTime startTime;
    private LocalTime endTime;
    private Integer type;
}
