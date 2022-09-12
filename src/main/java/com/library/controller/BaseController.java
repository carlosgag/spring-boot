package com.library.controller;

import com.library.dto.BaseDTO;
import com.library.model.BaseModel;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.net.URI;

public abstract class BaseController<D extends BaseDTO, M extends BaseModel> {

    @PostMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> create(@Validated @RequestBody D d) {
        M model = toModel(d);
        create(model);
        return ResponseEntity.created(URI.create(String.format("/" + getAPIVersion() +
                "/" + getEntityUriPart() + "/%s", model.getId()))).build();
    }

    protected abstract M toModel(D d);

    protected abstract D toDTO(M m);

    protected abstract void create(M m);

    protected abstract String getAPIVersion();

    protected abstract String getEntityUriPart();
}
