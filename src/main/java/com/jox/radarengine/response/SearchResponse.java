package com.jox.radarengine.response;

import com.jox.radarengine.model.LinkageData;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class SearchResponse {

    private String name;
    private String npwp;
    private String address;
    private String siup;
    private String id;
    private LinkageData linkageData;
}
