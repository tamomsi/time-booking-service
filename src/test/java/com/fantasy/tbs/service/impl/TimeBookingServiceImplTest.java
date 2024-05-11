package com.fantasy.tbs.service.impl;

import com.fantasy.tbs.domain.TimeBooking;
import com.fantasy.tbs.repository.TimeBookingRepository;
import com.fantasy.tbs.service.mapper.TimeBookMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class TimeBookingServiceImplTest {

    @Mock
    private TimeBookingRepository timeBookingRepository;

    @Mock
    private TimeBookMapper timeBookMapper;

    @InjectMocks
    private TimeBookingServiceImpl timeBookingService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void calculateWorkingTimeForDay() {
        // TODO: Write unit tests for calculateWorkingTimeForDay method

        // Mock data
        Long userId = 1L;
        LocalDate date = LocalDate.now();
        TimeBooking booking = new TimeBooking();
        booking.setStartTime(date.atStartOfDay());
        booking.setEndTime(date.atTime(8, 0));
        List<TimeBooking> bookings = Collections.singletonList(booking);

        // Mock repository behavior
        when(timeBookingRepository.findByUserIdAndDate(userId, date)).thenReturn(bookings);

        // Call the method under test
        Duration result = timeBookingService.calculateWorkingTimeForDay(userId, date);

        // TODO: Add assertions to verify the correctness of the result

        // Verify repository method invocation
        verify(timeBookingRepository, times(1)).findByUserIdAndDate(userId, date);

        // TODO: Add more assertions and edge case tests
    }
}
