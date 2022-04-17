package model.dao;


import model.entities.Seller;

import java.util.List;

public interface SellerDao {
    void insert(Seller seller);

    void deleteById(Integer id);

    void update(Seller seller);

    Seller findById(Integer id);

    List<Seller> findAll();
}
