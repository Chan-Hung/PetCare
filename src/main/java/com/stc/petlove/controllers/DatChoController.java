package com.stc.petlove.controllers;

import com.stc.petlove.dtos.datcho.DatChoDto;
import com.stc.petlove.entities.DatCho;
import com.stc.petlove.services.datcho.DatChoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/rest/dat-cho")
public class DatChoController {
    private final DatChoService datChoService;

    public DatChoController(DatChoService datChoService) {
        this.datChoService = datChoService;
    }

    @PostMapping
    public ResponseEntity<DatCho> create(@Valid @RequestBody DatChoDto dto) {
        return new ResponseEntity<>(datChoService.create(dto), HttpStatus.OK);
    }
}
