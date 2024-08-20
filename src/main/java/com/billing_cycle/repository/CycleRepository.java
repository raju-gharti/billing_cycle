package com.billing_cycle.repository;

import com.billing_cycle.entity.Cycle;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CycleRepository extends MongoRepository<Cycle, String> {
}
