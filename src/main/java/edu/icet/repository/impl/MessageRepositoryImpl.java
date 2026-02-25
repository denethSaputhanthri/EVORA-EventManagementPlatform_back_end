package edu.icet.repository.impl;

import edu.icet.model.Message;
import edu.icet.repository.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@Repository
public class MessageRepositoryImpl implements MessageRepository {

    final private JdbcTemplate jdbcTemplate;

    @Override
    public void addMessage(Message message) {
        String sql = "INSERT INTO message VALUES(?,?,?,?,?,?)";
        jdbcTemplate.update(sql,
                message.getMessageId(),
                message.getSenderId(),
                message.getReceiverId(),
                message.getContent(),
                message.getSentAt());
    }

    @Override
    public void updateMessage(Message message) {
        String sql = "UPDATE message SET sender_id = ? , receiver_id = ? , content = ? , sent_at = ? WHERE message_id = ?";
        jdbcTemplate.update(sql,
                message.getSenderId(),
                message.getReceiverId(),
                message.getContent(),
                message.getSentAt(),
                message.getMessageId());
    }

    @Override
    public void deleteMessage(Integer id) {
        String sql = "DELETE FROM message WHERE message_id = ?";
        jdbcTemplate.update(sql,id);
    }

    @Override
    public List<Message> getAllMessage() {
        String sql = "SELECT * FROM message";
        return jdbcTemplate.query(sql,(rs, rowNum) -> {
            Message message = new Message();
            message.setMessageId(rs.getInt(1));
            message.setSenderId(rs.getInt(2));
            message.setReceiverId(rs.getInt(3));
            message.setContent(rs.getString(4));
            message.setSentAt(LocalDate.parse(rs.getString(5)));
            return message;
        });
    }

    @Override
    public Message searchMessageById(Integer id) {
        String sql = "SELECT * FROM message WHERE message_id = ? ";
        return jdbcTemplate.queryForObject(sql,(rs, rowNum) -> {
            Message message = new Message();
            message.setMessageId(rs.getInt(1));
            message.setSenderId(rs.getInt(2));
            message.setReceiverId(rs.getInt(3));
            message.setContent(rs.getString(4));
            message.setSentAt(LocalDate.parse(rs.getString(5)));
            return message;
        },id);
    }

    @Override
    public List<Message> searchMessageBySender(Integer senderId) {
        String sql = "SELECT * FROM message WHERE sender_id = ? ";
        return jdbcTemplate.query(sql,(rs, rowNum) -> {
            Message message = new Message();
            message.setMessageId(rs.getInt(1));
            message.setSenderId(rs.getInt(2));
            message.setReceiverId(rs.getInt(3));
            message.setContent(rs.getString(4));
            message.setSentAt(LocalDate.parse(rs.getString(5)));
            return message;
        },senderId);
    }

    @Override
    public List<Message> searchMessageByReceiver(Integer receiverId) {
        String sql = "SELECT * FROM message WHERE receiver_id = ? ";
        return jdbcTemplate.query(sql,(rs, rowNum) -> {
            Message message = new Message();
            message.setMessageId(rs.getInt(1));
            message.setSenderId(rs.getInt(2));
            message.setReceiverId(rs.getInt(3));
            message.setContent(rs.getString(4));
            message.setSentAt(LocalDate.parse(rs.getString(5)));
            return message;
        },receiverId);
    }

    @Override
    public List<Message> searchMessageByDate(LocalDate date) {
        String sql = "SELECT * FROM message WHERE message_id = ? ";
        return jdbcTemplate.query(sql,(rs, rowNum) -> {
            Message message = new Message();
            message.setMessageId(rs.getInt(1));
            message.setSenderId(rs.getInt(2));
            message.setReceiverId(rs.getInt(3));
            message.setContent(rs.getString(4));
            message.setSentAt(LocalDate.parse(rs.getString(5)));
            return message;
        },date);
    }
}
