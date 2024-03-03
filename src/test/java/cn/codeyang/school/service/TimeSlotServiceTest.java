package cn.codeyang.school.service;

import cn.codeyang.school.common.constant.Constant;
import cn.codeyang.school.entity.LessonType;
import cn.codeyang.school.entity.TimeSlot;
import cn.codeyang.school.repository.LessonTypeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("dev")
class TimeSlotServiceTest {
    @Autowired
    private TimeSlotService timeSlotService;

    @Autowired
    private LessonTypeService lessonTypeService;

    @Test
    @Transactional
    public void testSave() {
        LessonType lessonType = lessonTypeService.findByType(Constant.TIME_SLOT_TYPE_NORMAL);

        TimeSlot timeSlot = new TimeSlot();
        timeSlot.setSortInDay(1);
        timeSlot.setStartTime(LocalTime.now());
        timeSlot.setEndTime(LocalTime.now());
        timeSlot.setLessonType(lessonType);
        timeSlotService.save(timeSlot);
    }

    @Test
    @Transactional
    public void testSelect() {
        LessonType lessonType = lessonTypeService.findByType(Constant.TIME_SLOT_TYPE_NORMAL);
        System.out.println(lessonType);
    }
}