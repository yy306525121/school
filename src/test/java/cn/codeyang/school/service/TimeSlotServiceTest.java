package cn.codeyang.school.service;

import cn.codeyang.school.common.constant.Constant;
import cn.codeyang.school.entity.TimeSlot;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("dev")
class TimeSlotServiceTest {
    @Autowired
    private TimeSlotService timeSlotService;

    @Test
    public void testSave() {
        TimeSlot timeSlot = new TimeSlot();
        timeSlot.setSortInDay(1);
        timeSlot.setStartTime(LocalTime.now());
        timeSlot.setEndTime(LocalTime.now());
        timeSlot.setType(Constant.TIME_SLOT_TYPE_NORMAL);
        timeSlotService.save(timeSlot);
    }
}