package edu.icet.controller;

import edu.icet.dto.ReviewDto;
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
    public void addReview(@RequestBody ReviewDto reviewDto){
        service.addReview(reviewDto);
    }

    @PutMapping("/update")
    public void updateReview(@RequestBody ReviewDto reviewDto){
        service.updateReview(reviewDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteReview(@PathVariable Integer id){
        service.deleteReview(id);
    }

    @GetMapping("/search")
    public List<ReviewDto> getAllReview(){
        return service.getAllReview();
    }

    @GetMapping("/search/{id}")
    public ReviewDto searchReviewById(@PathVariable Integer id){
        return service.searchReviewById(id);
    }

    @GetMapping("/search-by-user/{userId}")
    public List<ReviewDto> searchReviewByUser(@PathVariable Integer userId){
        return service.searchReviewByUser(userId);
    }

    @GetMapping("/search-by-service/{serviceId}")
    public List<ReviewDto> searchReviewByService(@PathVariable Integer serviceId){
        return service.searchReviewByService(serviceId);
    }

    @GetMapping("/search-by-rating/{rating}")
    public List<ReviewDto> searchReviewByRating(@PathVariable Integer rating){
        return service.searchReviewByRating(rating);
    }

    @GetMapping("/search-by-date/{date}")
    public List<ReviewDto> searchReviewByUser(@PathVariable LocalDate date){
        return service.searchReviewByDate(date);
    }

}
