package edu.icet.service.impl;

import edu.icet.model.Review;
import edu.icet.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ReviewServiceImpl implements ReviewService {

    @Override
    public void addReview(Review review) {

    }

    @Override
    public void updateReview(Review review) {

    }

    @Override
    public void deleteReview(Integer id) {

    }

    @Override
    public List<Review> getAllReview() {
        return List.of();
    }

    @Override
    public Review searchReviewById(Integer id) {
        return null;
    }

    @Override
    public List<Review> searchReviewByUser(Integer userId) {
        return List.of();
    }

    @Override
    public List<Review> searchReviewByService(Integer serviceId) {
        return List.of();
    }

    @Override
    public List<Review> searchReviewByRating(Integer rating) {
        return List.of();
    }

    @Override
    public List<Review> searchReviewByDate(LocalDate date) {
        return List.of();
    }
}
