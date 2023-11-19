import java.util.Scanner;

public class Interface {

    static Scanner scanner = new Scanner(System.in);
    public static String cpuName;
    public static int cpuPrice = 0;
    public static String ramName;
    public static int ranPrice = 0;
    public static String motherboardName;
    public static int motherboardPrice = 0;
    public static String hddName = null;
    public static int hddPrice = 0;
    public static String powerSupplyName;
    public static int powerSupplyPrice = 0;
    public static String computerCaseName;
    public static int computerCasePrice = 0;
    public static String videoCardName;
    public static int videoCardPrice = 0;
    public static String soundCardName;
    public static int soundCardPrice = 0;
    public static String networkAdapterName;
    public static int networkAdapterPrice = 0;

    public static void menu() {
        mainMenu();
    }

    private static void mainMenu() {
        System.out.println("Натисніть відповідну кнопку на клавіатурі щоб обрати");
        System.out.println("1.Обрати процесор");
        System.out.println("2.Обрати оперативну пам'ять");
        System.out.println("3.Обрати материнську плату");
        System.out.println("4.Обрати жорсткий диск");
        System.out.println("5.Обрати блок живлення");
        System.out.println("6.Обрати корпус");
        System.out.println("7.Обрати відеокарту");
        System.out.println("8.Обрати звукову карту");
        System.out.println("9.Обрати мережевий адаптер");
        System.out.println("0.Вивести готову збірку");
        switch (scanner.nextInt()) {
            case 1:
                chooseCPU();
                break;
            case 2:
                chooseRAM();
                break;
            case 3:
                chooseMotherboard();
                break;
            case 4:
                chooseHDD();
                break;
            case 5:
                choosePowerSupply();
                break;
            case 6:
                chooseComputerCase();
                break;
            case 7:
                chooseVideoCard();
                break;
            case 8:
                chooseSoundCard();
                break;
            case 9:
                chooseNetworkAdapter();
                break;
            case 0:
                CPU cpu = new CPU(cpuName, cpuPrice);
                RAM ram = new RAM(ramName, ranPrice);
                Motherboard motherboard = new Motherboard(motherboardName, motherboardPrice);
                HDD hdd = new HDD(hddName, hddPrice);
                PowerSupply powerSupply = new PowerSupply(powerSupplyName, powerSupplyPrice);
                ComputerCase computerCase = new ComputerCase(computerCaseName, computerCasePrice);
                VideoCard videoCard = new VideoCard(videoCardName, videoCardPrice);
                SoundCard soundCard = new SoundCard(soundCardName, soundCardPrice);
                NetworkAdapter networkAdapter = new NetworkAdapter(networkAdapterName,
                    networkAdapterPrice);

                if (cpu.getName() == null || ram.getName() == null || motherboard.getName() == null
                    || hdd.getName() == null || powerSupply.getName() == null
                    || computerCase.getName() == null) {
                    System.out.println("\u001B[31mВи не обрали обов'язкові компоненти збірки\u001B[0m");
                    System.out.println("Натисність 0 щоб повернутися");
                    if (scanner.nextInt() == 0) {
                        mainMenu();
                    }
                    else {
                        throw new RuntimeException("The number is less than 1");
                    }
                }
                else {
                    Computer computer = new Computer.ComputerBuilder(cpu, ram, motherboard, hdd,
                        powerSupply,
                        computerCase)
                        .videoCard(videoCard)
                        .soundCard(soundCard)
                        .networkAdapter(networkAdapter)
                        .build();
                    computer.sumComputer();
                }
                break;
            default:
                System.out.println("\u001B[31mНатисніть відповідну кнопку\u001B[0m");
                mainMenu();
        }
    }

    private static void chooseCPU() {
        String intelName = "Intel Core i5-11600K";
        int intelPrice = 250;
        String amdName = "AMD Ryzen 7 5800X";
        int amdPrice = 450;

        System.out.println("Натисніть відповідну кнопку на клавіатурі щоб обрати процесор");
        System.out.println("1. " + intelName + " (" + intelPrice + "$)");
        System.out.println("2. " + amdName + " (" + amdPrice + "$)");
        System.out.println("0. Повернутися назад");

        switch (scanner.nextInt()) {
            case 1:
                cpuName = intelName;
                cpuPrice = intelPrice;
                System.out.println("\u001B[32mЗбережено!\u001B[0m");
                mainMenu();
                break;
            case 2:
                cpuName = amdName;
                cpuPrice = amdPrice;
                System.out.println("\u001B[32mЗбережено!\u001B[0m");
                mainMenu();
                break;
            case 0:
                mainMenu();
                break;
            default:
                System.out.println("\u001B[31mНатисніть відповідну кнопку\u001B[0m");
                chooseCPU();
        }
    }

