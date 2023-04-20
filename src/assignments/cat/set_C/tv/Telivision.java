/**
 * @file Telivision.java
 * @author KUSHAGRA JAISWAL 
 * @date 2023-04-20
 * @copyright Copyright (c) 2023
 */

/*
A television set is characterized by its channels, its volume levels and whether it is on or it is off. The instance variables are
channel number, volume level and on/off state. The television class has a zero argument constructor, a method to turn it on or
off, a method to set its channel, and another method to set its volume level, a method for channel up and another method for
channel down and a method for volume up and another method for volume down. Implement the TV class in a package and
implement a driver class in another package to test the TV class creating an object of TV class. The information about a TV is
entered interactively through keyboard. A TV has 10000 channels and its volume may vary from level one to level ten. The
necessary validation should be performed for change of channel and change of volume. 
 */
package src.assignments.cat.set_C.tv;

import java.util.Scanner;

public class Telivision {
    int channel_number;
    int volume_level;
    boolean on;

    public Telivision() {
    }

    public void trunOn(boolean on) {
        if (this.on == true) {
            System.out.println("Telivision is on!");
        } else {
            System.out.println("Telivision is off!");
        }
    }

    public void setChannel(int channel_number) {
        this.channel_number = channel_number;
    }

    public void setVolume(int volume_level) {
        this.volume_level = volume_level;
    }

    public void channelUp() {
        System.out.println(this.channel_number + 1);
    }

    public void channelDown() {
        System.out.println(this.channel_number - 1);
    }

    public void volumeUp() {
        System.out.println(this.volume_level + 1);
    }

    public void volumeDown() {
        System.out.println(this.volume_level - 1);
    }
}
