package edu.icet.service;

import edu.icet.dto.ReviewDto;

import java.time.LocalDate;
import java.util.List;

public interface ReviewService {
    void addReview(ReviewDto reviewDto);
    void updateReview(ReviewDto reviewDto);
    void deleteReview(Integer id);
    List<ReviewDto> getAllReview();
    ReviewDto searchReviewById(Integer id);
    List<ReviewDto> searchReviewByUser(Integer userId);
    List<ReviewDto> searchReviewByService(Integer serviceId);
    List<ReviewDto> searchReviewByRating(Integer rating);
    List<ReviewDto> searchReviewByDate(LocalDate date);
}
