package edu.icet.service.impl;

import edu.icet.model.Vendor;
import edu.icet.repository.VendorRepository;
import edu.icet.service.VendorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class VendorServiceImpl implements VendorService {

    final private VendorRepository vendorRepository;

    @Override
    public void addVendor(Vendor vendor) {
        vendorRepository.addVendor(vendor);
    }

    @Override
    public void updateVendor(Vendor vendor) {
        vendorRepository.updateVendor(vendor);
    }

    @Override
    public void deleteVendor(Integer id) {
        vendorRepository.deleteVendor(id);
    }

    @Override
    public List<Vendor> getAllVendor() {
        return vendorRepository.getAllVendor();
    }

    @Override
    public Vendor searchVendorById(Integer id) {
        return vendorRepository.searchVendorById(id);
    }

    @Override
    public List<Vendor> searchVendorByUser(Integer userId) {
        return vendorRepository.searchVendorByUser(userId);
    }

    @Override
    public Vendor searchVendorByName(String name) {
        return vendorRepository.searchVendorByName(name);
    }

    @Override
    public Vendor searchVendorByPhone(String phone) {
        return vendorRepository.searchVendorByPhone(phone);
    }
}
