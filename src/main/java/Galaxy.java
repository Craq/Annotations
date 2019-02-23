import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Galaxy {
    @Autowired
    @Qualifier("large")
    Battery battery;
    @Autowired
    @Qualifier("2k")
    Screen screen;
    @Autowired
    @Qualifier("snapdragon")
    CPU cpu;
    String name;
    public Galaxy(String name){
        this.name = name;
    }
    public void getPhoneInfo(){
        System.out.println("Name: "+name);
        battery.batteryInfo();
        screen.screenInfo();
        cpu.cpuInfo();
    }
}
