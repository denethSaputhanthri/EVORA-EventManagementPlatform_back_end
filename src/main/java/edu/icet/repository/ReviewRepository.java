package edu.icet.repository;


import edu.icet.model.Review;

import java.time.LocalDate;
import java.util.List;

public interface ReviewRepository {
    boolean addReview(Review review);
    boolean updateReview(Review review);
    boolean deleteReview(Integer id);
    List<Review> getAllReview();
    Review searchReviewById(Integer id);
    List<Review> searchReviewByUser(Integer userId);
    List<Review> searchReviewByService(Integer serviceId);
    List<Review> searchReviewByRating(Integer rating);
    List<Review> searchReviewByDate(LocalDate date);

}
