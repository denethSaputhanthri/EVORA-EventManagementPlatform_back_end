package edu.icet.controller;

import edu.icet.model.Review;
import edu.icet.service.ReviewService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Review")
@Tag(name = "Review-Controller" , description = "Review API Collection")
public class ReviewController {

    final ReviewService service;

    @PostMapping("/add")
    public void addReview(@RequestBody Review review){
        service.addReview(review);
    }

    @PutMapping("/update")
    public void updateReview(@RequestBody Review review){
        service.updateReview(review);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteReview(@PathVariable Integer id){
        service.deleteReview(id);
    }

    @GetMapping("/search")
    public List<Review> getAllReview(){
        return service.getAllReview();
    }

    @GetMapping("/search/{id}")
    public Review searchReviewById(@PathVariable Integer id){
        return service.searchReviewById(id);
    }

    @GetMapping("/search-by-user/{userId}")
    public List<Review> searchReviewByUser(@PathVariable Integer userId){
        return service.searchReviewByUser(userId);
    }

    @GetMapping("/search-by-service/{serviceId}")
    public List<Review> searchReviewByService(@PathVariable Integer serviceId){
        return service.searchReviewByService(serviceId);
    }

    @GetMapping("/search-by-rating/{rating}")
    public List<Review> searchReviewByRating(@PathVariable Integer rating){
        return service.searchReviewByRating(rating);
    }

    @GetMapping("/search-by-date/{date}")
    public List<Review> searchReviewByUser(@PathVariable LocalDate date){
        return service.searchReviewByDate(date);
    }

}
