package edu.icet.service.impl;

import edu.icet.dto.WishlistDto;
import edu.icet.entity.WishlistEntity;
import edu.icet.repository.WishlistRepository;
import edu.icet.service.WishlistService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class WishlistServiceImpl implements WishlistService {

    final WishlistRepository repository;

    final ModelMapper mapper;

    @Override
    public void addWishlist(WishlistDto wishlistDto) {
        repository.save(mapper.map(wishlistDto, WishlistEntity.class));
    }

    @Override
    public void updateWishlist(WishlistDto wishlistDto) {
        repository.save(mapper.map(wishlistDto, WishlistEntity.class));
    }

    @Override
    public void deleteWishlist(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public WishlistDto searchWishlistById(Integer id) {
        return mapper.map(repository.findById(id), WishlistDto.class);
    }

    @Override
    public List<WishlistDto> getAllWishlist() {
        List<WishlistEntity> all = repository.findAll();
        List<WishlistDto> dtoList = new ArrayList<>();

        all.forEach(wishlistEntity -> {
            dtoList.add(mapper.map(wishlistEntity,WishlistDto.class));
        });

        return dtoList;
    }

    @Override
    public List<WishlistDto> searchWishlistByUser(Integer userId) {
        List<WishlistEntity> all = repository.findAllByuserId(userId);
        List<WishlistDto> dtoList = new ArrayList<>();

        all.forEach(wishlistEntity -> {
            dtoList.add(mapper.map(wishlistEntity,WishlistDto.class));
        });

        return dtoList;
    }

    @Override
    public List<WishlistDto> searchWishlistByService(Integer serviceId) {
        List<WishlistEntity> all = repository.findAllByserviceId(serviceId);
        List<WishlistDto> dtoList = new ArrayList<>();

        all.forEach(wishlistEntity -> {
            dtoList.add(mapper.map(wishlistEntity,WishlistDto.class));
        });

        return dtoList;
    }

    @Override
    public List<WishlistDto> searchWishlistByTime(LocalDateTime time) {
        List<WishlistEntity> all = repository.findAllByaddedAt(time);
        List<WishlistDto> dtoList = new ArrayList<>();

        all.forEach(wishlistEntity -> {
            dtoList.add(mapper.map(wishlistEntity,WishlistDto.class));
        });

        return dtoList;
    }
}
