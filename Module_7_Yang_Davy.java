/* Final Project - Program to calculate cost to rent tables and chairs for a wedding
Written by Davy Yang 30 NOV 2025 */
import javax.swing.JOptionPane;

public class Module_7_Yang_Davy
{
    public static void main(String[] args)
    {
        double tablePrice = 20.00;
        double chairPrice = 10.00;

        while (true)
        {
            String[] rentalOptions = {"Tables", "Chairs"};
            int rentalChoice = JOptionPane.showOptionDialog(null, "What would you like to rent?", "Wedding rental calculator", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, rentalOptions, rentalOptions[0]);

            if (rentalChoice == -1)
            {
                JOptionPane.showMessageDialog(null, "No selection made; Program will close.");
                return;
            }

            double totalCost = 0;
            int quantity = 0;

            //*Table Rental*/
            if (rentalChoice == 0)
            {
                String qtyStr = JOptionPane.showInputDialog("Enter number of tables to rent ($20 each): ");

                if (qtyStr == null) return;
                quantity = Integer.parseInt(qtyStr);

                for (int i = 1; i <= quantity; i++)
                {}

                totalCost = quantity * tablePrice;

                JOptionPane.showMessageDialog(null, "You ordered: " + quantity + "tables\n" + "Total Cost: $" + totalCost);
            }

            //*Chair Rental*//
            else if (rentalChoice == 1)
            {
                String qtyStr = JOptionPane.showInputDialog("Enter number of chairs to rent ($10 each): ");

                if (qtyStr == null) return;
                quantity = Integer.parseInt(qtyStr);

                for (int i = 1; i <= quantity; i++)
                {}

                totalCost = quantity * chairPrice;

                JOptionPane.showMessageDialog(null, "You ordered: " + quantity + "chairs\n" + "Total cost: $" + totalCost);

                //*Run Again*//
                int again = JOptionPane.showConfirmDialog(null, "Would you like to calculate another rental?", "Continue?", JOptionPane.YES_NO_OPTION);

                if (again != JOptionPane.YES_OPTION)
                {
                    JOptionPane.showMessageDialog(null, "Goodbye!");
                    break;
                }
            }
        }
    }
}