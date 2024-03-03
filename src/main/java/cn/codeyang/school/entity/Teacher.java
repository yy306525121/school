package cn.codeyang.school.entity;

import cn.codeyang.school.common.core.BaseEntity;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "t_teacher")
@EntityListeners(value = AuditingEntityListener.class)
public class Teacher extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 3116177604068804712L;

    @Column(name = "name", length = 20)
    private String name;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "t_teacher_subject", joinColumns = @JoinColumn(name = "teacher_id"), inverseJoinColumns = @JoinColumn(name = "subject_id"))
    List<Subject> subjectList;

}
