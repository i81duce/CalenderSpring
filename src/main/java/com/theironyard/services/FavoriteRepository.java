package com.theironyard.services;//Created by KevinBozic on 3/14/16.

import com.theironyard.entities.Favorite;
import org.springframework.data.repository.CrudRepository;

public interface FavoriteRepository extends CrudRepository<Favorite, Integer> {
}
