package edu.icet.controller;

import edu.icet.dto.WishlistDto;
import edu.icet.service.WishlistService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Wishlist")
@Tag(name = "Wishlist-Controller" , description = "Wishlist API Collection")
public class WishlistController {

    final WishlistService service;

    @PostMapping("/add")
    public void addWishlist(@RequestBody WishlistDto wishlistDto){
        service.addWishlist(wishlistDto);
    }

    @PutMapping("/update")
    public void updateWishlist(@RequestBody WishlistDto wishlistDto){
        service.updateWishlist(wishlistDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteWishlist(@PathVariable Integer id){
        service.deleteWishlist(id);
    }

    @GetMapping("/search/{id}")
    public WishlistDto searchWishlistById(@PathVariable Integer id){
        return service.searchWishlistById(id);
    }

    @GetMapping("/search")
    public List<WishlistDto> getAllWishlist(){
        return service.getAllWishlist();
    }

    @GetMapping("/search-by-user/{userId}")
    public List<WishlistDto> searchWishlistByUser(@PathVariable Integer userId){
        return service.searchWishlistByUser(userId);
    }

    @GetMapping("/search-by-service/{serviceId}")
    public List<WishlistDto> searchWishlistByService(@PathVariable Integer serviceId){
        return service.searchWishlistByService(serviceId);
    }

    @GetMapping("/search-by-time/{time}")
    public List<WishlistDto> searchWishlistByTime(@PathVariable LocalDateTime time){
        return service.searchWishlistByTime(time);
    }
}
