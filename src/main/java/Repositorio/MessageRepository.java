package Repositorio;

import Interface.MessageCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
import Modelo.Message;

@Repository
public class MessageRepository {

    @Autowired
    private MessageCrudRepository messageCrudRepository;

    public List<Message> getAll(){ return (List<Message>) messageCrudRepository.findAll(); }

    public Optional<Message> getMessage(int idMessage){
        return messageCrudRepository.findById(idMessage);
    }

    public Message save(Message p){
        return messageCrudRepository.save(p);
    }
}