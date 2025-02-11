package MerkMobil.API.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import MerkMobil.API.model.MerkMobil;
import MerkMobil.API.service.MerkMobilService;

@RestController
@RequestMapping("/api/merk-mobil")
public class MerkMobilController {
    @Autowired
    private MerkMobilService merkMobilService;

    @GetMapping("/")
    public List<MerkMobil> getAllMerkMobil() {
        return merkMobilService.getAllMerkMobil();
    }

    @PostMapping("/")
    public MerkMobil createMerkMobil(@RequestBody MerkMobil merkMobil) {
        return merkMobilService.createMerkMobil(merkMobil);
    }

    @PutMapping("/{id}")
    public MerkMobil updateMerkMobil(@PathVariable Long id, @RequestBody MerkMobil merkMobil) {
        return merkMobilService.updateMerkMobil(id, merkMobil);
    }

    @DeleteMapping("/{id}")
    public void deleteMerkMobil(@PathVariable Long id) {
        merkMobilService.deleteMerkMobil(id);
    }

}
