package com.foodapp.controller;

import com.foodapp.service.DatabaseCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatabaseCheckController {

    @Autowired
    private DatabaseCheckService databaseCheckService;

    @GetMapping("/check-database")
    public String checkDatabase() {
        databaseCheckService.checkDatabaseConnection();
        return "Database check completed. Check console for output.";
    }
}
