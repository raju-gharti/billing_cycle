package com.billing_cycle.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

import java.util.Date;

@Data
@Document(collection = "Cycle")
public class Cycle {
    @Id
    private String id;
    private String mdn;
    private Date startDate;
    private Date endDate;
    private String userId;
}

