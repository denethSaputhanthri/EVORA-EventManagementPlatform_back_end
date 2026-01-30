package edu.icet.controller;

import edu.icet.dto.MessageDto;
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
    public void addMessage(@RequestBody MessageDto messageDto){
        service.addMessage(messageDto);
    }

    @PutMapping("/update")
    public void updateMessage(@RequestBody MessageDto messageDto){
        service.updateMessage(messageDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteMessage(@PathVariable Integer id){
        service.deleteMessage(id);
    }

    @GetMapping("/search")
    public List<MessageDto> getAllMessage(){
        return service.getAllMessage();
    }

    @GetMapping("/search/{id}")
    public MessageDto searchMessageById(@PathVariable Integer id){
        return service.searchMessageById(id);
    }

    @GetMapping("/search-by-sender/{senderId}")
    public List<MessageDto> searchMessageBySender(@PathVariable Integer senderId){
        return service.searchMessageBySender(senderId);
    }

    @GetMapping("/search-by-receiver/{receiverId}")
    public List<MessageDto> searchMessageByReceiver(@PathVariable Integer receiverId){
        return service.searchMessageByReceiver(receiverId);
    }

    @GetMapping("/search-by-date/{date}")
    public List<MessageDto> searchMessageByDate(@PathVariable LocalDate date){
        return service.searchMessageByDate(date);
    }







}
