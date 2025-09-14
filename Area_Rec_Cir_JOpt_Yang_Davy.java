/*Addition to original Area of Rectangle code that 
 * will also calculate the are of a circle
 * Created by Davy Yang 14 SEP 2025
 */

import javax.swing.JOptionPane;

public class Area_Rec_Cir_JOpt_Yang_Davy
{
    public static void main(String[] args)
    {
    /*Options for user */
    String[] options = {"Rectangle", "Circle"};
    int choice = JOptionPane.showOptionDialog(null, "Select shape to calculate area",
    "Area Calculator", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

    if (choice == 0)
    {
        /*Rectangle selected */
        String lengthStr = JOptionPane.showInputDialog("Enter rectangle length:");
        String widthStr = JOptionPane.showInputDialog("Enter rectangle width:");
        double length = Double.parseDouble(lengthStr);
        double width = Double.parseDouble(widthStr);
        double area = length * width;
        JOptionPane.showMessageDialog(null, "The area of the rectangle is: " + area);
    }
    else if (choice == 1) 
    {
        String radiusStr = JOptionPane.showInputDialog("Enter circle radius:");
        double radius = Double.parseDouble(radiusStr);
        double area = Math.PI * radius * radius;
        JOptionPane.showMessageDialog(null, "The area of the circle is: " + area);   
    }
    else
    {
        JOptionPane.showMessageDialog(null, "No selection made. Program will close.");
    }
    }

}

