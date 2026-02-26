package edu.icet.repository.impl;

import edu.icet.model.Vendor;
import edu.icet.repository.VendorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@RequiredArgsConstructor
@Repository
public class VendorRepositoryImpl implements VendorRepository {

    final private JdbcTemplate jdbcTemplate;

    @Override
    public boolean addVendor(Vendor vendor) {
        String sql = "INSERT INTO vendor VALUES(?,?,?,?,?)";
        return jdbcTemplate.update(sql,
                vendor.getVendorId(),
                vendor.getUserId(),
                vendor.getCompanyName(),
                vendor.getBio(),
                vendor.getPhone()
                )>0;
    }

    @Override
    public boolean updateVendor(Vendor vendor) {
        String sql = "UPDATE vendor SET user_id=?,company_name=?, bio=? contact_number=? where vendor_id=?";
        return jdbcTemplate.update(sql,
                vendor.getUserId(),
                vendor.getCompanyName(),
                vendor.getBio(),
                vendor.getPhone(),
                vendor.getVendorId()
        )>0;
    }

    @Override
    public boolean deleteVendor(Integer id) {
        String sql ="DELETE FROM vendor WHERE vendor_id=?";
        return jdbcTemplate.update(sql,id)>0;
    }

    @Override
    public List<Vendor> getAllVendor() {
        String sql="SELECT * FROM  vendor";
        return jdbcTemplate.query(sql,(rs, rowNum) -> {
            Vendor vendor = new Vendor();
            vendor.setVendorId(rs.getInt("vendor_id"));
            vendor.setUserId(rs.getInt("user_id"));
            vendor.setCompanyName(rs.getString("company_name"));
            vendor.setBio(rs.getString("bio"));
            vendor.setPhone(rs.getString("contact_number"));
            return vendor;
        });
    }

    @Override
    public Vendor searchVendorById(Integer id) {
        String sql ="SELECT * FROM vendor WHERE vendor_id=?";
        return jdbcTemplate.queryForObject(sql,(rs, rowNum) -> {
            Vendor vendor = new Vendor();
            vendor.setVendorId(rs.getInt("vendor_id"));
            vendor.setUserId(rs.getInt("user_id"));
            vendor.setCompanyName(rs.getString("company_name"));
            vendor.setBio(rs.getString("bio"));
            vendor.setPhone(rs.getString("contact_number"));
            return vendor;
        },id) ;
    }

    @Override
    public List<Vendor> searchVendorByUser(Integer userId) {
        String sql ="SELECT * FROM vendor WHERE user_id=?";
        List<Vendor>vendorList=new ArrayList<>();
        return jdbcTemplate.query(sql,(rs, rowNum) -> {
            Vendor vendor = new Vendor();
            vendor.setVendorId(rs.getInt("vendor_id"));
            vendor.setUserId(rs.getInt("user_id"));
            vendor.setCompanyName(rs.getString("company_name"));
            vendor.setBio(rs.getString("bio"));
            vendor.setPhone(rs.getString("contact_number"));
            return vendor;
        },userId) ;
    }

    @Override
    public Vendor searchVendorByName(String name) {
        String sql ="SELECT * FROM vendor WHERE company_name=?";
        return jdbcTemplate.queryForObject(sql,(rs, rowNum) -> {
            Vendor vendor = new Vendor();
            vendor.setVendorId(rs.getInt("vendor_id"));
            vendor.setUserId(rs.getInt("user_id"));
            vendor.setCompanyName(rs.getString("company_name"));
            vendor.setBio(rs.getString("bio"));
            vendor.setPhone(rs.getString("contact_number"));
            return vendor;
        },name) ;    }

    @Override
    public Vendor searchVendorByPhone(String phone) {
        String sql ="SELECT * FROM vendor WHERE contact_number=?";
        return jdbcTemplate.queryForObject(sql,(rs, rowNum) -> {
            Vendor vendor = new Vendor();
            vendor.setVendorId(rs.getInt("vendor_id"));
            vendor.setUserId(rs.getInt("user_id"));
            vendor.setCompanyName(rs.getString("company_name"));
            vendor.setBio(rs.getString("bio"));
            vendor.setPhone(rs.getString("contact_number"));
            return vendor;
        },phone);
    }
}
