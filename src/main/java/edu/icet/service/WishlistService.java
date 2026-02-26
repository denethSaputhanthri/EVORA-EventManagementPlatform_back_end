package edu.icet.service;

import edu.icet.model.Wishlist;

import java.time.LocalDateTime;
import java.util.List;

public interface WishlistService {
    void addWishlist(Wishlist wishlist);
    void updateWishlist(Wishlist wishlist);
    void deleteWishlist(Integer id);
    Wishlist searchWishlistById(Integer id);
    List<Wishlist> getAllWishlist();
    List<Wishlist> searchWishlistByUser(Integer userId);
    List<Wishlist> searchWishlistByService(Integer serviceId);
    List<Wishlist> searchWishlistByTime(LocalDateTime time);
}
