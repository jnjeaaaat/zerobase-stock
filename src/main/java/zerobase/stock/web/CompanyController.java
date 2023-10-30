package zerobase.stock.web;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;
import zerobase.stock.model.Company;
import zerobase.stock.service.CompanyService;

@RestController
@AllArgsConstructor
@RequestMapping("/company")
public class CompanyController {

    private final CompanyService companyService;

    @GetMapping("/autocomplete")
    public ResponseEntity<?> autoComplete(@RequestParam String prefix) {
        return null;
    }

    @GetMapping("")
    public ResponseEntity<?> searchCompany() {
        return null;
    }

    @PostMapping("")
    public ResponseEntity<?> addCompany(@RequestBody Company request) {
        String ticker = request.getTicker().trim();
        if (ObjectUtils.isEmpty(ticker)) {
            throw new RuntimeException("ticker is empty");
        }

        Company company = this.companyService.save(ticker);
        return ResponseEntity
                .ok(company);
    }

    @DeleteMapping("")
    public ResponseEntity<?> deleteCompany() {
        return null;
    }
}
