class Solution {
    public double angleClock(int hour, int minutes) {
        hour%=12;
        double mA=minutes*6;
        double hA=hour*30+minutes*0.5;
        double diff=Math.abs(hA-mA);
        double minangle=Math.min(diff,360-diff);
        return minangle;
    }
}