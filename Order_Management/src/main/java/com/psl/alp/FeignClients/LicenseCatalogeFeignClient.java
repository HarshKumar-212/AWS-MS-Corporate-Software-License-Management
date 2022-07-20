package com.psl.alp.FeignClients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "http://localhost:8000",value="LicenseFeignClient", path="/api/v1")
public interface LicenseCatalogeFeignClient {

	@GetMapping("/licenses/{licenseId}")
    public boolean validateLicenseId(@PathVariable long licenseId);
}
