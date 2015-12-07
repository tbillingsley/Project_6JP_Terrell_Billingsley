/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package billingsley_pkg;

import javax.swing.*;
/**
 *
 * @author BA201
 */
public class Validator {
    public static void displayMessage(JTextField j, String prompt)
    {
        JOptionPane.showMessageDialog(j, prompt, "ERROR", JOptionPane.INFORMATION_MESSAGE);
        j.requestFocusInWindow();
    }
    public static boolean isPresent(JTextField j)
    {
        if (j.getText().equals("") || j.getText() == null)
        {
            displayMessage(j, "You must enter a value for test scores!");
            return false;
        }
        return true;
    }
    public static boolean isValidDouble(JTextField j)
    {
        if (isPresent(j))
        {
            try
            {
                double d = Double.parseDouble(j.getText());
                return true;
            }
            catch (NumberFormatException e)
            {
                displayMessage(j, "You must enter a valid score!");
            }
        }
        return false;
    }
    public static boolean isWithinRange(JTextField j, int min, int max)
    {
        if (isValidDouble(j))
        {
            double d = Double.parseDouble(j.getText());
            if (d<=max && d>=min)
            {
                return true;
            }
            displayMessage(j, "The score must be between " + min + " and " + max + "!");
        }
        return false;
    }
}
