package cn.codeyang.school.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalTime;

@Data
public class TimeSlotSaveReq implements Serializable {
    private static final long serialVersionUID = -2000956765051463534L;

    private Integer sortInDay;
    private LocalTime startTime;
    private LocalTime endTime;
    private Integer lessonTypeId;
}
