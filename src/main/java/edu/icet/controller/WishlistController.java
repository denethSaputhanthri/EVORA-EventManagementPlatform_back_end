package edu.icet.controller;

import edu.icet.model.Wishlist;
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
    public void addWishlist(@RequestBody Wishlist wishlist){
        service.addWishlist(wishlist);
    }

    @PutMapping("/update")
    public void updateWishlist(@RequestBody Wishlist wishlist){
        service.updateWishlist(wishlist);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteWishlist(@PathVariable Integer id){
        service.deleteWishlist(id);
    }

    @GetMapping("/search/{id}")
    public Wishlist searchWishlistById(@PathVariable Integer id){
        return service.searchWishlistById(id);
    }

    @GetMapping("/search")
    public List<Wishlist> getAllWishlist(){
        return service.getAllWishlist();
    }

    @GetMapping("/search-by-user/{userId}")
    public List<Wishlist> searchWishlistByUser(@PathVariable Integer userId){
        return service.searchWishlistByUser(userId);
    }

    @GetMapping("/search-by-service/{serviceId}")
    public List<Wishlist> searchWishlistByService(@PathVariable Integer serviceId){
        return service.searchWishlistByService(serviceId);
    }

    @GetMapping("/search-by-time/{time}")
    public List<Wishlist> searchWishlistByTime(@PathVariable LocalDateTime time){
        return service.searchWishlistByTime(time);
    }
}
