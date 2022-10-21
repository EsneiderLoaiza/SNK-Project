package com.hexagonal.snk.context.titan.infrastructure.primary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexagonal.snk.context.titan.application.TitanService;
import com.hexagonal.snk.context.titan.infrastructure.primary.dto.TitanDTO;

@RestController
@RequestMapping("/api")
public class TitanResource {

    private final Logger log = LoggerFactory.getLogger(TitanResource.class);

    private final TitanService titanService;
    
    
    public TitanResource(TitanService titanService) {
        this.titanService = titanService;
    }


    @PostMapping("/titan")
    public ResponseEntity<TitanDTO> createTitan(@RequestBody TitanDTO titanDTO) {
        log.debug("REST Request to save Titan : {}", titanDTO);

        TitanDTO result = titanService.save(titanDTO);
        log.debug("REST Response Titan save: {}", result);

        return ResponseEntity.ok(result);
    }
}
