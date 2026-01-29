package edu.icet.controller;

import edu.icet.dto.VendorDto;
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
    public void addVendor(@RequestBody VendorDto vendorDto){
        service.addVendor(vendorDto);
    }

    @PutMapping("/update")
    public void updateVendor(@RequestBody VendorDto vendorDto){
        service.updateVendor(vendorDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteVendor(@PathVariable Integer id){
        service.deleteVendor(id);
    }

    @GetMapping("/search")
    public List<VendorDto> getAllVendor(){
        return service.getAllVendor();
    }

    @GetMapping("/search/{id}")
    public VendorDto searchVendorById(@PathVariable Integer id){
        return service.searchVendorById(id);
    }

    @GetMapping("/search-by-name/{name}")
    public VendorDto searchVendorByName(@PathVariable String name){
        return service.searchVendorByName(name);
    }

    @GetMapping("/search-by-phone/{phone}")
    public VendorDto searchVendorByPhone(@PathVariable String phone){
        return service.searchVendorByPhone(phone);
    }

    @GetMapping("/search-by-user/{userId}")
    public List<VendorDto> searchVendorByUser(@PathVariable Integer userId){
        return service.searchVendorByUser(userId);
    }

}
