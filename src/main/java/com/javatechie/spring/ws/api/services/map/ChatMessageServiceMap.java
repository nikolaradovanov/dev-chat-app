package com.javatechie.spring.ws.api.services.map;

import com.javatechie.spring.ws.api.model.ChatMessage;
import com.javatechie.spring.ws.api.services.ChatMessageService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ChatMessageServiceMap extends AbstractMapService<ChatMessage,Long> implements ChatMessageService {


    @Override
    public Set<ChatMessage> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(ChatMessage object) {
        super.delete(object);
    }

    @Override
    public ChatMessage save(ChatMessage object) {
        return super.save(object);
    }

    @Override
    public ChatMessage findById(Long id) {
        return super.findById(id);
    }
}