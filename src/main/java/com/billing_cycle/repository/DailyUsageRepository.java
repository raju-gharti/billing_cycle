package com.billing_cycle.repository;

import com.billing_cycle.entity.DailyUsage;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DailyUsageRepository extends MongoRepository<DailyUsage, String> {
}
