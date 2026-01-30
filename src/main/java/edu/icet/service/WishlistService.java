package edu.icet.service;

import edu.icet.dto.WishlistDto;

import java.time.LocalDateTime;
import java.util.List;

public interface WishlistService {
    void addWishlist(WishlistDto wishlistDto);
    void updateWishlist(WishlistDto wishlistDto);
    void deleteWishlist(Integer id);
    WishlistDto searchWishlistById(Integer id);
    List<WishlistDto> getAllWishlist();
    List<WishlistDto> searchWishlistByUser(Integer userId);
    List<WishlistDto> searchWishlistByService(Integer serviceId);
    List<WishlistDto> searchWishlistByTime(LocalDateTime time);
}
