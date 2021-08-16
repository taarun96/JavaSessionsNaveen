package OOPS_Encapsulation;

public class GoogleChrome {

    public void launchChrome() {
        System.out.println("checking google Chrome");
        //ATM Machine
        checkOSCompatibility();
        checkBrowserVersion();
        checkWindowsRAM();
        checkChromeUpdates();

        System.out.println(" google Chrome launched");

    }

    private void checkOSCompatibility() {
        System.out.println("checkOSCompatibility");
    }

    private void checkBrowserVersion() {
        System.out.println("checkBrowserVersion");

    }

    private void checkWindowsRAM() {
        System.out.println("checkWindowsRAM");

    }

    private void checkChromeUpdates() {
        System.out.println("checkChromeUpdates");

    }
}
