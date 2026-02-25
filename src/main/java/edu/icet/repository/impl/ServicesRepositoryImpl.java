package edu.icet.repository.impl;

import edu.icet.model.Services;
import edu.icet.model.User;
import edu.icet.repository.ServicesRepository;
import edu.icet.util.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class ServicesRepositoryImpl implements ServicesRepository {

    final private JdbcTemplate jdbcTemplate;

    @Override
    public boolean addService(Services services) {
        String sql = "INSERT INTO service VALUES(?,?,?,?,?,?)";
        return jdbcTemplate.update(sql,
                services.getServiceId(),
                services.getVendorId(),
                services.getCategoryId(),
                services.getServiceName(),
                services.getBasePrice(),
                services.getDescription()
        ) > 0;
    }

    @Override
    public boolean updateService(Services services) {
        String sql = "update service set verdor_id=?, category_id=?,service_name=?,base_price=?, description=?  where service_id=?";
        return jdbcTemplate.update(sql,
                services.getVendorId(),
                services.getCategoryId(),
                services.getServiceName(),
                services.getBasePrice(),
                services.getDescription(),
                services.getServiceId()
                )>0;
    }

    @Override
    public boolean deleteService(Integer id) {
        String sql ="DELETE FROM service WHERE service_id=?";
        return jdbcTemplate.update(sql, id)>0;
    }

    @Override
    public Services searchServiceById(Integer id) {
        String sql ="SELECT * FROM service WHERE service_id=?";
        return jdbcTemplate.queryForObject(sql,(rs, rowNum) -> {
            Services services = new Services();
            services.setServiceId(rs.getInt("service_id"));
            services.setVendorId(rs.getInt("vendor_id"));
            services.setCategoryId(rs.getInt("category_id"));
            services.setServiceName(rs.getString("service_name"));
            services.setBasePrice(rs.getDouble("base_price"));
            services.setDescription(rs.getString("description"));
            return services;
        },id) ;
    }

    @Override
    public List<Services> searchServiceByName(String name) {
        String sql="SELECT * FROM service WHERE name=?";
        List<Services> servicesList=new ArrayList<>();
        jdbcTemplate.query(sql,(rs, rowNum) -> {
            Services services = new Services();
            services.setServiceId(rs.getInt("service_id"));
            services.setVendorId(rs.getInt("vendor_id"));
            services.setCategoryId(rs.getInt("category_id"));
            services.setServiceName(rs.getString("service_name"));
            services.setBasePrice(rs.getDouble("base_price"));
            services.setDescription(rs.getString("description"));
            return services;
        },name);
        return servicesList;
    }

    @Override
    public List<Services> searchServiceByPrice(Double price) {
        String sql="SELECT * FROM service WHERE base_price=?";
        List<Services> servicesList=new ArrayList<>();
        jdbcTemplate.query(sql,(rs, rowNum) -> {
            Services services = new Services();
            services.setServiceId(rs.getInt("service_id"));
            services.setVendorId(rs.getInt("vendor_id"));
            services.setCategoryId(rs.getInt("category_id"));
            services.setServiceName(rs.getString("service_name"));
            services.setBasePrice(rs.getDouble("base_price"));
            services.setDescription(rs.getString("description"));
            return services;
        },price);
        return servicesList;
    }

    @Override
    public List<Services> getAllServices() {
        String sql="SELECT * FROM service";
        return jdbcTemplate.query(sql,(rs, rowNum) -> {
            Services services = new Services();
            services.setServiceId(rs.getInt("service_id"));
            services.setVendorId(rs.getInt("vendor_id"));
            services.setCategoryId(rs.getInt("category_id"));
            services.setServiceName(rs.getString("service_name"));
            services.setBasePrice(rs.getDouble("base_price"));
            services.setDescription(rs.getString("description"));
            return services;
        });
    }

    @Override
    public List<Services> getAllServicesByName(String name) {
        String sql="SELECT * FROM service WHERE service_name=?";
        List<Services> servicesList=new ArrayList<>();
        jdbcTemplate.query(sql,(rs, rowNum) -> {
            Services services = new Services();
            services.setServiceId(rs.getInt("service_id"));
            services.setVendorId(rs.getInt("vendor_id"));
            services.setCategoryId(rs.getInt("category_id"));
            services.setServiceName(rs.getString("service_name"));
            services.setBasePrice(rs.getDouble("base_price"));
            services.setDescription(rs.getString("description"));
            return services;
        },name);
        return servicesList;
    }

    @Override
    public List<Services> getAllServicesByVendor(Integer id) {
        String sql="SELECT * FROM service WHERE vendor_id=?";
        List<Services> servicesList=new ArrayList<>();
        jdbcTemplate.query(sql,(rs, rowNum) -> {
            Services services = new Services();
            services.setServiceId(rs.getInt("service_id"));
            services.setVendorId(rs.getInt("vendor_id"));
            services.setCategoryId(rs.getInt("category_id"));
            services.setServiceName(rs.getString("service_name"));
            services.setBasePrice(rs.getDouble("base_price"));
            services.setDescription(rs.getString("description"));
            return services;
        },id);
        return servicesList;
    }
}
