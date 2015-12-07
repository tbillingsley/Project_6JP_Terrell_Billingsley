
package billingsley_pkg;

import java.text.NumberFormat;
import java.util.ArrayList;
public class ScoreAccumulator {
    //declare instance variable
    private double score;
    private static double total, bestScore;
    private static int numOfScores;
    private static ArrayList arrList = new ArrayList();
    
    //constructor: same as your class name
    public ScoreAccumulator (double score)
    {
        this.score = score;
        numOfScores++;
        total+=score; //total=total+score
        arrList.add(this.score); 
    }
    public String getBestScore()
    {
        if (score>bestScore)
        {
            //swap the values
            bestScore = score;
        }
        //convert to numeric string
        String s = getFormattedString(bestScore);
        return s;
    }
    public String getFormattedString(double d)
    {
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(2);
        String s = nf.format(d);
        return s;
    }
    public String getNumScores()
    {
        String s = getFormattedString(numOfScores);
        return s;
    }
    public String getAvgScore()
    {
        double avg = total/numOfScores;
        String s = getFormattedString(avg);
        return s;
    }
    public static String getScoreList()
    {
        String s = "";
        for (int i=0; i<arrList.size(); i++)
        {
            s+=(i+1+ ""+arrList.get (1).toString()+"\n");
        }
        return s;
    }
    public static void clearScores()
    {
        bestScore = 0;
        total = 0;
        numOfScores = 0;
        arrList.clear();          
    }
    
}
