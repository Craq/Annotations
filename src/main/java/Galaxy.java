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
    String os;
    String name;
    public Galaxy(String name){
        this.name = name;
    }
    public void setOs(String os){
        this.os = os;
    }
    public String getOs(){
        return this.os;
    }
    public void getPhoneInfo(){
        System.out.println("Name: "+name);
        battery.batteryInfo();
        screen.screenInfo();
        cpu.cpuInfo();
    }
}
