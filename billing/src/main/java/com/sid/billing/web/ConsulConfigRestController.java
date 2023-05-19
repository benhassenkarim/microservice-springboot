package com.sid.billing.web;

import com.sid.billing.config.Consulconfig;
import com.sid.billing.config.VaultConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
//@RefreshScope
public class ConsulConfigRestController {
@Autowired
private Consulconfig consulconfig;
@Autowired
private VaultConfig vaultConfig;

    @GetMapping("/myconfig")
    public Map<String,Object> mtconfig(){
        return Map.of("consulConfig",consulconfig,"vaultconfig",vaultConfig);
    }
}
