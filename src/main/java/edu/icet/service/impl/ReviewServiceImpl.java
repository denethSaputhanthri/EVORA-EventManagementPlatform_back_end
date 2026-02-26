package edu.icet.service.impl;

import edu.icet.model.Review;
import edu.icet.repository.ReviewRepository;
import edu.icet.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {

    final private ReviewRepository reviewRepository;

    @Override
    public void addReview(Review review) {
        reviewRepository.addReview(review);
    }

    @Override
    public void updateReview(Review review) {
        reviewRepository.updateReview(review);
    }

    @Override
    public void deleteReview(Integer id) {
        reviewRepository.deleteReview(id);
    }

    @Override
    public List<Review> getAllReview() {
        return  reviewRepository.getAllReview();
    }

    @Override
    public Review searchReviewById(Integer id) {
        return reviewRepository.searchReviewById(id);
    }

    @Override
    public List<Review> searchReviewByUser(Integer userId) {
        return reviewRepository.searchReviewByUser(userId);
    }

    @Override
    public List<Review> searchReviewByService(Integer serviceId) {
        return reviewRepository.searchReviewByService(serviceId);
    }

    @Override
    public List<Review> searchReviewByRating(Integer rating) {
        return reviewRepository.searchReviewByRating(rating);
    }

    @Override
    public List<Review> searchReviewByDate(LocalDate date) {
        return reviewRepository.searchReviewByDate(date);
    }
}