    private static void chooseRAM() {
        String corsairName = "Corsair Vengeance LPX 16GB DDR4 3200MHz";
        int corsairPrice = 80;
        String gskillName = "G.Skill Trident Z RGB 32GB DDR4 3600MHz";
        int gskillPrice = 160;

        System.out.println(
            "Натисніть відповідну кнопку на клавіатурі щоб обрати оперативну память");
        System.out.println("1." + corsairName + " (" + corsairPrice + "$)");
        System.out.println("2." + gskillName + " (" + gskillPrice + "$)");
        System.out.println("0. Повернутися назад");

        switch (scanner.nextInt()) {
            case 1:
                ramName = corsairName;
                ranPrice = corsairPrice;
                System.out.println("\u001B[32mЗбережено!\u001B[0m");
                mainMenu();
                break;
            case 2:
                ramName = gskillName;
                ranPrice = gskillPrice;
                System.out.println("\u001B[32mЗбережено!\u001B[0m");
                mainMenu();
                break;
            case 0:
                mainMenu();
                break;
            default:
                System.out.println("\u001B[31mНатисніть відповідну кнопку\u001B[0m");
                chooseRAM();
        }
    }

    private static void chooseMotherboard() {
        String asusName = "ASUS ROG Strix B550-F Gaming";
        int asusPrice = 200;
        String msiName = "MSI MPG Z490 Gaming Edge WiFi";
        int msiPrice = 250;
        String gigabyteName = "Gigabyte B450 AORUS PRO WIFI";
        int gigabytePrice = 120;

        System.out.println(
            "Натисніть відповідну кнопку на клавіатурі щоб обрати материнську плату");
        System.out.println("1." + asusName + " (" + asusPrice + "$)");
        System.out.println("2." + msiName + " (" + msiPrice + "$)");
        System.out.println("3." + gigabyteName + " (" + gigabytePrice + "$)");
        System.out.println("0. Повернутися назад");

        switch (scanner.nextInt()) {
            case 1:
                motherboardName = asusName;
                motherboardPrice = asusPrice;
                System.out.println("\u001B[32mЗбережено!\u001B[0m");
                mainMenu();
                break;
            case 2:
                motherboardName = msiName;
                motherboardPrice = msiPrice;
                System.out.println("\u001B[32mЗбережено!\u001B[0m");
                mainMenu();
                break;
            case 3:
                motherboardName = gigabyteName;
                motherboardPrice = gigabytePrice;
                System.out.println("\u001B[32mЗбережено!\u001B[0m");
                mainMenu();
                break;
            case 0:
                mainMenu();
                break;
            default:
                System.out.println("\u001B[31mНатисніть відповідну кнопку\u001B[0m");
                chooseMotherboard();
        }
    }

    private static void chooseHDD() {
        String seagateName = "Seagate Barracuda 2TB HDD";
        int seagatePrice = 60;
        String samsungName = "Samsung 970 EVO Plus 1TB NVMe SSD";
        int samsungPrice = 150;

        System.out.println("Натисніть відповідну кнопку на клавіатурі щоб обрати жорсткий диск");
        System.out.println("1." + seagateName + " (" + seagatePrice + "$)");
        System.out.println("2." + samsungName + " (" + samsungPrice + "$)");
        System.out.println("0. Повернутися назад");

        switch (scanner.nextInt()) {
            case 1:
                hddName = seagateName;
                hddPrice = seagatePrice;
                System.out.println("\u001B[32mЗбережено!\u001B[0m");
                mainMenu();
                break;
            case 2:
                hddName = samsungName;
                hddPrice = samsungPrice;
                System.out.println("\u001B[32mЗбережено!\u001B[0m");
                mainMenu();
                break;
            case 0:
                mainMenu();
                break;
            default:
                System.out.println("\u001B[31mНатисніть відповідну кнопку\u001B[0m");
                chooseHDD();
        }
    }

    private static void choosePowerSupply() {
        String evgaName = "EVGA 600 W1, 80+ WHITE 600W";
        int evgaPrice = 50;
        String corsairName = "Corsair RM750x, 750W 80+ Gold";
        int corsairPrice = 130;

        System.out.println("Натисніть відповідну кнопку на клавіатурі щоб обрати блок живлення");
        System.out.println("1." + evgaName + " (" + evgaPrice + "$)");
        System.out.println("2." + corsairName + " (" + corsairPrice + "$)");
        System.out.println("0. Повернутися назад");

        switch (scanner.nextInt()) {
            case 1:
                powerSupplyName = evgaName;
                powerSupplyPrice = evgaPrice;
                System.out.println("\u001B[32mЗбережено!\u001B[0m");
                mainMenu();
                break;
            case 2:
                powerSupplyName = corsairName;
                powerSupplyPrice = corsairPrice;
                System.out.println("\u001B[32mЗбережено!\u001B[0m");
                mainMenu();
                break;
            case 0:
                mainMenu();
                break;
            default:
                System.out.println("\u001B[31mНатисніть відповідну кнопку\u001B[0m");
                choosePowerSupply();
        }
    }

