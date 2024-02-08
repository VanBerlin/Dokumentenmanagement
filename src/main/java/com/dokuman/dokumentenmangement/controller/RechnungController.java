package com.dokuman.dokumentenmangement.controller;

import com.dokuman.dokumentenmangement.dto.RechnungDto;
import com.dokuman.dokumentenmangement.mapper.RechnungMapper;
import com.dokuman.dokumentenmangement.model.Rechnung;
import com.dokuman.dokumentenmangement.service.RechnungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rechnungen")
public class RechnungController {

    @Autowired
    RechnungMapper rechnungMapper;
    private final RechnungService rechnungService;

    @Autowired
    public RechnungController(RechnungService rechnungService) {
        this.rechnungService = rechnungService;
    }

    @PostMapping
    public ResponseEntity<RechnungDto> createRechnung(@RequestBody RechnungDto rechnungDto) {
        Rechnung rechnungForSaving = rechnungMapper.dtoToEntity(rechnungDto);
        Rechnung savedRechnung = rechnungService.saveRechnung(rechnungForSaving);
        RechnungDto savedRechnungDto = rechnungMapper.entityToDto(savedRechnung);
        return ResponseEntity.ok(savedRechnungDto);
    }

    @GetMapping
    public ResponseEntity<List<RechnungDto>> getAllRechnungen() {
        List<Rechnung> rechnungenList = rechnungService.getAllRechnungen();
        List<RechnungDto> rechnungDtoList = rechnungMapper.entitiesToDtos(rechnungenList);
        return ResponseEntity.ok(rechnungDtoList);
    }

}
