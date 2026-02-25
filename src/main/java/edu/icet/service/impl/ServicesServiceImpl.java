package edu.icet.service.impl;

import edu.icet.model.Services;
import edu.icet.service.ServicesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ServicesServiceImpl implements ServicesService {

    @Override
    public void addService(Services services) {

    }

    @Override
    public void updateService(Services services) {

    }

    @Override
    public void deleteService(Integer id) {

    }

    @Override
    public Services searchServiceById(Integer id) {
        return null;
    }

    @Override
    public List<Services> searchServiceByName(String name) {
        return List.of();
    }

    @Override
    public List<Services> searchServiceByPrice(Double price) {
        return List.of();
    }

    @Override
    public List<Services> getAllServices() {
        return List.of();
    }

    @Override
    public List<Services> getAllServicesByName(String name) {
        return List.of();
    }

    @Override
    public List<Services> getAllServicesByVendor(Integer id) {
        return List.of();
    }
}
