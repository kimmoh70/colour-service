package org.kimmoh70.cars.colourservice;

import org.springframework.data.mongodb.repository.MongoRepository;
public interface ColourRepository extends MongoRepository<Colour, String> {
    Colour findByName(String name);
    Colour findByCode(String code);
}
