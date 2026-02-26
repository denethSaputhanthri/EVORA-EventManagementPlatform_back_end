package edu.icet.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Vendor {
    private Integer vendorId;
    private Integer userId;
    private String companyName;
    private String bio;
    private String phone;
}
