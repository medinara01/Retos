package Servicio;

import Modelo.Message;
import Repositorio.MessageRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;

    public List<Message> getAll(){
        return messageRepository.getAll();
    }

    public Optional<Message> getMessage(int idMessage){
        return messageRepository.getMessage(idMessage);
    }

    public Message save(Message p){
        if(p.getIdMessage()==null) {
            return messageRepository.save(p);
        }else{
            Optional<Message> aux=messageRepository.getMessage(p.getIdMessage());
            if(aux.isEmpty()){
                return messageRepository.save(p);
            }else{
                return p;
            }
        }
    }
}
