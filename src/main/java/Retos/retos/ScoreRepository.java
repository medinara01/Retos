package Retos.retos;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ScoreRepository {
    @Autowired
    private ScoreCrudRepository crud;
    public List<Score> getAll(){
        return (List<Score>) crud.findAll();
    }
    
    public Optional <Score> getScore(int id){
        return crud.findById(id);
    }
    
    public Score save(Score score){
        return crud.save(score);
    }
    public void delete(Score score){
        crud.delete(score);
    }
}
