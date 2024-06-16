package com.example.parcautobackend.Service.impls;

import com.example.parcautobackend.model.entities.Structure;
import com.example.parcautobackend.model.repositories.StructureRepository;
import com.example.parcautobackend.Service.StructureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StructureServiceImpl implements StructureService {

    @Autowired
    private StructureRepository structureRepository;

    @Override
    public Structure saveStructure(Structure structure) {
        return structureRepository.save(structure);
    }

    @Override
    public Optional<Structure> getStructureById(Long id) {
        return structureRepository.findById(id);
    }

    @Override
    public List<Structure> getAllStructures() {
        return structureRepository.findAll();
    }

    @Override
    public Structure updateStructure(Long id, Structure structure) {
        if (structureRepository.existsById(id)) {
            structure.setIdStructure(id);
            return structureRepository.save(structure);
        }
        return null;
    }

    @Override
    public void deleteStructure(Long id) {
        structureRepository.deleteById(id);
    }
}
