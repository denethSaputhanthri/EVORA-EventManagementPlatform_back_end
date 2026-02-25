package edu.icet.service;

import edu.icet.model.Services;

import java.util.List;

public interface ServicesService {
    void addService(Services services);
    void updateService(Services services);
    void deleteService(Integer id);
    Services searchServiceById(Integer id);
    List<Services> searchServiceByName(String name);
    List<Services> searchServiceByPrice(Double price);
    List<Services> getAllServices();
    List<Services> getAllServicesByName(String name);
    List<Services> getAllServicesByVendor(Integer id);
}
