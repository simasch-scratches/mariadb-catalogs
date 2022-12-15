package com.example.mariadbcatalogs;

import com.example.mariadbcatalogs.one.One;
import com.example.mariadbcatalogs.one.OneRepository;
import com.example.mariadbcatalogs.two.Two;
import com.example.mariadbcatalogs.two.TwoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class MariadbCatalogsApplicationTests {

    @Autowired
    private OneRepository oneRepository;
    @Autowired
    private TwoRepository twoRepository;

    @Test
    void save_in_two_catalogs() {
        One one = new One();
        one.setName("One " + LocalDateTime.now());
        oneRepository.saveAndFlush(one);

        Two two = new Two();
        two.setName("Two " + LocalDateTime.now());
        twoRepository.saveAndFlush(two);
    }

}
