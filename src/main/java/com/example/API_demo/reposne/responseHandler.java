package com.example.API_demo.reposne;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.HashMap;
import java.util.Map;
public class responseHandler {
public static ResponseEntity<Object> generateResponse(HttpStatus status, String message, Object data) {
    Map<String, Object> response = new HashMap<>();
    response.put("status", status.value());
    response.put("message", message);
    return new ResponseEntity<>(response, status);
}
}
