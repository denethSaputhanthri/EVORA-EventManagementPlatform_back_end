package edu.icet.service;

import edu.icet.dto.ServicesDto;

import java.util.List;

public interface ServicesService {
    void addService();
    void updateService();
    void deleteService(Integer id);
    ServicesDto searchServiceById(Integer id);
    ServicesDto searchServiceByName(String name);
    List<ServicesDto> searchServiceByPrice(Double price);
    List<ServicesDto> getAllServices();
    List<ServicesDto> getAllServicesByName(String name);
    List<ServicesDto> getAllServicesByVendor(Integer id);
}
