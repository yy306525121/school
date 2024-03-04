package cn.codeyang.school.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.optaplanner.core.api.domain.solution.PlanningEntityCollectionProperty;
import org.optaplanner.core.api.domain.solution.PlanningScore;
import org.optaplanner.core.api.domain.solution.PlanningSolution;
import org.optaplanner.core.api.domain.solution.ProblemFactCollectionProperty;
import org.optaplanner.core.api.domain.valuerange.ValueRangeProvider;
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;
import org.optaplanner.core.api.solver.SolverStatus;

import java.util.List;

/**
 * @author yangzy
 */
@Getter
@Setter
@PlanningSolution
public class LessonPlanSolution {
    @ValueRangeProvider
    @ProblemFactCollectionProperty
    private List<TimeSlot> timeSlotList;


    @PlanningEntityCollectionProperty
    private List<LessonPlanOpta> lessonPlanList;

    @PlanningScore
    private HardSoftScore score;

    private SolverStatus solverStatus;
}