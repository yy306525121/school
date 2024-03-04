package cn.codeyang.school.entity;

import cn.codeyang.school.common.core.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.math.BigDecimal;
import java.util.List;

/**
 * 课时费设置
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "t_lesson_type")
@EntityListeners(value = AuditingEntityListener.class)
public class LessonType extends BaseEntity {
    private String name;
    private Integer type;
    private BigDecimal price;

}
