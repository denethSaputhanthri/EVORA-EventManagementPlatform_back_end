package edu.icet.repository.impl;

import edu.icet.model.Review;
import edu.icet.model.User;
import edu.icet.repository.ReviewRepository;
import edu.icet.util.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class ReviewRepositoryImpl implements ReviewRepository {

    final private JdbcTemplate jdbcTemplate;

    @Override
    public boolean addReview(Review review) {
        String sql = "INSERT INTO review VALUES(?,?,?,?,?,?)";
        return jdbcTemplate.update(sql,
                review.getReviewId(),
                review.getUserId(),
                review.getServiceId(),
                review.getRating(),
                review.getComment(),
                review.getCreatedAt()
        )>0;
    }

    @Override
    public boolean updateReview(Review review) {
        String sql = "UPDATE review SET user_id=?,servie_id=?,rating=?,comment=?,createAt=? where review_id=?";
        return jdbcTemplate.update(sql,
                review.getUserId(),
                review.getServiceId(),
                review.getRating(),
                review.getComment(),
                review.getCreatedAt(),
                review.getReviewId()
        )>0;
    }

    @Override
    public boolean deleteReview(Integer id) {
        String sql ="DELETE FROM review WHERE user_id=?";
        return jdbcTemplate.update(sql,id)>0;
    }

    @Override
    public List<Review> getAllReview() {
        String sql="SELECT * FROM review";
        return jdbcTemplate.query(sql,(rs, rowNum) -> {
            Review review = new Review();
            review.setReviewId(rs.getInt("review_id"));
            review.setUserId(rs.getInt("user_id"));
            review.setServiceId(rs.getInt("servie_id"));
            review.setRating(rs.getInt("rating"));
            review.setComment(rs.getString("comment"));
            return review;
        });
    }

    @Override
    public Review searchReviewById(Integer id) {
        String sql ="SELECT * FROM review WHERE review_id=?";
        return jdbcTemplate.queryForObject(sql,(rs, rowNum) -> {
            Review review = new Review();
            review.setReviewId(rs.getInt("review_id"));
            review.setUserId(rs.getInt("user_id"));
            review.setServiceId(rs.getInt("servie_id"));
            review.setRating(rs.getInt("rating"));
            review.setComment(rs.getString("comment"));
            return review;
        },id) ;
    }

    @Override
    public List<Review> searchReviewByUser(Integer userId) {
        String sql="SELECT * FROM review WHERE user_id=?";
        List<Review> reviewList=new ArrayList<>();
        jdbcTemplate.query(sql,(rs, rowNum) -> {
            Review review = new Review();
            review.setReviewId(rs.getInt("review_id"));
            review.setUserId(rs.getInt("user_id"));
            review.setServiceId(rs.getInt("servie_id"));
            review.setRating(rs.getInt("rating"));
            review.setComment(rs.getString("comment"));
            return review;
        },userId) ;
        return reviewList;
    }

    @Override
    public List<Review> searchReviewByService(Integer serviceId) {
        String sql="SELECT * FROM review WHERE service_id=?";
        List<Review> reviewList=new ArrayList<>();
        jdbcTemplate.query(sql,(rs, rowNum) -> {
            Review review = new Review();
            review.setReviewId(rs.getInt("review_id"));
            review.setUserId(rs.getInt("user_id"));
            review.setServiceId(rs.getInt("servie_id"));
            review.setRating(rs.getInt("rating"));
            review.setComment(rs.getString("comment"));
            return review;
        },serviceId) ;
        return reviewList;
    }

    @Override
    public List<Review> searchReviewByRating(Integer rating) {
        String sql="SELECT * FROM review WHERE rating=?";
        List<Review> reviewList=new ArrayList<>();
        jdbcTemplate.query(sql,(rs, rowNum) -> {
            Review review = new Review();
            review.setReviewId(rs.getInt("review_id"));
            review.setUserId(rs.getInt("user_id"));
            review.setServiceId(rs.getInt("servie_id"));
            review.setRating(rs.getInt("rating"));
            review.setComment(rs.getString("comment"));
            return review;
        },rating) ;
        return reviewList;
    }

    @Override
    public List<Review> searchReviewByDate(LocalDate date) {
        String sql="SELECT * FROM review WHERE date =?";
        List<Review> reviewList=new ArrayList<>();
        jdbcTemplate.query(sql,(rs, rowNum) -> {
            Review review = new Review();
            review.setReviewId(rs.getInt("review_id"));
            review.setUserId(rs.getInt("user_id"));
            review.setServiceId(rs.getInt("servie_id"));
            review.setRating(rs.getInt("rating"));
            review.setComment(rs.getString("comment"));
            return review;
        },date) ;
        return reviewList;
    }
}
