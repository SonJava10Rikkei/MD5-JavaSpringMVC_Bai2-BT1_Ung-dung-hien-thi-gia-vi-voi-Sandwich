package rikkei.academy.service;

import rikkei.academy.model.Spices;

import java.util.List;

public interface ISpicesService {
    List<Spices> findAll();

    Spices findById(long id);

    void save(Spices spices);

    void deleteById(long id);
}
