package controller;

import com.example.bewd_workshop_jbc.SnackResultSetExtractor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class myController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/testdb")
    public String testDB() {
        System.out.println("Endpoint /testdb hit!");
        jdbcTemplate.execute("CREATE TABLE box (id INT NOT NULL)");
        jdbcTemplate.execute("INSERT INTO box VALUES (1)");
        jdbcTemplate.execute("INSERT INTO box VALUES (2)");
        int value = jdbcTemplate.queryForObject("SELECT MIN(id) FROM box", Integer.class);
        return String.valueOf(value);
    }

    @GetMapping("/testdata")
    public String testData() {
        return jdbcTemplate.queryForObject("SELECT snacknaam FROM Snack WHERE snacknr = 1", String.class);
    }

    @GetMapping("/testdatatwo")
    public String testDataTwo(){
        return jdbcTemplate.query("SELECT * FROM Snack", new SnackResultSetExtractor()).toString();

    }}

