package cn.codeyang.school.controller;

import cn.codeyang.school.entity.LessonPlanSolution;
import cn.codeyang.school.service.LessonPlanSolutionService;
import lombok.RequiredArgsConstructor;
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;
import org.optaplanner.core.api.solver.SolutionManager;
import org.optaplanner.core.api.solver.SolverManager;
import org.optaplanner.core.api.solver.SolverStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangzy
 */
@RestController
@RequestMapping("/solution")
@RequiredArgsConstructor
public class LessonPlanSolutionController {
    private final SolverManager<LessonPlanSolution, Long> solverManager;
    private final SolutionManager<LessonPlanSolution, HardSoftScore> solutionManager;
    private final LessonPlanSolutionService lessonPlanSolutionService;

    @GetMapping
    public LessonPlanSolution getSolution() {
        SolverStatus solverStatus = getSolverStatus();
        LessonPlanSolution lessonPlanSolution = lessonPlanSolutionService.findById(1L);
        solutionManager.update(lessonPlanSolution);
        lessonPlanSolution.setSolverStatus(solverStatus);
        return lessonPlanSolution;
    }


    public SolverStatus getSolverStatus() {
        return solverManager.getSolverStatus(1L);
    }
}
