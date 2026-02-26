package edu.icet.repository;


import edu.icet.model.Services;

import java.util.List;

public interface ServicesRepository  {
    boolean addService(Services services);
    boolean updateService(Services services);
    boolean deleteService(Integer id);
    Services searchServiceById(Integer id);
    List<Services> searchServiceByName(String name);
    List<Services> searchServiceByPrice(Double price);
    List<Services> getAllServices();
    List<Services> getAllServicesByName(String name);
    List<Services> getAllServicesByVendor(Integer id);

}
