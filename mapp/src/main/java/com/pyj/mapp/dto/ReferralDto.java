package com.pyj.mapp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReferralDto {
    private Long referralNo;
    private Long referrerNo;   // 추천한 사람
    private Long referredNo;   // 추천받은 사람
    private Date createdAt;
}