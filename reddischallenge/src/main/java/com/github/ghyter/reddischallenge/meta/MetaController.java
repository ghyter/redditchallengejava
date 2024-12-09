package com.github.ghyter.reddischallenge.meta;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/project")
public class MetaController {
    private final MetaRepository repository;

    public MetaController(MetaRepository metaRepository){
        repository = metaRepository;
    }

    @GetMapping
    public Project getProject(){
        return repository.GetProject();
    }

}
