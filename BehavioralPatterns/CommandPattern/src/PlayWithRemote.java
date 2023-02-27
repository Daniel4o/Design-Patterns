import java.util.ArrayList;
import java.util.List;

public class PlayWithRemote {

    public static void main(String[] args) {

        ElectronicDevice newDevice = TVRemote.getDevice();

        TurnTVOn onCommand = new TurnTVOn(newDevice);
        DeviceButton onPressed = new DeviceButton(onCommand);
        onPressed.press();

        TurnTVUp volumeUpCommand = new TurnTVUp(newDevice);
        onPressed = new DeviceButton(volumeUpCommand);

        onPressed.press();
        onPressed.press();
        onPressed.press();


        TurnTVOff offCommand = new TurnTVOff(newDevice);
        DeviceButton offPressed = new DeviceButton(offCommand);
        offPressed.press();

        Television theTV = new Television();
        Radio theRadio = new Radio();

        List<ElectronicDevice> allDevices = new ArrayList<ElectronicDevice>();

        allDevices.add(theTV);
        allDevices.add(theRadio);

        TurnItAllOff turnOffDevices = new TurnItAllOff(allDevices);
        DeviceButton turnThemOff = new DeviceButton(turnOffDevices);
        turnThemOff.press();

        turnThemOff.pressUndo();

    }

}
