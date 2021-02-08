package kr.co.fastcampus.eatgo.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {

    List<Restaurant> findAll();
    //TODO: 오류 원인 찾아야함
    List<Restaurant> findAllByAddressContainingByCategoryId(String region, Long categoryId);

    Optional<Restaurant> findById(Long id);

    Restaurant save(Restaurant restaurant);
}
