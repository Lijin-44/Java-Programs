class CPU {
    int price;

    CPU(int price) {
        this.price = price;
    }

    // Inner class
    class Processor {
        int cores;
        String manufacturer;

        Processor(int cores, String manufacturer) {
            this.cores = cores;
            this.manufacturer = manufacturer;
        }

        void display() {
            System.out.println("Processor Cores: " + cores);
            System.out.println("Processor Manufacturer: " + manufacturer);
        }
    }

    // Static nested class
    static class RAM {
        int memory;
        String manufacturer;

        RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        void display() {
            System.out.println("RAM Memory: " + memory + "GB");
            System.out.println("RAM Manufacturer: " + manufacturer);
        }
    }

    public static void main(String[] args) {
        CPU cpu = new CPU(50000);
        CPU.Processor p = cpu.new Processor(8, "Intel");
        CPU.RAM r = new CPU.RAM(16, "Corsair");

        System.out.println("CPU Price: " + cpu.price);
        p.display();
        r.display();
    }
}
