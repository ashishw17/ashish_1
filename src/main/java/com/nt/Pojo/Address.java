package com.nt.Pojo;

import lombok.*;

@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Address
{
    private int houseNo;
    private String buildingName;
    private String areaName;
    private String city;
}
