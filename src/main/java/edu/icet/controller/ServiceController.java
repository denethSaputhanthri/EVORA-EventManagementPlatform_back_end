package edu.icet.controller;

import edu.icet.dto.ServicesDto;
import edu.icet.service.ServicesService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/service")
@Tag(name = "Service-Controller",description = "Service API Collection")
public class ServiceController {

    final ServicesService service;

    @PostMapping("/add")
    public void addService(@RequestBody ServicesDto servicesDto){
        service.addService(servicesDto);
    }

    @PutMapping("/update")
    public void updateService(@RequestBody ServicesDto servicesDto){
        service.updateService(servicesDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteService(@PathVariable Integer id){
        service.deleteService(id);
    }

    @GetMapping("/search/{id}")
    public ServicesDto searchServiceById(@PathVariable Integer id){
        return service.searchServiceById(id);
    }

    @GetMapping("/search-by-name/{name}")
    public List<ServicesDto> searchServiceByName(@PathVariable String name){
        return service.searchServiceByName(name);
    }

    @GetMapping("/search-by-price/{price}")
    public List<ServicesDto> searchServiceByPrice(@PathVariable Double price){
        return service.searchServiceByPrice(price);
    }

    @GetMapping("/search-all")
    public List<ServicesDto> getAllServices(){
        return service.getAllServices();
    }

    @GetMapping("/search-all-by-name/{name}")
    public List<ServicesDto> getAllServicesByName(@PathVariable String name){
        return service.getAllServicesByName(name);
    }

    @GetMapping("/search-all-by-vendor/{id}")
    public List<ServicesDto> getAllServicesByVendor(@PathVariable Integer id){
        return service.getAllServicesByVendor(id);
    }
}
