package edu.icet.service;

import edu.icet.dto.VendorDto;

import java.util.List;

public interface VendorService {
    void addVendor(VendorDto vendorDto);
    void updateVendor(VendorDto vendorDto);
    void deleteVendor(Integer id);
    List<VendorDto> getAllVendor();
    VendorDto searchVendorById(Integer id);
    List<VendorDto> searchVendorByUser(Integer userId);
    VendorDto searchVendorByName(String name);
    VendorDto searchVendorByPhone(String phone);
}
