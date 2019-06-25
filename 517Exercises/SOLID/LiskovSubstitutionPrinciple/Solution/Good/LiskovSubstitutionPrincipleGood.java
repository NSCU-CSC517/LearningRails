public class LiskovSubstitutionPrincipleGood {
    public static void main (String[] args) {
        ComputerUpgrader upgrader = new ComputerUpgrader();
        DesktopComputer desktopPC = new DesktopComputer();
        Phone phone = new Phone();

        System.out.println("Before the OS update and RAM upgrade: ");
        printInfo(desktopPC, phone);

        upgrader.upgradeOS(desktopPC);
        upgrader.upgradeRAM(desktopPC);
        upgrader.upgradeOS(phone);
        // Following is not applicable
        // upgrader.upgradeRAM(phone);

        System.out.println("After the OS update and RAM upgrade: ");
        printInfo(desktopPC, phone);

    }

    static void printInfo(Computer desktopPC, Computer phone) {
        System.out.println("Desktop Computer has OS version: " + desktopPC.os_version + ", and amount of RAM: " +
                desktopPC.amount_of_ram + " GB.");
        System.out.println("Phone has OS version: " + phone.os_version + ", and amount of RAM: " + phone.amount_of_ram +
                " GB.");
    }
}
