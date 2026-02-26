package edu.icet.repository;


import edu.icet.model.Wishlist;

import java.time.LocalDateTime;
import java.util.List;

public interface WishlistRepository {
    boolean addWishlist(Wishlist wishlist);
    boolean updateWishlist(Wishlist wishlist);
    boolean deleteWishlist(Integer id);
    Wishlist searchWishlistById(Integer id);
    List<Wishlist> getAllWishlist();
    List<Wishlist> searchWishlistByUser(Integer userId);
    List<Wishlist> searchWishlistByService(Integer serviceId);
    List<Wishlist> searchWishlistByTime(LocalDateTime time);
}
