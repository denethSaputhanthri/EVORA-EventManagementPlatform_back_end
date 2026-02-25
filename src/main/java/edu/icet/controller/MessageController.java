package edu.icet.controller;

import edu.icet.model.Message;
import edu.icet.service.MessageService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Message")
@Tag(name = "Message-Controller",description = "Message API Collection...")
public class MessageController {

    final MessageService service;

    @PostMapping("/add")
    public void addMessage(@RequestBody Message message){
        service.addMessage(message);
    }

    @PutMapping("/update")
    public void updateMessage(@RequestBody Message message){
        service.updateMessage(message);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteMessage(@PathVariable Integer id){
        service.deleteMessage(id);
    }

    @GetMapping("/search")
    public List<Message> getAllMessage(){
        return service.getAllMessage();
    }

    @GetMapping("/search/{id}")
    public Message searchMessageById(@PathVariable Integer id){
        return service.searchMessageById(id);
    }

    @GetMapping("/search-by-sender/{senderId}")
    public List<Message> searchMessageBySender(@PathVariable Integer senderId){
        return service.searchMessageBySender(senderId);
    }

    @GetMapping("/search-by-receiver/{receiverId}")
    public List<Message> searchMessageByReceiver(@PathVariable Integer receiverId){
        return service.searchMessageByReceiver(receiverId);
    }

    @GetMapping("/search-by-date/{date}")
    public List<Message> searchMessageByDate(@PathVariable LocalDate date){
        return service.searchMessageByDate(date);
    }







}
