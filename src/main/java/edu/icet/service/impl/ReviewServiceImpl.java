package edu.icet.service.impl;

import edu.icet.dto.ReviewDto;
import edu.icet.entity.ReviewEntity;
import edu.icet.repository.ReviewRepository;
import edu.icet.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ReviewServiceImpl implements ReviewService {

    final ReviewRepository repository;

    final ModelMapper mapper;

    @Override
    public void addReview(ReviewDto reviewDto) {
        repository.save(mapper.map(reviewDto, ReviewEntity.class));
    }

    @Override
    public void updateReview(ReviewDto reviewDto) {
        repository.save(mapper.map(reviewDto, ReviewEntity.class));

    }

    @Override
    public void deleteReview(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<ReviewDto> getAllReview() {
        List<ReviewEntity> all = repository.findAll();
        List<ReviewDto> dtoList = new ArrayList<>();

        all.forEach(reviewEntity -> {
            dtoList.add(mapper.map(reviewEntity, ReviewDto.class));
        });
        return dtoList;
    }

    @Override
    public ReviewDto searchReviewById(Integer id) {
        return mapper.map(repository.findByreviewId(id), ReviewDto.class);
    }

    @Override
    public List<ReviewDto> searchReviewByUser(Integer userId) {
        List<ReviewEntity> all = repository.findAllByuserId(userId);
        List<ReviewDto> dtoList = new ArrayList<>();

        all.forEach(reviewEntity -> {
            dtoList.add(mapper.map(reviewEntity, ReviewDto.class));
        });
        return dtoList;
    }

    @Override
    public List<ReviewDto> searchReviewByService(Integer serviceId) {
        List<ReviewEntity> all = repository.findAllByserviceId(serviceId);
        List<ReviewDto> dtoList = new ArrayList<>();

        all.forEach(reviewEntity -> {
            dtoList.add(mapper.map(reviewEntity, ReviewDto.class));
        });
        return dtoList;
    }

    @Override
    public List<ReviewDto> searchReviewByRating(Integer rating) {
        List<ReviewEntity> all = repository.findAllByrating(rating);
        List<ReviewDto> dtoList = new ArrayList<>();

        all.forEach(reviewEntity -> {
            dtoList.add(mapper.map(reviewEntity, ReviewDto.class));
        });
        return dtoList;
    }

    @Override
    public List<ReviewDto> searchReviewByDate(LocalDate date) {
        List<ReviewEntity> all = repository.findAllBycreatedAt(date);
        List<ReviewDto> dtoList = new ArrayList<>();

        all.forEach(reviewEntity -> {
            dtoList.add(mapper.map(reviewEntity, ReviewDto.class));
        });
        return dtoList;
    }
}
