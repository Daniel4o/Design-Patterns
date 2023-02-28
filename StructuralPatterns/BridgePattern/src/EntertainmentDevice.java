
// Implementor
// With the Bridge Design Pattern you create 2 layers of abstraction
// In this example I'll have an abstract class representing
// different types of devices. I also have an abstract class
// that will represent different types of remote controls

// This allows me to use an infinite variety of devices and remotes

abstract class EntertainmentDevice {

    // deviceState is going to be either the current channel
    // the device is on or the current chapter for using the DVD
    public int deviceState;

    // maxSetting is going to be the max channel number
    // or the maximum chapter possible
    public int maxSetting;

    // represents volumeLevel for both classes
    public int volumeLevel = 0;

    public abstract void buttonFivePressed();
    public abstract void buttonSixPressed();

    public void deviceFeedback() {
        if (deviceState > maxSetting || deviceState < 0) {
            deviceState = 0;
            System.out.println("On " + deviceState);
        }
    }
    public void buttonSevenPressed() {
        volumeLevel++;
        System.out.println("Volume at: " + volumeLevel);
    }

    public void buttonEightPressed() {
        volumeLevel--;
        System.out.println("Volume at: " + volumeLevel);
    }

}
