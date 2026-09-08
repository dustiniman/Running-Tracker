public class Run {
    private String runName;
    private double miles;
    private int minutes;
    private boolean isTrailRun; //making it true if ona trail and false otherwise

    public Run()
    {
        this.runName = "Default Run";
        this.miles = 0.0;
        this.minutes = 0;
        this.isTrailRun = false;
    }

    public Run(String runName, double miles, int minutes, boolean isTrailRun)
    {
        this.runName = runName;
        this.miles = miles;
        this.minutes = minutes;
        this.isTrailRun = isTrailRun;
    }

    public String getRunName()
    {
        return this.runName;
    }

    public void setRunName(String runName) 
    {
        this.runName = runName;
    }
    public double getMiles() 
    {
        return this.miles;
    }
    public void setMiles(double miles) 
    {
        if (miles >= 0) // Basic student-level validation
        {
            this.miles = miles;
        }
    }
    public int getMinutes() 
    {
        return this.minutes;
    }
    public void setMinutes(int minutes) 
    {
        if (minutes >= 0) 
        {
            this.minutes = minutes;
        }
    }
    public boolean getIsTrailRun() 
    {
        return this.isTrailRun;
    }
    public void setIsTrailRun(boolean isTrailRun) 
    {
        this.isTrailRun = isTrailRun;
    }


    public void setAll(String runName, double miles, int minutes, boolean isTrailRun) 
    {
        this.setRunName(runName);
        this.setMiles(miles);
        this.setMinutes(minutes);
        this.setIsTrailRun(isTrailRun);
    }
    public String toString() 
    {
        String trailStatus;
        if (this.isTrailRun)
        {
            trailStatus = "Trail";
        }
        else 
        {
            trailStatus = "Road/Treadmill";
        }
        return "Run Type: " + this.runName + ", Distance: " + this.miles + " miles, Duration: " + this.minutes + " mins, Terrain: " + trailStatus;
    }
    public boolean equals(Run otherRun)
    {



        if (otherRun == null)
        {
            return false;
        }
        return this.runName.equals(otherRun.getRunName()) &&
        this.miles == otherRun.getMiles() &&
        this.minutes == otherRun.getMinutes() &&
        this.isTrailRun == otherRun.getIsTrailRun();
    }



}
