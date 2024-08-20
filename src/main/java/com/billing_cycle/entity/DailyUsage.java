package com.billing_cycle.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

import java.util.Date;

@Data
@Document(collection = "Daily_Usage")
public class DailyUsage {
    @Id
    private String id;
    private String mdn;
    private String userId;
    private Date usageDate;
    private Double usedInMb;
}

