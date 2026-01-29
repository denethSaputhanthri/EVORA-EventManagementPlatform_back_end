package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ServicesDto {
    private Integer serviceId;
    private Integer vendorId;
    private Integer categoryId;
    private String serviceName;
    private Double basePrice;
    private String description;
}
