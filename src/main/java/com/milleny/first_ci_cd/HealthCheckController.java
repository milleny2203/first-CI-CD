package com.milleny.first_ci_cd;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
//rota base
@RequestMapping("/api/health")


public class HealthCheckController {

    @GetMapping
    public ResponseEntity<Payload> status(){
        return ResponseEntity.ok(
            new Payload(
                "first-ci-cd",
                "UP",
                Instant.now(),
                "CI/CD Pipeline succesfully executed and running"
            )
        );
    }

}
