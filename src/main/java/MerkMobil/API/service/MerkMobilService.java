package MerkMobil.API.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MerkMobil.API.model.MerkMobil;
import MerkMobil.API.repository.MerkMobilRepository;

@Service
public class MerkMobilService {
    @Autowired
    private MerkMobilRepository merkMobilRepository;

    public List<MerkMobil> getAllMerkMobil() {
        return merkMobilRepository.findAll();
    }

    public MerkMobil createMerkMobil(MerkMobil merkMobil) {
        return merkMobilRepository.save(merkMobil);
    }

    public MerkMobil updateMerkMobil(Long id, MerkMobil merkMobil) {
        merkMobil.setId(id);
        return merkMobilRepository.save(merkMobil);
    }

    public void deleteMerkMobil(Long id) {
        merkMobilRepository.deleteById(id);
    }

}
