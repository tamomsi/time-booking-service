package com.fantasy.tbs.service;

import com.fantasy.tbs.domain.TimeBookDTO;
import com.fantasy.tbs.domain.TimeBooking;
import java.util.List;
import java.util.Optional;
import java.time.Duration;
import java.time.LocalDate;

/**
 * Service Interface for managing {@link TimeBooking}.
 */
public interface TimeBookingService {
    /**
     * Save a timeBooking.
     *
     * @param timeBooking the entity to save.
     * @return the persisted entity.
     */
    TimeBooking save(TimeBooking timeBooking);

    /**
     * Partially updates a timeBooking.
     *
     * @param timeBooking the entity to update partially.
     * @return the persisted entity.
     */
    Optional<TimeBooking> partialUpdate(TimeBooking timeBooking);

    /**
     * Get all the timeBookings.
     *
     * @return the list of entities.
     */
    List<TimeBooking> findAll();

    /**
     * Get the "id" timeBooking.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<TimeBooking> findOne(Long id);

    /**
     * Delete the "id" timeBooking.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);

    /**
     * Saves the new booking time to the database
     *
     * @param timeBookDTO
     */
    void bookTime(TimeBookDTO timeBookDTO);

    /**
     * Calculates the total working time for a given user on a specific day.
     *
     * @param userId the ID of the user
     * @param date   the date for which to calculate the working time
     * @return the total working time for the user on the given day
     */
    Duration calculateWorkingTimeForDay(Long userId, LocalDate date); // TODO: Implement logic to handle edge cases such as no time bookings for the user or date
}

