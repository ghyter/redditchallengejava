package com.github.ghyter.reddischallenge.meta;

import org.springframework.stereotype.Repository;

@Repository
public class MetaRepository {

    Project GetProject(){
        return new Project("Reddis Challenge (Java)");
    }

}
