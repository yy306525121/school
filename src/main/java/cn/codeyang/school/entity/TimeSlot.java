package cn.codeyang.school.entity;

import cn.codeyang.school.common.core.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
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

    /**
     * 1: 早自习
     * 2: 课时
     * 3: 晚自习
     */
    private Integer type;


}
