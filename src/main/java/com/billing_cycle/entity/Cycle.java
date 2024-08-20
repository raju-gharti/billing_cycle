package com.billing_cycle.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Cycle")
public class Cycle {
    @Id
    private String id;
    private String mdn;
    private Date startDate;
    private Date endDate;
    private String userId;
}

