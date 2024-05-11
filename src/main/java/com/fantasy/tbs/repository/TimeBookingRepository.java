package com.fantasy.tbs.repository;

import com.fantasy.tbs.domain.TimeBooking;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;

/**
 * Spring Data SQL repository for the TimeBooking entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TimeBookingRepository extends JpaRepository<TimeBooking, Long> {
    // TODO: Adjust the method to properly query the database for time bookings based on the user ID and date
    List<TimeBooking> findByUserIdAndDate(Long userId, LocalDate date);
}
