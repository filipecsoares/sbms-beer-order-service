package com.simpledevelopment.beer.order.service.repositories;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.simpledevelopment.beer.order.service.domain.BeerOrderLine;

public interface BeerOrderLineRepository extends PagingAndSortingRepository<BeerOrderLine, UUID> {
}
