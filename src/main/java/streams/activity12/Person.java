package streams.activity12;

import java.util.List;

class Person {
    private String name;
    private List<Address> addresses;

    public Person(String name, List<Address> addresses) {
        this.name = name;
        this.addresses = addresses;
    }

    public String getName() {
        return name;
    }

    public List<Address> getAddresses() {
        return addresses;
    }
}

