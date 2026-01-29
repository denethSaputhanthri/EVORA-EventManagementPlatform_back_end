package edu.icet.service;

import edu.icet.dto.ServicesDto;

import java.util.List;

public interface ServicesService {
    void addService(ServicesDto servicesDto);
    void updateService(ServicesDto servicesDto);
    void deleteService(Integer id);
    ServicesDto searchServiceById(Integer id);
    List<ServicesDto> searchServiceByName(String name);
    List<ServicesDto> searchServiceByPrice(Double price);
    List<ServicesDto> getAllServices();
    List<ServicesDto> getAllServicesByName(String name);
    List<ServicesDto> getAllServicesByVendor(Integer id);
}
