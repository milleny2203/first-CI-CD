package com.milleny.first_ci_cd;

import java.time.Instant;

public record Payload(
    String service,
    String status,
    Instant timestamp,
    String message
    
) {



}
