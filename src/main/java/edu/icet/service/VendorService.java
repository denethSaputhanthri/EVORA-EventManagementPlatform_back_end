package edu.icet.service;

import edu.icet.model.Vendor;

import java.util.List;

public interface VendorService {
    void addVendor(Vendor vendor);
    void updateVendor(Vendor vendor);
    void deleteVendor(Integer id);
    List<Vendor> getAllVendor();
    Vendor searchVendorById(Integer id);
    List<Vendor> searchVendorByUser(Integer userId);
    Vendor searchVendorByName(String name);
    Vendor searchVendorByPhone(String phone);
}
