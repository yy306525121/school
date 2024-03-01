package cn.codeyang.school.opta.solver;

import cn.codeyang.school.entity.LessonPlan;
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;
import org.optaplanner.core.api.score.stream.Constraint;
import org.optaplanner.core.api.score.stream.ConstraintFactory;
import org.optaplanner.core.api.score.stream.ConstraintProvider;
import org.optaplanner.core.api.score.stream.Joiners;

/**
 * @author yangzy
 */
public class LessonPlanConstraintProvider implements ConstraintProvider {
    @Override
    public Constraint[] defineConstraints(ConstraintFactory constraintFactory) {
        return new Constraint[] {
                // Hard constraints
                uniqueConflict(constraintFactory),
        };
    }


    Constraint uniqueConflict(ConstraintFactory constraintFactory) {
        // A room can accommodate at most one lesson at the same time.
        return constraintFactory
                // Select each pair of 2 different lessons ...
                .forEachUniquePair(LessonPlan.class,
                        // ... in the same timeslot ...
                        Joiners.equal(LessonPlan::getTimeSlot),
                        // ... in the same room ...
                        Joiners.equal(LessonPlan::getClassInfo),
                        Joiners.equal(LessonPlan::getLessonType),
                        Joiners.equal(LessonPlan::getSubject),
                        Joiners.equal(LessonPlan::getTeacher))
                // ... and penalize each pair with a hard weight.
                .penalize(HardSoftScore.ONE_HARD)
                .asConstraint("classInfo conflict");
    }
}
