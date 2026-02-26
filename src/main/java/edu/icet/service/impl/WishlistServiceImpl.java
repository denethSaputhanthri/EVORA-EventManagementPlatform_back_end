package edu.icet.service.impl;

import edu.icet.model.Wishlist;
import edu.icet.service.WishlistService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@Service
public class WishlistServiceImpl implements WishlistService {

    final private WishlistService wishlistService;

    @Override
    public void addWishlist(Wishlist wishlist) {
        wishlistService.addWishlist(wishlist);
    }

    @Override
    public void updateWishlist(Wishlist wishlist) {
        wishlistService.updateWishlist(wishlist);
    }

    @Override
    public void deleteWishlist(Integer id) {
        wishlistService.deleteWishlist(id);
    }

    @Override
    public Wishlist searchWishlistById(Integer id) {
        return wishlistService.searchWishlistById(id);
    }

    @Override
    public List<Wishlist> getAllWishlist() {
        return wishlistService.getAllWishlist();
    }

    @Override
    public List<Wishlist> searchWishlistByUser(Integer userId) {
        return wishlistService.searchWishlistByUser(userId);
    }

    @Override
    public List<Wishlist> searchWishlistByService(Integer serviceId) {
        return wishlistService.searchWishlistByService(serviceId);
    }

    @Override
    public List<Wishlist> searchWishlistByTime(LocalDateTime time) {
        return wishlistService.searchWishlistByTime(time);
    }
}
