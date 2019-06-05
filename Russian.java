import javax.swing.JOptionPane;

public class Russian {

    public static String output = "";

    public static void main(String[] args) {

        output += "\n/nUsing the Russian Peasant Multiplication Algorithm\n\n";

        while (true) {
            long m = Long.parseLong(JOptionPane.showInputDialog("\nEnter an Integer e.g. 79"));
            long n = Long.parseLong(JOptionPane.showInputDialog("\nEnter an Integer e.g. 65"));
            long result = 0;

            output += "\n" + m +" * " + n + " = ";
            while (m > 0) {
                if(m % 2 != 0) {
                    result = result + n;
                }
                m = m / 2; n = n * 2;
            }
            output += " " + result;
            JOptionPane.showMessageDialog(null, output);
        }
    }
}
