package memento;

import memento.app_smart.SmartApp;
import memento.app_smart.SmartAppCaretaker;
import memento.backup.OperatingSystem;
import memento.backup.OperatingSystemCaretaker;

public class Main {
  public static void main(String[] args) throws InterruptedException {

    SmartAppCaretaker smartAppCaretaker = new SmartAppCaretaker();
    SmartApp smartApp = new SmartApp();

    smartApp.changeVersion(1.0);
    smartApp.changeVersion(1.1);
    smartApp.changeVersion(1.2);

    smartAppCaretaker.addMemento(smartApp.save());

    smartApp.changeVersion(2.0);
    smartApp.changeVersion(2.1);

    smartApp.load(smartAppCaretaker.getMemento(0));

    OperatingSystemCaretaker operatingSystemCaretaker = new OperatingSystemCaretaker();
    OperatingSystem operatingSystem = new OperatingSystem();
    operatingSystem.createBackup();
    Thread.sleep(3000);
    operatingSystem.createBackup();
    Thread.sleep(3000);
    operatingSystemCaretaker.addMemento(operatingSystem.save());
    operatingSystem.createBackup();
    Thread.sleep(3000);
    operatingSystem.createBackup();
    Thread.sleep(3000);
    operatingSystem.load(operatingSystemCaretaker.getMemento());

  }
}
