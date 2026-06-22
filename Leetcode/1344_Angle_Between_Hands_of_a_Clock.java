class Solution {
    final double HR_MOVEMENT_PM = 0.5;
    final double HR_SEG_ANG = 30;
    final double MN_SEG_ANG = 6;

    public double angleClock(int hour, int minutes) 
    {
        hour %= 12;
        double hrPos = (hour*HR_SEG_ANG) + (minutes*HR_MOVEMENT_PM);
        double minPos = (minutes*MN_SEG_ANG);

        double res = (hrPos > minPos) ? (hrPos - minPos) : (minPos - hrPos);

        return Math.min(res, 360-res);
    }
}
