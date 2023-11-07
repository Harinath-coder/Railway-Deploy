package com.example.railway.Service;

import com.example.railway.Models.Model;
import com.example.railway.Repo.RlRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RlService {

    @Autowired
    private RlRepo rlRepo;

    public void add(Model model) {

        rlRepo.save(model);
    }

    public String deleteModel(int id){
        rlRepo.deleteById(id);
        return "user name: "+id+" deleted successfully";
    }

    public Model getModel(String name) {

        return rlRepo.findByName(name);
    }
}
