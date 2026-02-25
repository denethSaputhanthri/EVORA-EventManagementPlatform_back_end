package edu.icet.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Services {
    private Integer serviceId;
    private Integer vendorId;
    private Integer categoryId;
    private String serviceName;
    private Double basePrice;
    private String description;
}
