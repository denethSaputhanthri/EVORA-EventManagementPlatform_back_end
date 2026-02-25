package edu.icet.controller;

import edu.icet.model.Vendor;
import edu.icet.service.VendorService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/vendor")
@Tag(name = "Vendor-Controller",description = "Vendor API Collection")
public class VendorController {

    final VendorService service;

    @PostMapping("/add")
    public void addVendor(@RequestBody Vendor vendor){
        service.addVendor(vendor);
    }

    @PutMapping("/update")
    public void updateVendor(@RequestBody Vendor vendor){
        service.updateVendor(vendor);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteVendor(@PathVariable Integer id){
        service.deleteVendor(id);
    }

    @GetMapping("/search")
    public List<Vendor> getAllVendor(){
        return service.getAllVendor();
    }

    @GetMapping("/search/{id}")
    public Vendor searchVendorById(@PathVariable Integer id){
        return service.searchVendorById(id);
    }

    @GetMapping("/search-by-name/{name}")
    public Vendor searchVendorByName(@PathVariable String name){
        return service.searchVendorByName(name);
    }

    @GetMapping("/search-by-phone/{phone}")
    public Vendor searchVendorByPhone(@PathVariable String phone){
        return service.searchVendorByPhone(phone);
    }

    @GetMapping("/search-by-user/{userId}")
    public List<Vendor> searchVendorByUser(@PathVariable Integer userId){
        return service.searchVendorByUser(userId);
    }

}
