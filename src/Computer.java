public class Computer {

    private Components cpu;
    private Components ram;
    private Components motherboard;
    private Components hdd;
    private Components powerSupply;
    private Components computerCase;
    private Components videoCard;
    private Components soundCard;
    private Components networkAdapter;

    private Computer(ComputerBuilder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.motherboard = builder.motherboard;
        this.hdd = builder.hdd;
        this.powerSupply = builder.powerSupply;
        this.computerCase = builder.computerCase;
        this.videoCard = builder.videoCard;
        this.soundCard = builder.soundCard;
        this.networkAdapter = builder.networkAdapter;
    }

    public static class ComputerBuilder {

        private Components cpu;
        private Components ram;
        private Components motherboard;
        private Components hdd;
        private Components powerSupply;
        private Components computerCase;
        private Components videoCard;
        private Components soundCard;
        private Components networkAdapter;

        public ComputerBuilder(Components cpu, Components ram, Components motherboard,
            Components hdd, Components powerSupply, Components computerCase) {
            this.cpu = cpu;
            this.ram = ram;
            this.motherboard = motherboard;
            this.hdd = hdd;
            this.powerSupply = powerSupply;
            this.computerCase = computerCase;
        }

        public ComputerBuilder videoCard(Components videoCard) {
            this.videoCard = videoCard;
            return this;
        }

        public ComputerBuilder soundCard(Components soundCard) {
            this.soundCard = soundCard;
            return this;
        }

        public ComputerBuilder networkAdapter(Components networkAdapter) {
            this.networkAdapter = networkAdapter;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    public void sumComputer() {
        System.out.println("\u001B[33mВаша збірка складається:");
        System.out.println(cpu.getName());
        System.out.println(ram.getName());
        System.out.println(motherboard.getName());
        System.out.println(powerSupply.getName());
        System.out.println(computerCase.getName());
        if (videoCard.getName() != null) {
            System.out.println(videoCard.getName());
        }
        if (soundCard.getName() != null) {
            System.out.println(soundCard.getName());
        }
        if (networkAdapter.getName() != null) {
            System.out.println(networkAdapter.getName());
        }
        System.out.println(
            "Загальна сума збірки: " + (cpu.getPrice() + ram.getPrice() + motherboard.getPrice()
                + hdd.getPrice() + powerSupply.getPrice() + computerCase.getPrice()
                + videoCard.getPrice() + soundCard.getPrice() + networkAdapter.getPrice())
                + "$\u001B[0m");
    }
}

