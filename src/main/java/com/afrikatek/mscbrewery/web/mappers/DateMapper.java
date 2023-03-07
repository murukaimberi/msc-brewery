package com.afrikatek.mscbrewery.web.mappers;

import org.springframework.stereotype.Component;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/**
 * project msc-brewery
 * created by murukai
 * created on 2023/03/07 at 18:48:54
 */
@Component
public class DateMapper {
    public OffsetDateTime asOffsetDateTime(Timestamp timestamp){
        if(timestamp != null){
            return OffsetDateTime.of(
                    timestamp.toLocalDateTime().getYear(),
                    timestamp.toLocalDateTime().getMonthValue(),
                    timestamp.toLocalDateTime().getDayOfMonth(),
                    timestamp.toLocalDateTime().getHour(),
                    timestamp.toLocalDateTime().getMinute(),
                    timestamp.toLocalDateTime().getSecond(),
                    timestamp.toLocalDateTime().getNano(),
                    ZoneOffset.UTC
            );
        }else {
            return null;
        }
    }

    public Timestamp asTimestamp(OffsetDateTime offsetDateTime){
        if(offsetDateTime != null){
            return Timestamp.valueOf(offsetDateTime.atZoneSameInstant(ZoneOffset.UTC).toLocalDateTime());
        }else {
            return null;
        }
    }
}
