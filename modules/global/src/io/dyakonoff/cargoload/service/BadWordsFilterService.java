package io.dyakonoff.cargoload.service;


public interface BadWordsFilterService {
    String NAME = "cargoload_BadWordsFilterService";

    String filterText(String input);
}