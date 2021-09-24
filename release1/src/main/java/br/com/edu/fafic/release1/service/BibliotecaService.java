package br.com.edu.fafic.release1.service;

import br.com.edu.fafic.release1.domain.Aluno;
import br.com.edu.fafic.release1.domain.Biblioteca;
import br.com.edu.fafic.release1.domain.Bibliotecario;
import br.com.edu.fafic.release1.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BibliotecaService {


    private final BibliotecarioRepository bibliotecarioRepository;


    private final BibliotecaRepository bibliotecaRepository;

    public BibliotecaService(BibliotecarioRepository bibliotecarioRepository, BibliotecaRepository bibliotecaRepository) {
        this.bibliotecarioRepository = bibliotecarioRepository;
        this.bibliotecaRepository = bibliotecaRepository;
    }


    public Biblioteca save(Biblioteca biblioteca){
        return bibliotecaRepository.save(biblioteca);
    }

    public Bibliotecario saveBibliotecario(Bibliotecario bibliotecario){
        return bibliotecarioRepository.save(bibliotecario);
    }

    public Bibliotecario updateBibliotecario(Bibliotecario bibliotecario){
        return bibliotecarioRepository.save(bibliotecario);
    }



    public List<Bibliotecario> getAllBibliotecario(){
        return bibliotecarioRepository.findAll();
    }


    public void deleteBibliotecario(UUID id) {
        Bibliotecario bibliotecario = bibliotecarioRepository.getById(id);
        bibliotecarioRepository.delete(bibliotecario);
    }



}
