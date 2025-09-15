package org.devpractice.springcore.demo.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;

@Data
@Builder
@AllArgsConstructor
public class Episode {
    private Integer id;
    private String episodeUrl;

}
