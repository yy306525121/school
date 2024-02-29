package cn.codeyang.school.service.impl;

import cn.codeyang.school.entity.TimeSlot;
import cn.codeyang.school.repository.TimeSlotRepository;
import cn.codeyang.school.service.TimeSlotService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TimeSlotServiceImpl implements TimeSlotService {
    private final TimeSlotRepository timeSlotRepository;


    @Override
    public void save(TimeSlot timeSlot) {
        timeSlotRepository.save(timeSlot);
    }
}
