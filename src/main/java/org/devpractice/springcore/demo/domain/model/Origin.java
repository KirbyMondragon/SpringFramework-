package org.devpractice.springcore.demo.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Origin {
    private String name;
    private String url;
}
