package com.usa.divinacomedia.app.repositories.Crud;

import com.usa.divinacomedia.app.model.HairProduct;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface HairProductCrudRepository extends MongoRepository<HairProduct, String> {
    //Reto 5
    public List<HairProduct> findByPriceLessThanEqual(double precio);

    @Query("{'description':{'$regex':'?0','$options':'i'}}")
    public List<HairProduct> findByDescriptionLike(String description);
}

