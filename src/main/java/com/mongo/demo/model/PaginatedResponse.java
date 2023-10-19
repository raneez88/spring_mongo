package com.mongo.demo.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class PaginatedResponse<T> {
    private int currentPage;
    private long totalItems;
    private int totalPages;
    private List<T> items;
    private boolean hasNext;
}