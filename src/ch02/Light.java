package ch02;

public class Light {
    public static void main(String args[]) {
        final double light_speed = 3e5;
        double distance;

        distance = light_speed * 365 * 24 * 60 * 60;
        System.out.println("빛이 1년동안 가는거리 :" + distance + " km.");
    }
}
