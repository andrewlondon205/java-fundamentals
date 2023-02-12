package com.pluralsight.maurice.m3;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;


@AllArgsConstructor
@ToString
public class WorkPeriod {

    private final LocalDateTime start;
    private final LocalDateTime end;

    public static WorkPeriod of(LocalDateTime start, LocalDateTime end) {
        return new WorkPeriod(start,end);

    }

}
