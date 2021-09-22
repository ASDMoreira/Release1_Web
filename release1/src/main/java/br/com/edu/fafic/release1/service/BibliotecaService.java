package br.com.edu.fafic.release1.service;

import br.com.edu.fafic.release1.domain.Aluno;
import br.com.edu.fafic.release1.domain.Bibliotecario;
import br.com.edu.fafic.release1.repositories.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BibliotecaService {

    private final BibliotecarioRepository bibliotecarioRepository;

    public BibliotecaService(BibliotecarioRepository bibliotecarioRepository) {
        this.bibliotecarioRepository = bibliotecarioRepository;
    }


    public Bibliotecario saveBibliotecario(Bibliotecario bibliotecario){
        return bibliotecarioRepository.save(bibliotecario);
    }

    public Bibliotecario updateBibliotecario(Bibliotecario bibliotecario){
        return bibliotecarioRepository.save(bibliotecario);
    }

    public List<Bibliotecario> findAllBibliotecario() {
        return bibliotecarioRepository.findAll();
    }


    public void deleteBibliotecario(UUID id) {
        Bibliotecario bibliotecario = bibliotecarioRepository.getById(id);
        bibliotecarioRepository.delete(bibliotecario);
    }



}
