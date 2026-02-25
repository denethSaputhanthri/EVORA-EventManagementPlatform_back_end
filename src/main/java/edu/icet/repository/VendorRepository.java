package edu.icet.repository;


import edu.icet.model.Vendor;

import java.util.List;

public interface VendorRepository {
    boolean addVendor(Vendor vendor);
    boolean updateVendor(Vendor vendor);
    boolean deleteVendor(Integer id);
    List<Vendor> getAllVendor();
    Vendor searchVendorById(Integer id);
    List<Vendor> searchVendorByUser(Integer userId);
    Vendor searchVendorByName(String name);
    Vendor searchVendorByPhone(String phone);
}
