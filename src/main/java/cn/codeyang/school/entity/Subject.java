package cn.codeyang.school.entity;

import cn.codeyang.school.common.core.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "t_subject")
@EntityListeners(value = AuditingEntityListener.class)
public class Subject extends BaseEntity implements Serializable {
    private String name;
    private Integer sort;

    @ManyToMany(mappedBy = "subjectList")
    private List<Teacher> teacherList;
}
