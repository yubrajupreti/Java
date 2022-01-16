public class CurvedActivity extends GradeActivity
{
    private double rawscore;
    private double percentage;
    
    public CurvedActivity(double percent)
    {
        this.percentage=percent;
    }
    void setScore(double s)
    {
        this.rawscore=s;
    }
    double getRawScore()
    {
        return this.rawscore;
    }
    double getPercentage()
    {
        this.percentage=percentage;
    }
}