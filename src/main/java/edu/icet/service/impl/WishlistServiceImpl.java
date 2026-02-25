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

    @Override
    public void addWishlist(Wishlist wishlist) {

    }

    @Override
    public void updateWishlist(Wishlist wishlist) {

    }

    @Override
    public void deleteWishlist(Integer id) {

    }

    @Override
    public Wishlist searchWishlistById(Integer id) {
        return null;
    }

    @Override
    public List<Wishlist> getAllWishlist() {
        return List.of();
    }

    @Override
    public List<Wishlist> searchWishlistByUser(Integer userId) {
        return List.of();
    }

    @Override
    public List<Wishlist> searchWishlistByService(Integer serviceId) {
        return List.of();
    }

    @Override
    public List<Wishlist> searchWishlistByTime(LocalDateTime time) {
        return List.of();
    }
}
