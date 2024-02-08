package com.dokuman.dokumentenmangement.service;

import com.dokuman.dokumentenmangement.model.Rechnung;
import com.dokuman.dokumentenmangement.repository.RechnungRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RechnungService {

    private final RechnungRepository rechnungRepository;

    @Autowired
    public RechnungService(RechnungRepository rechnungRepository) {
        this.rechnungRepository = rechnungRepository;
    }

    @Transactional
    public Rechnung saveRechnung(Rechnung rechnung) {

        return rechnungRepository.save(rechnung);
    }

    @Transactional(readOnly = true)
    public List<Rechnung> getAllRechnungen() {
        return rechnungRepository.findAll();
    }
}
