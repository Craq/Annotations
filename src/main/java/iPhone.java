import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class iPhone {
    @Autowired
    @Qualifier(value="med")
    Battery battery;
    @Autowired
    @Qualifier("retina")
    Screen screen;
    @Autowired
    @Qualifier("bionic")
    CPU cpu;
    String name;
    iPhone(String name){
        this.name = name;
    }
    public void getPhoneInfo(){
        System.out.println("Name: "+name);
        battery.batteryInfo();
        screen.screenInfo();
        cpu.cpuInfo();
    }
}