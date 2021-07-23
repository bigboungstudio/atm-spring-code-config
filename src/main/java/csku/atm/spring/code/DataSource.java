package csku.atm.spring.code;

import java.util.Map;

public interface DataSource {
    Map<Integer,Customer> readCustomers();
}
