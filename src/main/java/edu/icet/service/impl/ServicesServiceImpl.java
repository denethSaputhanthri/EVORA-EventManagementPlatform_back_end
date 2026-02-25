package edu.icet.service.impl;

import edu.icet.model.Services;
import edu.icet.service.ServicesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ServicesServiceImpl implements ServicesService {

    final private ServicesService servicesService;

    @Override
    public void addService(Services services) {
        servicesService.addService(services);
    }

    @Override
    public void updateService(Services services) {
        servicesService.updateService(services);
    }

    @Override
    public void deleteService(Integer id) {
        servicesService.deleteService(id);
    }

    @Override
    public Services searchServiceById(Integer id) {
        return servicesService.searchServiceById(id);
    }

    @Override
    public List<Services> searchServiceByName(String name) {
        return servicesService.searchServiceByName(name);
    }

    @Override
    public List<Services> searchServiceByPrice(Double price) {
        return servicesService.searchServiceByPrice(price);
    }

    @Override
    public List<Services> getAllServices() {
        return servicesService.getAllServices();
    }

    @Override
    public List<Services> getAllServicesByName(String name) {
        return servicesService.getAllServicesByName(name);
    }

    @Override
    public List<Services> getAllServicesByVendor(Integer id) {
        return servicesService.getAllServicesByVendor(id);
    }
}
