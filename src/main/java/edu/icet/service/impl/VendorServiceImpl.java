package edu.icet.service.impl;

import edu.icet.dto.VendorDto;
import edu.icet.entity.VendorEntity;
import edu.icet.repository.VendorRepository;
import edu.icet.service.VendorService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class VendorServiceImpl implements VendorService {

    final VendorRepository repository;

    final ModelMapper mapper;

    @Override
    public void addVendor(VendorDto vendorDto) {
        repository.save(mapper.map(vendorDto, VendorEntity.class));
    }

    @Override
    public void updateVendor(VendorDto vendorDto) {
        repository.save(mapper.map(vendorDto, VendorEntity.class));
    }

    @Override
    public void deleteVendor(Integer id) {
        repository.deleteById(id);

    }

    @Override
    public List<VendorDto> getAllVendor() {
        List<VendorEntity> entityList = repository.findAll();
        List<VendorDto> dtoList = new ArrayList<>();

        entityList.forEach(vendorEntity -> {
            dtoList.add(mapper.map(vendorEntity, VendorDto.class));
        });

        return dtoList;
    }

    @Override
    public VendorDto searchVendorById(Integer id) {
        return mapper.map(repository.findByvendorId(id), VendorDto.class);
    }

    @Override
    public List<VendorDto> searchVendorByUser(Integer userId) {
        List<VendorEntity> entityList = repository.findAllByuserId(userId);
        List<VendorDto> dtoList = new ArrayList<>();

        entityList.forEach(vendorEntity -> {
            dtoList.add(mapper.map(vendorEntity, VendorDto.class));
        });

        return dtoList;
    }

    @Override
    public VendorDto searchVendorByName(String name) {
        return mapper.map(repository.findBycompanyName(name), VendorDto.class);
    }

    @Override
    public VendorDto searchVendorByPhone(String phone) {
        return mapper.map(repository.findByphone(phone), VendorDto.class);
    }
}
