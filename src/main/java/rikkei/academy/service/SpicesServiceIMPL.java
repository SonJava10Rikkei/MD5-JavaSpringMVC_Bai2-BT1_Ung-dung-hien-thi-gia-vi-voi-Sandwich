package rikkei.academy.service;

import rikkei.academy.model.Spices;

import java.util.ArrayList;
import java.util.List;

public class SpicesServiceIMPL implements ISpicesService {

    public static List<Spices> spicesList = new ArrayList<>();

    static {
        spicesList.add(new Spices(1, "Lettuce"));
        spicesList.add(new Spices(2, "Tomato"));
        spicesList.add(new Spices(3, "Mustard"));
        spicesList.add(new Spices(4, "Sprouts"));
    }

    @Override
    public List<Spices> findAll() {

        return spicesList;
    }

    @Override
    public Spices findById(long id) {
        for (int i = 0; i < spicesList.size(); i++) {
            if (spicesList.get(i).getId() == id) {
                return spicesList.get(i);
            }
        }
        return null;
    }

    @Override
    public void save(Spices spices) {
        if (findById(spices.getId()) != null) {
            spicesList.set(spicesList.indexOf(spices), spices);
        } else {
            spicesList.add(spices);
        }

    }

    @Override
    public void deleteById(long id) {
        for (int i = 0; i < spicesList.size(); i++) {
            if (spicesList.get(i).getId() == id) {
                spicesList.remove(i);
            }
        }
    }
}
