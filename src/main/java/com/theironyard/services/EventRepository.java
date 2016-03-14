package com.theironyard.services;//Created by KevinBozic on 3/14/16.

import com.theironyard.entities.Event;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EventRepository extends CrudRepository<Event, Integer> {
    List<Event> findAllByOrderByDateTimeDesc();
}
