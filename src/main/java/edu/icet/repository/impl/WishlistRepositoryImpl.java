package edu.icet.repository.impl;

import edu.icet.model.Wishlist;
import edu.icet.repository.WishlistRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class WishlistRepositoryImpl implements WishlistRepository {

    final private JdbcTemplate jdbcTemplate;

    @Override
    public boolean addWishlist(Wishlist wishlist) {
        String sql = "INSERT INTO wishlist VALUES(?,?,?)";
        return jdbcTemplate.update(sql,
                wishlist.getWishlistId(),
                wishlist.getUserId(),
                wishlist.getServiceId(),
                wishlist.getAddedAt()
                )>0;
    }

    @Override
    public boolean updateWishlist(Wishlist wishlist) {
        String sql = "update wishlist set user_id=?,service_id=?,added_at=? where wishlist_id=?";
        return jdbcTemplate.update(sql,
                wishlist.getUserId(),
                wishlist.getServiceId(),
                wishlist.getAddedAt(),
                wishlist.getWishlistId()
                )>0;
    }

    @Override
    public boolean deleteWishlist(Integer id) {
        String sql ="DELETE FROM wishlist WHERE wishlist_id=?";
        return jdbcTemplate.update(sql,id)>0;
    }

    @Override
    public Wishlist searchWishlistById(Integer id) {
        String sql ="SELECT * FROM wishlist WHERE wishlist_id=?";
        return jdbcTemplate.queryForObject(sql,(rs, rowNum) -> {
            Wishlist wishlist= new Wishlist();
            wishlist.setWishlistId(rs.getInt(1));
            wishlist.setUserId(rs.getInt(2));
            wishlist.setServiceId(rs.getInt(3));
            wishlist.setAddedAt(rs.getTimestamp(4));
            return wishlist;
        },id) ;
    }

    @Override
    public List<Wishlist> getAllWishlist() {
        String sql="SELECT * FROM wishlist";
        return jdbcTemplate.query(sql,(rs, rowNum) -> {
            Wishlist wishlist =new Wishlist();
            wishlist.setWishlistId(rs.getInt(1));
            wishlist.setUserId(rs.getInt(2));
            wishlist.setServiceId(rs.getInt(3));
            wishlist.setAddedAt(rs.getTimestamp(4));
            return wishlist;
        });
    }

    @Override
    public List<Wishlist> searchWishlistByUser(Integer userId) {
        String sql="SELECT * FROM wishlist user_id=?";
        List<Wishlist>wishlistList=new ArrayList<>();
        jdbcTemplate.query(sql,(rs, rowNum) -> {
            Wishlist wishlist =new Wishlist();
            wishlist.setWishlistId(rs.getInt(1));
            wishlist.setUserId(rs.getInt(2));
            wishlist.setServiceId(rs.getInt(3));
            wishlist.setAddedAt(rs.getTimestamp(4));
            return wishlist;
        },userId);
        return wishlistList;
    }

    @Override
    public List<Wishlist> searchWishlistByService(Integer serviceId) {
        String sql="SELECT * FROM wishlist service_id=?";
        List<Wishlist>wishlistList=new ArrayList<>();
        jdbcTemplate.query(sql,(rs, rowNum) -> {
            Wishlist wishlist =new Wishlist();
            wishlist.setWishlistId(rs.getInt(1));
            wishlist.setUserId(rs.getInt(2));
            wishlist.setServiceId(rs.getInt(3));
            wishlist.setAddedAt(rs.getTimestamp(4));
            return wishlist;
        },serviceId);
        return wishlistList;
    }

    @Override
    public List<Wishlist> searchWishlistByTime(LocalDateTime time) {
        String sql="SELECT * FROM wishlist added_at=?";
        List<Wishlist>wishlistList=new ArrayList<>();
        jdbcTemplate.query(sql,(rs, rowNum) -> {
            Wishlist wishlist =new Wishlist();
            wishlist.setWishlistId(rs.getInt(1));
            wishlist.setUserId(rs.getInt(2));
            wishlist.setServiceId(rs.getInt(3));
            wishlist.setAddedAt(rs.getTimestamp(4));
            return wishlist;
        },time);
        return wishlistList;
    }
}
