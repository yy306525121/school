package cn.codeyang.school.controller;

import cn.codeyang.school.dto.TimeSlotSaveReq;
import cn.codeyang.school.entity.LessonType;
import cn.codeyang.school.service.LessonTypeService;
import cn.codeyang.school.service.TimeSlotService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/timeSlot")
@RequiredArgsConstructor
public class TimeSlotController {
    private final TimeSlotService timeSlotService;
    private final LessonTypeService lessonTypeService;

    @PostMapping("/save")
    public void save(@RequestBody TimeSlotSaveReq req) {
        Integer lessonTypeId = req.getLessonTypeId();
        LessonType lessonType = lessonTypeService.findByType(lessonTypeId);
    }
}
