package com.spring.taco.repository;

import com.spring.taco.model.TacoOrder;

public interface OrderRepository {
    TacoOrder save(TacoOrder order);
}