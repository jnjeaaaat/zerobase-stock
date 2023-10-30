package zerobase.stock.web;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/company")
public class CompanyController {

    @GetMapping("/autocomplete")
    public ResponseEntity<?> autoComplete(@RequestParam String prefix) {
        return null;
    }

    @GetMapping("")
    public ResponseEntity<?> searchCompany() {
        return null;
    }

    @PostMapping("")
    public ResponseEntity<?> addCompany() {
        return null;
    }

    @DeleteMapping("")
    public ResponseEntity<?> deleteCompany() {
        return null;
    }
}
