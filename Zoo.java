class Zoo {
    String name;
    String[] region;

    Zoo(String name, String[] region) {
        this.name = name;
        this.region = region;
    }

    // Inner class
    class Enclosure {
        String name, type;
        String[] animals;

        Enclosure(String name, String type, String[] animals) {
            this.name = name;
            this.type = type;
            this.animals = animals;
        }

        void display() {
            System.out.println("Enclosure Name: " + name);
            System.out.println("Type: " + type);
            System.out.print("Animals: ");
            for (String a : animals)
                System.out.print(a + " ");
            System.out.println();
        }
    }

    // Static nested class
    static class Contact {
        String address;
        String phone;

        Contact(String address, String phone) {
            this.address = address;
            this.phone = phone;
        }

        void display() {
            System.out.println("Address: " + address);
            System.out.println("Phone: " + phone);
        }
    }

    public static void main(String[] args) {
        String[] regions = {"Area-1", "Area-2"};
        Zoo zoo = new Zoo("City Zoo", regions);

        Zoo.Enclosure e = zoo.new Enclosure(
                "Grassland", "Outdoor",
                new String[]{"Lion", "Deer", "Zebra"}
        );

        Zoo.Contact c = new Zoo.Contact("Trivandrum", "9876543210");

        System.out.println("Zoo Name: " + zoo.name);
        System.out.print("Regions: ");
        for (String r : zoo.region)
            System.out.print(r + " ");
        System.out.println();

        c.display();
        e.display();
    }
}