    private static void chooseComputerCase() {
        String nzxtName = "NZXT H510";
        int nzxtPrice = 70;
        String fractalName = "Fractal Design Meshify C";
        int fractalPrice = 90;

        System.out.println("Натисніть відповідну кнопку на клавіатурі щоб обрати корпус");
        System.out.println("1." + nzxtName + " (" + nzxtPrice + "$)");
        System.out.println("2." + fractalName + " (" + fractalPrice + "$)");
        System.out.println("0. Повернутися назад");

        switch (scanner.nextInt()) {
            case 1:
                computerCaseName = nzxtName;
                computerCasePrice = nzxtPrice;
                System.out.println("\u001B[32mЗбережено!\u001B[0m");
                mainMenu();
                break;
            case 2:
                computerCaseName = fractalName;
                computerCasePrice = fractalPrice;
                System.out.println("\u001B[32mЗбережено!\u001B[0m");
                mainMenu();
                break;
            case 0:
                mainMenu();
                break;
            default:
                System.out.println("\u001B[31mНатисніть відповідну кнопку\u001B[0m");
                chooseComputerCase();
        }
    }

    private static void chooseVideoCard() {
        String nvidiaName = "NVIDIA GeForce RTX 3060";
        int nvidiaPrice = 500;
        String amdName = "AMD Radeon RX 6700 XT";
        int amdPrice = 600;

        System.out.println("Натисніть відповідну кнопку на клавіатурі щоб обрати відеокарту");
        System.out.println("1." + nvidiaName + " (" + nvidiaPrice + "$)");
        System.out.println("2." + amdName + " (" + amdPrice + "$)");
        System.out.println("0. Повернутися назад");

        switch (scanner.nextInt()) {
            case 1:
                videoCardName = nvidiaName;
                videoCardPrice = nvidiaPrice;
                System.out.println("\u001B[32mЗбережено!\u001B[0m");
                mainMenu();
                break;
            case 2:
                videoCardName = amdName;
                videoCardPrice = amdPrice;
                System.out.println("\u001B[32mЗбережено!\u001B[0m");
                mainMenu();
                break;
            case 0:
                mainMenu();
                break;
            default:
                System.out.println("\u001B[31mНатисніть відповідну кнопку\u001B[0m");
                chooseVideoCard();
        }
    }

    private static void chooseSoundCard() {
        String asusName = "ASUS Xonar DGX PCI-E GX2.5";
        int asusPrice = 40;
        String creativeName = "Creative Sound Blaster Z PCIe";
        int creativePrice = 90;

        System.out.println("Натисніть відповідну кнопку на клавіатурі щоб обрати звукову карту");
        System.out.println("1." + asusName + " (" + asusPrice + "$)");
        System.out.println("2." + creativeName + " (" + creativePrice + "$)");
        System.out.println("0. Повернутися назад");

        switch (scanner.nextInt()) {
            case 1:
                soundCardName = asusName;
                soundCardPrice = asusPrice;
                System.out.println("\u001B[32mЗбережено!\u001B[0m");
                mainMenu();
                break;
            case 2:
                soundCardName = creativeName;
                soundCardPrice = creativePrice;
                System.out.println("\u001B[32mЗбережено!\u001B[0m");
                mainMenu();
                break;
            case 0:
                mainMenu();
                break;
            default:
                System.out.println("\u001B[31mНатисніть відповідну кнопку\u001B[0m");
                chooseSoundCard();
        }
    }

    private static void chooseNetworkAdapter() {
        String tplinkName = "TP-Link Archer T9E AC1900";
        int tplinkPrice = 60;
        String intelName = "Intel Gigabit CT PCI-E Network Adapter";
        int intelPrice = 35;
        String asusName = "ASUS PCE-AC68 AC1900";
        int asusPrice = 70;

        System.out.println(
            "Натисніть відповідну кнопку на клавіатурі щоб обрати мережевий адаптер");
        System.out.println("1." + tplinkName + " (" + tplinkPrice + "$)");
        System.out.println("2." + intelName + " (" + intelPrice + "$)");
        System.out.println("3." + asusName + " (" + asusPrice + "$)");
        System.out.println("0. Повернутися назад");

        switch (scanner.nextInt()) {
            case 1:
                networkAdapterName = tplinkName;
                networkAdapterPrice = tplinkPrice;
                System.out.println("\u001B[32mЗбережено!\u001B[0m");
                mainMenu();
                break;
            case 2:
                networkAdapterName = intelName;
                networkAdapterPrice = intelPrice;
                System.out.println("\u001B[32mЗбережено!\u001B[0m");
                mainMenu();
                break;
            case 3:
                networkAdapterName = asusName;
                networkAdapterPrice = asusPrice;
                System.out.println("\u001B[32mЗбережено!\u001B[0m");
                mainMenu();
                break;
            case 0:
                mainMenu();
                break;
            default:
                System.out.println("\u001B[31mНатисніть відповідну кнопку\u001B[0m");
                chooseNetworkAdapter();
        }
    }
}
