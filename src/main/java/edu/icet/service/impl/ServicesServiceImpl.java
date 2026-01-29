package edu.icet.service.impl;

import edu.icet.dto.ServicesDto;
import edu.icet.entity.ServicesEntity;
import edu.icet.repository.ServicesRepository;
import edu.icet.service.ServicesService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ServicesServiceImpl implements ServicesService {

    final ServicesRepository repository;

    final ModelMapper mapper;

    @Override
    public void addService(ServicesDto servicesDto) {
        repository.save(mapper.map(servicesDto, ServicesEntity.class));
    }

    @Override
    public void updateService(ServicesDto servicesDto) {
        repository.save(mapper.map(servicesDto,ServicesEntity.class));
    }

    @Override
    public void deleteService(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public ServicesDto searchServiceById(Integer id) {
        return mapper.map(repository.findById(id).get(), ServicesDto.class);
    }

    @Override
    public List<ServicesDto> searchServiceByName(String name) {
        List<ServicesEntity> all = repository.findByserviceName(name);
        List<ServicesDto> dtoList = new ArrayList<>();

        all.forEach(servicesEntity -> {
            dtoList.add(mapper.map(servicesEntity, ServicesDto.class));
        });
        return dtoList;
    }

    @Override
    public List<ServicesDto> searchServiceByPrice(Double price) {
        List<ServicesEntity> all = repository.findBybasePrice(price);
        List<ServicesDto> dtoList = new ArrayList<>();

        all.forEach(servicesEntity -> {
            dtoList.add(mapper.map(servicesEntity, ServicesDto.class));
        });
        return dtoList;
    }

    @Override
    public List<ServicesDto> getAllServices() {
        List<ServicesEntity> entityList = repository.findAll();
        List<ServicesDto> dtoList = new ArrayList<>();

        entityList.forEach(servicesEntity -> {
            dtoList.add(mapper.map(servicesEntity, ServicesDto.class));
        });
        return dtoList;
    }

    @Override
    public List<ServicesDto> getAllServicesByName(String name) {
        List<ServicesEntity> entityList = repository.findAllByserviceName(name);
        List<ServicesDto> dtoList = new ArrayList<>();

        entityList.forEach(servicesEntity -> {
            dtoList.add(mapper.map(servicesEntity, ServicesDto.class));
        });
        return dtoList;
    }

    @Override
    public List<ServicesDto> getAllServicesByVendor(Integer id) {
        List<ServicesEntity> entityList = repository.findAllByvendorId(id);
        List<ServicesDto> dtoList = new ArrayList<>();

        entityList.forEach(servicesEntity -> {
            dtoList.add(mapper.map(servicesEntity, ServicesDto.class));
        });

        return dtoList;
    }
}
