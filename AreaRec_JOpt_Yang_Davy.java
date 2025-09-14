/*
 * This program calculates the area of a rectangle
 * Created by Davy Yang 13 SEP 2024
 */
import javax.swing.JOptionPane;
public class AreaRec_JOpt_Yang_Davy
{
    public static void main(String[] args){
    /* length input from user */
    String lengthStr = JOptionPane.showInputDialog("Enter the length of the rectangle: ");
    double length = Double.parseDouble(lengthStr);

    /* width input from user */
    String widthStr = JOptionPane.showInputDialog("Enter the width of the rectangle: ");
    double width = Double.parseDouble(widthStr);

    double area = length * width;

    JOptionPane.showMessageDialog(null, "The area of the rectangle is: " + area);
    }
 
}
