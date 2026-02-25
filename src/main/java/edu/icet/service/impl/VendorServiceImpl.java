package edu.icet.service.impl;

import edu.icet.model.Vendor;
import edu.icet.service.VendorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class VendorServiceImpl implements VendorService {

    @Override
    public void addVendor(Vendor vendor) {

    }

    @Override
    public void updateVendor(Vendor vendor) {

    }

    @Override
    public void deleteVendor(Integer id) {

    }

    @Override
    public List<Vendor> getAllVendor() {
        return List.of();
    }

    @Override
    public Vendor searchVendorById(Integer id) {
        return null;
    }

    @Override
    public List<Vendor> searchVendorByUser(Integer userId) {
        return List.of();
    }

    @Override
    public Vendor searchVendorByName(String name) {
        return null;
    }

    @Override
    public Vendor searchVendorByPhone(String phone) {
        return null;
    }
}
