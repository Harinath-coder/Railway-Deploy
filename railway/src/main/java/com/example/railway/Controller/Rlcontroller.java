package com.example.railway.Controller;

import com.example.railway.Models.Model;
import com.example.railway.Service.RlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class Rlcontroller {

    @Autowired
    private RlService rlService;

    @PostMapping("/add")
    public ResponseEntity<Map<String, Object>> add(@RequestBody Model model){
        Map<String, Object> response = new HashMap<>();
        rlService.add(model);
        response.put("message","user name: "+model.getName()+" added successfully");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map<String, Object>> delete(@PathVariable int id){
        String msg = rlService.deleteModel(id);
        Map<String, Object> response = new HashMap<>();
        response.put("message", msg);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/get")
    public ResponseEntity<Map<String, Object>> get(@RequestParam("name") String name){
        Model msg = rlService.getModel(name);
        Map<String, Object> response = new HashMap<>();
        response.put("message", msg);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
