package edu.icet.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class VendorDto {
    private Integer vendorId;
    private Integer userId;
    private String companyName;
    private String bio;
    private String phone;
}
