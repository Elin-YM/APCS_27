public class StepTracker {

    private int stepsNeeded;
    private int ActiveDays=0;
    private int stepsTaken=0;
    private int TotalDays=0;
    public StepTracker(int stepsNeeded) {
        this.stepsNeeded = stepsNeeded;
    }
    public int activeDays()
    {
        return ActiveDays;
    }
    public double averageSteps()
    {
        if (TotalDays == 0)
        {
            return 0;
        }
        return (double) stepsTaken / TotalDays;
    }
    public void addDailySteps(int stepsToday)
    {
        stepsTaken += stepsToday;
        TotalDays++;
        if (stepsToday>=stepsNeeded)
        {
            ActiveDays++;
        }
    }


}