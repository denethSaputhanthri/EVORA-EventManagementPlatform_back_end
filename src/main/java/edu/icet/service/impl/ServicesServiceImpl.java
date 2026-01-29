package edu.icet.service.impl;

import edu.icet.dto.ServicesDto;
import edu.icet.repository.ServicesRepository;
import edu.icet.service.ServicesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ServicesServiceImpl implements ServicesService {

    final ServicesRepository servicesRepository;

    @Override
    public void addService() {

    }

    @Override
    public void updateService() {

    }

    @Override
    public void deleteService(Integer id) {

    }

    @Override
    public ServicesDto searchServiceById(Integer id) {
        return null;
    }

    @Override
    public ServicesDto searchServiceByName(String name) {
        return null;
    }

    @Override
    public List<ServicesDto> searchServiceByPrice(Double price) {
        return List.of();
    }

    @Override
    public List<ServicesDto> getAllServices() {
        return List.of();
    }

    @Override
    public List<ServicesDto> getAllServicesByName(String name) {
        return List.of();
    }

    @Override
    public List<ServicesDto> getAllServicesByVendor(Integer id) {
        return List.of();
    }
}
