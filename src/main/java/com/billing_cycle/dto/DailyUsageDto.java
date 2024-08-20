package com.billing_cycle.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class DailyUsageDto {
    private String mdn;
    private String userId;
    private String usageDate;
    private Double usedInMb;
}
