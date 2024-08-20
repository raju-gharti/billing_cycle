package com.billing_cycle.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CycleDto {
    private String mdn;
    private String startDate;
    private String endDate;
    private String userId;
}
