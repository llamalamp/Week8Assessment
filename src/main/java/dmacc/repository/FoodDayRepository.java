package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.FoodDay;

/**
 * @author kenne-krcutkomp
 * CIS175 - Fall 2022
 */
@Repository
public interface FoodDayRepository extends JpaRepository<FoodDay, Long> {

}
