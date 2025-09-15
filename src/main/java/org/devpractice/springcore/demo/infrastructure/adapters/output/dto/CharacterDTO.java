package org.devpractice.springcore.demo.infrastructure.adapters.output.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.devpractice.springcore.demo.domain.model.Episode;
import org.devpractice.springcore.demo.domain.model.Location;
import org.devpractice.springcore.demo.domain.model.Origin;

import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record CharacterDTO (
        @JsonAlias("id") Integer id,
         String name,
         String status,
         String species,
         String type,
         String gender,
         Origin origin,
         Location location,
         String image,
         List<String> episode,
         String url,
         Date created
){}
