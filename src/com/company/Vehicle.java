package com.company;

public class Vehicle {
    private int rpm;
    private int speed;
    private int gears;         // number of gears
    private int currentGear;   // what gear the car is in currently

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "rpm=" + rpm +
                ", speed=" + speed +
                ", gears=" + gears +
                ", currentGear=" + currentGear +
                '}';
    }

    public Vehicle(int rpm, int speed, int gears, int currentGear) {
        this.rpm = rpm;
        this.speed = speed;
        this.gears = gears;
        this.currentGear = currentGear;
    }

    public void accelerate(int changeVelocity) {
        this.speed += changeVelocity;
        if (changeVelocity > 0) {
            rpm += 350;
        } else {
            rpm -= 350;
        }
        if (this.rpm > 2700) {
            if (this.currentGear < this.gears) {
                this.currentGear++;
                this.rpm = 2600;
            } else if (this.currentGear == this.gears && rpm > 2900) {
                System.out.println("slow down!\n");
            }
        } else if (rpm < 2300) {
            if (this.currentGear > 1) {
                this.currentGear--;
                this.rpm = 2600;
            }
        }
        System.out.println("Speed:\t\t\t" + this.speed + "\n" +
                "Current Gear:\t" + this.currentGear + "\n" +
                "RPM:\t\t\t" + this.rpm + "\n");

    }
}
