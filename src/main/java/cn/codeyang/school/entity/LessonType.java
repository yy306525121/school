package cn.codeyang.school.entity;

import cn.codeyang.school.common.core.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.math.BigDecimal;

/**
 * 课时费设置
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "t_lesson_type")
@EntityListeners(value = AuditingEntityListener.class)
public class LessonType extends BaseEntity {
    private String name;
    private Integer type;
    private BigDecimal price;

}
