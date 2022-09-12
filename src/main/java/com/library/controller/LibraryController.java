package com.library.controller;

import com.library.dto.BaseDTO;
import com.library.dto.LibraryDTO;
import com.library.model.BaseModel;
import com.library.model.Library;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/libraries")
public class LibraryController extends BaseController<LibraryDTO, Library> {

    @Override
    protected Library toModel(LibraryDTO libraryDTO) {
        return null;
    }

    @Override
    protected LibraryDTO toDTO(Library library) {
        return null;
    }

    @Override
    protected void create(Library library) {

    }

    @Override
    protected String getAPIVersion() {
        return null;
    }

    @Override
    protected String getEntityUriPart() {
        return null;
    }
}
