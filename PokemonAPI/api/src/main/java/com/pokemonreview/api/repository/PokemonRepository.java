package com.pokemonreview.api.repository;

import com.pokemonreview.api.models.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PokemonRepository extends JpaRepository<Pokemon,Long> {

}
