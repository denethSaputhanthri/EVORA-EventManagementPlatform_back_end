package edu.icet.service;

import edu.icet.model.Review;

import java.time.LocalDate;
import java.util.List;

public interface ReviewService {
    void addReview(Review review);
    void updateReview(Review review);
    void deleteReview(Integer id);
    List<Review> getAllReview();
    Review searchReviewById(Integer id);
    List<Review> searchReviewByUser(Integer userId);
    List<Review> searchReviewByService(Integer serviceId);
    List<Review> searchReviewByRating(Integer rating);
    List<Review> searchReviewByDate(LocalDate date);
}
